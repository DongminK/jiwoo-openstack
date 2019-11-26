package jiwoo.openstack.keystone.request.auth.tokens.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.keystone.request.auth.tokens.v3_10.params.Auth;

public class AuthTokensRequest implements IAuthTokensRequest {

	private JSONObject jData = null;
	private String method = HttpGet.METHOD_NAME;
	private String postResponseMethod = null;

	@Override
	public String getHttpMethod() {
		// TODO Auto-generated method stub
		return method;
	}

	@Override
	public String getPostResponseMethod() {
		return postResponseMethod;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/tokens";
	}

	public void passwordAuthWithUnscopeAuthorization(String domain, String name, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithUnscopeAuthorization";
		jData = Auth.passwordAuthWithUnscopeAuthorization(domain, name, password);
	}

	public void passwordAuthWithScopeAuthorization(String id, String password, boolean isAll) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithScopeAuthorization";
		jData = Auth.passwordAuthWithScopeAuthorization(id, password, isAll);
	}

	public void passwordAuthWithScopeAuthorization(String domainId, String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithScopeAuthorization";
		jData = Auth.passwordAuthWithScopeAuthorization(domainId, id, password);
	}

	public JSONObject toJsonObject() {
		return jData;
	}

	public String toJsonString() {
		return jData.toString();
	}

}
