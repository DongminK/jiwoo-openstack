package jiwoo.openstack.wrapping.keystone.restapi;

import org.apache.http.impl.client.BasicResponseHandler;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.wrapping.keystone.KeystoneUtil;
import jiwoo.openstack.wrapping.keystone.RestHandler;
import jiwoo.openstack.wrapping.keystone.request.RestRequest;
import jiwoo.openstack.wrapping.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.wrapping.keystone.response.auth.tokens.IAuthTokensResponse;

public class AuthTokens extends RestHandler {

	private Logger logger = LoggerFactory.getLogger(AuthTokens.class);

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return keystoneInfo.getUrl() + "/" + restRequest.getUrl();
	}

	@Override
	public IAuthTokensRequest getRequest() {
		// TODO Auto-generated method stub
		return (IAuthTokensRequest) restRequest;
	}

	@Override
	public IAuthTokensResponse getResponse() {
		// TODO Auto-generated method stub
		return (IAuthTokensResponse) basicResponseHandler;
	}

	protected void setRequest() throws Exception {
		this.restRequest = (RestRequest) KeystoneUtil.getClassByVersion(IAuthTokensRequest.class, keystoneInfo);
	}

	protected void setResponse() throws Exception {
		this.basicResponseHandler = (BasicResponseHandler) KeystoneUtil.getClassByVersion(IAuthTokensResponse.class,
				keystoneInfo);
	}

	@Override
	protected String execute() throws Exception {
		// TODO Auto-generated method stub
		JSONObject data = restRequest.toJsonObject();

		String result = RestAPI.post(null, getUrl(), data, basicResponseHandler);
		logger.info("[RESULT][" + keystoneInfo.getVer() + "] " + result);
		logger.info(
				"[TOKEN][" + keystoneInfo.getVer() + "] " + ((IAuthTokensResponse) basicResponseHandler).getAPIKey().getToken());

		return result;

	}

}
