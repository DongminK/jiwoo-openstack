package jiwoo.openstack.keystone.restapi;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.keystone.KeystoneConstants;
import jiwoo.openstack.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.keystone.response.auth.tokens.AbstractAuthTokensResponse;
import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class AuthTokens extends RestHandler {

	private Logger logger = LoggerFactory.getLogger(AuthTokens.class);

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return KeystoneConstants.AUTH_TOKENS;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getRequestClass() {
		// TODO Auto-generated method stub
		return IAuthTokensRequest.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getResponseClass() {
		// TODO Auto-generated method stub
		return AbstractAuthTokensResponse.class;
	}

	@Override
	public IAuthTokensRequest getRequest() {
		// TODO Auto-generated method stub
		return (IAuthTokensRequest) restRequest;
	}

	@Override
	public AbstractAuthTokensResponse getResponse() {
		// TODO Auto-generated method stub
		return (AbstractAuthTokensResponse) restResponse;
	}

	@Override
	protected String execute() throws Exception {
		// TODO Auto-generated method stub
		JSONObject data = restRequest.toJsonObject();
		restResponse.setPostResponseMethod(restRequest.getPostResponseMethod());

		HashMap<String, String> mapHeaders = new HashMap<String, String>();
		APIKey apiKey = openstack.getApiKey();

		if (apiKey != null) {
			mapHeaders.put("X-Auth-Token", apiKey.getToken());
		}

		HashMap<String, String> mapReqHeaders = restRequest.getHeaders();

		if (mapReqHeaders != null) {
			mapHeaders.putAll(mapReqHeaders);
		}

		if (restRequest.getHttpMethod().equals(HttpPost.METHOD_NAME)) {

			RestAPI.post(mapHeaders, getUrl(), data, restResponse);
			apiKey = getResponse().getAPIKey();

			if (apiKey != null)
				openstack.getApiKey().setToken(apiKey.getToken());

		} else if (restRequest.getHttpMethod().equals(HttpGet.METHOD_NAME)) {

			String params = "";
			if (data.has("params"))
				params = data.getString("params");

			RestAPI.get(mapHeaders, getUrl() + "?" + params, restResponse);
		} else if (restRequest.getHttpMethod().equals(HttpHead.METHOD_NAME)) {

			RestAPI.head(mapHeaders, getUrl(), restResponse);

		}

		return restResponse.toJsonString();

	}

}
