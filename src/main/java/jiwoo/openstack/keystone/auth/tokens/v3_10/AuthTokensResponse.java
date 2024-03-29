package jiwoo.openstack.keystone.auth.tokens.v3_10;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.keystone.auth.tokens.AbstractAuthTokensResponse;
import jiwoo.openstack.rest.APIKey;

public class AuthTokensResponse extends AbstractAuthTokensResponse {

	private APIKey apiKey = null;

	@Override
	public APIKey getAPIKey() {
		// TODO Auto-generated method stub
		return apiKey;
	}

	@Override
	public String handleResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
		// TODO Auto-generated method stub

		Header[] header = httpResponse.getHeaders("X-Subject-Token");
		if (header != null && header.length > 0) {
			apiKey = new APIKey();
			apiKey.setToken(header[0].getValue());
		}

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

	protected JSONObject passwordAuthWithUnscope(String response) {
		System.out.println("Call TestMethod passwordAuthWithUnscope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithSystemScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithSystemScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithDomainIdScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithDomainIdScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithDomainNameScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithDomainNameScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithProjectIdScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithProjectIdScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithProjectNameScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithProjectNameScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject passwordAuthWithExplicitUnscope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod passwordAuthWithExplicitUnscope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithUnscope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithUnscope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithSystemScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithSystemScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithDomainIdScope(String response) {
		System.out.println("Call TestMethod tokenAuthWithDomainIdScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithDomainNameScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithDomainNameScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithProjectIdScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithProjectIdScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithProjectNameScope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithProjectNameScope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject tokenAuthWithExplicitUnscope(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod tokenAuthWithExplicitUnscope");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject applicationCridential(String response) {
		System.out.println("Call TestMethod applicationCridential");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getTokenInfo(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getTokenInfo");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject validateToken(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod validateToken - " + response);
		JSONObject jResponse = new JSONObject();
		jResponse.put("status", "success");

		return jResponse;
	}

	@Override
	protected JSONObject deleteToken(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod deleteToken - " + response);
		JSONObject jResponse = new JSONObject();
		jResponse.put("status", "success");

		return jResponse;
	}

}
