package jiwoo.openstack.keystone.users.applicationcredentials.v3_10;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.keystone.users.applicationcredentials.AbstractApplicationCredentialsResponse;

public class ApplicationCredentialsResponse extends AbstractApplicationCredentialsResponse {

	@Override
	protected JSONObject setResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
		// TODO Auto-generated method stub
		String response = baseHandleResponse(httpResponse);
		JSONObject jResponse = null;

		if (postResponseMethod != null) {
			try {
				jResponse = (JSONObject) CommonUtil.executeMethod(this, postResponseMethod, response);
			} catch (Exception e) {
				e.printStackTrace();
				jResponse = new JSONObject(response);
			}
		} else {
			jResponse = new JSONObject(response);
		}

		return jResponse;
	}

	@Override
	protected JSONObject createApplicationCredential(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod createApplicationCredential");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getApplicationCredentials(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getApplicationCredentials");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getApplicationCredential(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getApplicationCredential");
		return new JSONObject(response);
	}

	protected JSONObject deleteApplicationCredential(String response) {
		System.out.println("Call TestMethod deleteApplicationCredential");
		return new JSONObject(response);
	}
}
