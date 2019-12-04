package jiwoo.openstack.keystone.restapi;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.KeystoneConstants;
import jiwoo.openstack.keystone.request.auth.domains.IAuthDomainsRequest;
import jiwoo.openstack.keystone.response.auth.domains.AbstractAuthDomainsResponse;
import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class AuthDomains extends RestHandler {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return KeystoneConstants.AUTH_DOMAINS;
	}

	@Override
	public IAuthDomainsRequest getRequest() {
		// TODO Auto-generated method stub
		return (IAuthDomainsRequest) restRequest;
	}

	@Override
	public AbstractAuthDomainsResponse getResponse() {
		// TODO Auto-generated method stub
		return (AbstractAuthDomainsResponse) restResponse;
	}

	@Override
	protected Class getRequestClass() {
		// TODO Auto-generated method stub
		return IAuthDomainsRequest.class;
	}

	@Override
	protected Class getResponseClass() {
		// TODO Auto-generated method stub
		return AbstractAuthDomainsResponse.class;
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

		if (restRequest.getHttpMethod().equals(HttpGet.METHOD_NAME)) {

			String params = "";
			if (data.has("params"))
				params = data.getString("params");

			RestAPI.get(mapHeaders, getUrl() + "?" + params, restResponse);
		}

		return restResponse.toJsonString();
	}

}
