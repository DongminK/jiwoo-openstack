package jiwoo.openstack.wrapping.keystone.request.auth.tokens;

import jiwoo.openstack.wrapping.keystone.request.RestRequest;

public interface IAuthTokensRequest extends RestRequest {

	String URL = "auth/tokens";

	void passwordAuthWithUnscopeAuthorization(String domain, String name, String password);

	void passwordAuthWithScopeAuthorization(String id, String password, boolean isAll);

	void passwordAuthWithScopeAuthorization(String domainId, String id, String password);
}
