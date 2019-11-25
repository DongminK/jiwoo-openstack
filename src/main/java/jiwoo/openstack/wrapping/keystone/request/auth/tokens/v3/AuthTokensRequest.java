package jiwoo.openstack.wrapping.keystone.request.auth.tokens.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3.Auth;

public class AuthTokensRequest implements IAuthTokensRequest {

	private JSONObject jData = null;

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "v3/" + URL;
	}

	public void passwordAuthWithUnscopeAuthorization(String domain, String name, String password) {
		jData = Auth.passwordAuthWithUnscopeAuthorization(domain, name, password);
	}

	public void passwordAuthWithScopeAuthorization(String id, String password, boolean isAll) {
		jData = Auth.passwordAuthWithScopeAuthorization(id, password, isAll);
	}

	public void passwordAuthWithScopeAuthorization(String domainId, String id, String password) {
		jData = Auth.passwordAuthWithScopeAuthorization(domainId, id, password);
	}

	public JSONObject toJsonObject() {
		return jData;
	}

	public String toJsonString() {
		return jData.toString();
	}
}
