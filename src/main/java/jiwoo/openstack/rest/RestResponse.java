package jiwoo.openstack.rest;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.apache.http.impl.client.BasicResponseHandler;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;

public abstract class RestResponse extends BasicResponseHandler {

	protected JSONObject jResponse = null;
	protected String responseMethodName = null;

	@Override
	public String handleResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException {

		String response = baseHandleResponse(httpResponse);

		if (responseMethodName != null) {
			try {
				jResponse = (JSONObject) CommonUtil.executeMethod(this, responseMethodName, response);
			} catch (Exception e) {
				e.printStackTrace();
				jResponse = new JSONObject(response);
			}
		} else {
			jResponse = new JSONObject(response);
		}

		return toJsonString();
	}

	public JSONObject toJsonObject() {
		return jResponse;
	}

	public String toJsonString() {
		return jResponse.toString();
	}

	public final String baseHandleResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException {
		return super.handleResponse(httpResponse);
	}

	public final void setResponseMethodName(String responseMethodName) {
		this.responseMethodName = responseMethodName;
	}

}
