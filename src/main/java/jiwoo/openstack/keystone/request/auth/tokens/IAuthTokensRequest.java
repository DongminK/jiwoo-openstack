package jiwoo.openstack.keystone.request.auth.tokens;

import jiwoo.openstack.rest.RestRequest;

public interface IAuthTokensRequest extends RestRequest {

	void passwordAuthWithUnscopeAuthorization(String domain, String name, String password);

	void passwordAuthWithScopeAuthorization(String id, String password, boolean isAll);

	void passwordAuthWithScopeAuthorization(String domainId, String id, String password);
}
