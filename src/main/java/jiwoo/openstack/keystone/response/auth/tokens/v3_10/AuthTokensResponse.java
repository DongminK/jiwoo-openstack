package jiwoo.openstack.keystone.response.auth.tokens.v3_10;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.keystone.response.auth.tokens.AbstractAuthTokensResponse;
import jiwoo.openstack.rest.APIKey;

public class AuthTokensResponse extends AbstractAuthTokensResponse {

	private APIKey apiKey = null;

	@Override
	public APIKey getAPIKey() {
		// TODO Auto-generated method stub
		return apiKey;
	}

	@Override
	protected JSONObject setResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
		// TODO Auto-generated method stub

		Header[] header = httpResponse.getHeaders("X-Subject-Token");
		if (header != null && header.length > 0) {
			apiKey = new APIKey(header[0].getValue());
		}

		String response = baseHandleResponse(httpResponse);
		JSONObject jResponse = null;

		if (postResponseMethod != null) {
			try {
				jResponse = (JSONObject) CommonUtil.executeMethod(this, postResponseMethod, response);
			} catch (Exception e) {
				e.printStackTrace();
				jResponse = new JSONObject(response);
			}
		}

		return jResponse;
	}

	protected JSONObject passwordAuthWithUnscopeAuthorization(String response) {
		System.out.println("Call TestMethod passwordAuthWithUnscopeAuthorization");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithScopeAuthorization(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithScopeAuthorization");
		return new JSONObject(response);
	}

}
