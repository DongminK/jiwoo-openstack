package jiwoo.openstack.keystone.auth.tokens;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAuthTokensRequest extends RestRequest {

	abstract public void passwordAuthWithUnscope(String domain, String name, String password);

	abstract public void passwordAuthWithSystemScope(String id, String password, boolean isAll);

	abstract public void passwordAuthWithDomainIdScope(String domainId, String id, String password);

	abstract public void passwordAuthWithDomainNameScope(String domainName, String id, String password);

	abstract public void passwordAuthWithProjectIdScope(String projectId, String id, String password);

	abstract public void passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password);

	abstract public void passwordAuthWithExplicitUnscope(String id, String password);

	abstract public void tokenAuthWithUnscope(String tokenId);

	abstract public void tokenAuthWithSystemScope(String tokenId, boolean isAll);

	abstract public void tokenAuthWithDomainIdScope(String tokenId, String domainId);

	abstract public void tokenAuthWithDomainNameScope(String tokenId, String domainName);

	abstract public void tokenAuthWithProjectIdScope(String tokenId, String projectId);

	abstract public void tokenAuthWithProjectNameScope(String tokenId, String projectName, String domainId);

	abstract public void tokenAuthWithExplicitUnscope(String tokenId);

	abstract public void applicationCridential(String id, String secret);

	abstract public void applicationCridential(String name, String userId, String scrert);

	abstract public void getTokenInfo(String token);

	abstract public void validateToken(String token);

	abstract public void deleteToken(String token);

}
