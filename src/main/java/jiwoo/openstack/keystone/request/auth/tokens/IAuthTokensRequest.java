package jiwoo.openstack.keystone.request.auth.tokens;

import jiwoo.openstack.rest.RestRequest;

public interface IAuthTokensRequest extends RestRequest {

	void passwordAuthWithUnscope(String domain, String name, String password);

	void passwordAuthWithSystemScope(String id, String password, boolean isAll);

	void passwordAuthWithDomainIdScope(String domainId, String id, String password);

	void passwordAuthWithDomainNameScope(String domainName, String id, String password);

	void passwordAuthWithProjectIdScope(String projectId, String id, String password);

	void passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password);

	void passwordAuthWithExplicitUnscope(String id, String password);

	void tokenAuthWithUnscope(String tokenId);

	void tokenAuthWithSystemScope(String tokenId, boolean isAll);

	void tokenAuthWithDomainIdScope(String tokenId, String domainId);

	void tokenAuthWithDomainNameScope(String tokenId, String domainName);

	void tokenAuthWithProjectIdScope(String tokenId, String projectId);

	void tokenAuthWithProjectNameScope(String tokenId, String projectName, String domainId);
	
	void tokenAuthWithExplicitUnscope(String tokenId);
	
	void validateToken(String token);
	
	void checkToken(String token);
	
}
