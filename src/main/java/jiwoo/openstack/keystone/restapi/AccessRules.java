package jiwoo.openstack.keystone.restapi;

import java.util.HashMap;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.keystone.KeystoneConstants;
import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesRequest;
import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesResponse;
import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class AccessRules extends RestHandler {

	private Logger logger = LoggerFactory.getLogger(ApplicationCredentials.class);

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return KeystoneConstants.ACCESS_RULES;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getRequestClass() {
		// TODO Auto-generated method stub
		return AbstractAccessRulesRequest.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getResponseClass() {
		// TODO Auto-generated method stub
		return AbstractAccessRulesResponse.class;
	}

	@Override
	public AbstractAccessRulesRequest getRequest() {
		// TODO Auto-generated method stub
		return (AbstractAccessRulesRequest) restRequest;
	}

	@Override
	public AbstractAccessRulesResponse getResponse() {
		// TODO Auto-generated method stub
		return (AbstractAccessRulesResponse) restResponse;
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

		if (restRequest.getHttpMethod().equals(HttpGet.METHOD_NAME)) {

			RestAPI.get(mapHeaders, url, restResponse);

		} else if (restRequest.getHttpMethod().equals(HttpDelete.METHOD_NAME)) {

			RestAPI.delete(mapHeaders, url, restResponse);

		}

		return restResponse.toJsonString();

	}

}
