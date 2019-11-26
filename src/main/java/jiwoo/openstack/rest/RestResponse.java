package jiwoo.openstack.rest;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.apache.http.impl.client.BasicResponseHandler;
import org.json.JSONObject;

public abstract class RestResponse extends BasicResponseHandler {

	protected JSONObject jResponse = null;
	protected String postResponseMethod = null;

	@Override
	public String handleResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException {
		jResponse = setResponse(httpResponse);
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

	public final void setPostResponseMethod(String postResponseMethod) {
		this.postResponseMethod = postResponseMethod;
	}

	abstract protected JSONObject setResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException;

}
