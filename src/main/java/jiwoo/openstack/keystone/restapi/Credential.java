package jiwoo.openstack.keystone.restapi;

import java.util.HashMap;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.KeystoneConstants;
import jiwoo.openstack.keystone.credentials.AbstractCredentialsRequest;
import jiwoo.openstack.keystone.credentials.AbstractCredentialsResponse;
import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class Credential extends RestHandler {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return KeystoneConstants.CREDENTIAL;
	}

	@Override
	public AbstractCredentialsRequest getRequest() {
		// TODO Auto-generated method stub
		return (AbstractCredentialsRequest) restRequest;
	}

	@Override
	public AbstractCredentialsResponse getResponse() {
		// TODO Auto-generated method stub
		return (AbstractCredentialsResponse) restResponse;
	}

	@Override
	protected Class<AbstractCredentialsRequest> getRequestClass() {
		// TODO Auto-generated method stub
		return AbstractCredentialsRequest.class;
	}

	@Override
	protected Class<AbstractCredentialsResponse> getResponseClass() {
		// TODO Auto-generated method stub
		return AbstractCredentialsResponse.class;
	}

	@Override
	protected String execute() throws Exception {
		// TODO Auto-generated method stub
		JSONObject data = restRequest.toJsonObject();
		restResponse.setResponseMethodName(restRequest.getResponseMethodName());

		HashMap<String, String> mapHeaders = new HashMap<String, String>();
		APIKey apiKey = openstack.getApiKey();

		if (apiKey != null) {
			mapHeaders.put("X-Auth-Token", apiKey.getToken());
		}

		HashMap<String, String> mapReqHeaders = restRequest.getHeaders();

		if (mapReqHeaders != null) {
			mapHeaders.putAll(mapReqHeaders);
		}

		String url = getUrl();

		if (data.has("uris")) {
			JSONObject jUris = data.getJSONObject("uris");
			for (String key : jUris.keySet()) {
				url = url.replace("{" + key + "}", jUris.getString(key));
			}

			data.remove("uris");
		}

		if (restRequest.getHttpMethod().equals(HttpPost.METHOD_NAME)) {

			RestAPI.post(mapHeaders, getUrl(), data, restResponse);

		} else if (restRequest.getHttpMethod().equals(HttpGet.METHOD_NAME)) {

			String params = "";
			if (data.has("params"))
				params = data.getString("params");

			RestAPI.get(mapHeaders, getUrl() + "?" + params, restResponse);
		} else if (restRequest.getHttpMethod().equals(HttpPatch.METHOD_NAME)) {

			RestAPI.patch(mapHeaders, getUrl(), restResponse);

		} else if (restRequest.getHttpMethod().equals(HttpDelete.METHOD_NAME)) {

			RestAPI.delete(mapHeaders, getUrl(), restResponse);

		}

		return restResponse.toJsonString();
	}

}
