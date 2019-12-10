package jiwoo.openstack.keystone.auth.tokens.v3_10;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.tokens.AbstractAuthTokensRequest;
import jiwoo.openstack.keystone.auth.tokens.v3_10.params.Auth;

public class AuthTokensRequest extends AbstractAuthTokensRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/tokens";
	}

	public void passwordAuthWithUnscope(String domain, String name, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithUnscope(domain, name, password));
	}

	public void passwordAuthWithSystemScope(String id, String password, boolean isAll) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithSystemScope(id, password, isAll));
	}

	public void passwordAuthWithDomainIdScope(String domainId, String id, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithDomainIdScope(domainId, id, password));
	}

	public void passwordAuthWithDomainNameScope(String domainName, String id, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithDomainNameScope(domainName, id, password));
	}

	public void passwordAuthWithProjectIdScope(String projectId, String id, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithProjectIdScope(projectId, id, password));
	}

	public void passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithProjectNameScope(projectName, domainId, id, password));
	}

	public void passwordAuthWithExplicitUnscope(String id, String password) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.passwordAuthWithExplicitUnscope(id, password));

	}

	public void tokenAuthWithUnscope(String tokenId) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithUnscope(tokenId));
	}

	public void tokenAuthWithSystemScope(String tokenId, boolean isAll) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithSystemScope(tokenId, isAll));
	}

	public void tokenAuthWithDomainIdScope(String tokenId, String domainId) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithDomainIdScope(tokenId, domainId));
	}

	public void tokenAuthWithDomainNameScope(String tokenId, String domainName) {
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithDomainNameScope(tokenId, domainName));
	}

	@Override
	public void tokenAuthWithProjectIdScope(String tokenId, String projectId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithProjectIdScope(tokenId, projectId));
	}

	@Override
	public void tokenAuthWithProjectNameScope(String tokenId, String projectName, String domainId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithProjectNameScope(tokenId, projectName, domainId));
	}

	@Override
	public void tokenAuthWithExplicitUnscope(String tokenId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.tokenAuthWithExplicitUnscope(tokenId));
	}

	@Override
	public void applicationCridential(String id, String secret) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.applicationCridential(id, secret));
	}

	@Override
	public void applicationCridential(String name, String userId, String secret) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);
		setData(Auth.applicationCridential(name, userId, secret));
	}

	@Override
	public void getTokenInfo(String token) {
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
		clearHeader();
		addHeader("X-Auth-Token", token);
		addHeader("X-Subject-Token", token);
	}

	@Override
	public void validateToken(String token) {
		setResponseMethodName();
		setHttpMethod(HttpHead.METHOD_NAME);
		setData(new JSONObject());
		clearHeader();
		addHeader("X-Auth-Token", token);
		addHeader("X-Subject-Token", token);
	}

	@Override
	public void deleteToken(String token) {
		setResponseMethodName();
		setHttpMethod(HttpDelete.METHOD_NAME);
		setData(new JSONObject());
		clearHeader();
		addHeader("X-Auth-Token", token);
		addHeader("X-Subject-Token", token);
	}

}
