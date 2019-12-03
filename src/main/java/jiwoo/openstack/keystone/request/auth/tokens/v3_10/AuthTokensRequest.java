package jiwoo.openstack.keystone.request.auth.tokens.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.keystone.request.auth.tokens.v3_10.params.Auth;

public class AuthTokensRequest implements IAuthTokensRequest {

	private JSONObject jData = null;
	private String method = HttpGet.METHOD_NAME;
	private String postResponseMethod = null;
	private HashMap<String, String> mapHeaders = new HashMap<String, String>();

	@Override
	public HashMap<String, String> getHeaders() {
		// TODO Auto-generated method stub
		return mapHeaders;
	}

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

	public void passwordAuthWithUnscope(String domain, String name, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithUnscope";
		jData = Auth.passwordAuthWithUnscope(domain, name, password);
	}

	public void passwordAuthWithSystemScope(String id, String password, boolean isAll) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithSystemScope";
		jData = Auth.passwordAuthWithSystemScope(id, password, isAll);
	}

	public void passwordAuthWithDomainIdScope(String domainId, String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithDomainIdScope";
		jData = Auth.passwordAuthWithDomainIdScope(domainId, id, password);
	}

	public void passwordAuthWithDomainNameScope(String domainName, String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithDomainNameScope";
		jData = Auth.passwordAuthWithDomainNameScope(domainName, id, password);
	}

	public void passwordAuthWithProjectIdScope(String projectId, String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithProjectIdScope";
		jData = Auth.passwordAuthWithProjectIdScope(projectId, id, password);
	}

	public void passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithProjectNameScope";
		jData = Auth.passwordAuthWithProjectNameScope(projectName, domainId, id, password);
	}

	public void passwordAuthWithExplicitUnscope(String id, String password) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "passwordAuthWithExplicitUnscope";
		jData = Auth.passwordAuthWithExplicitUnscope(id, password);

	}

	public void tokenAuthWithUnscope(String tokenId) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithUnscope";
		jData = Auth.tokenAuthWithUnscope(tokenId);
	}

	public void tokenAuthWithSystemScope(String tokenId, boolean isAll) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithSystemScope";
		jData = Auth.tokenAuthWithSystemScope(tokenId, isAll);
	}

	public void tokenAuthWithDomainIdScope(String tokenId, String domainId) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithDomainIdScope";
		jData = Auth.tokenAuthWithDomainIdScope(tokenId, domainId);
	}

	public void tokenAuthWithDomainNameScope(String tokenId, String domainName) {
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithDomainNameScope";
		jData = Auth.tokenAuthWithDomainNameScope(tokenId, domainName);
	}

	@Override
	public void tokenAuthWithProjectIdScope(String tokenId, String projectId) {
		// TODO Auto-generated method stub
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithProjectIdScope";
		jData = Auth.tokenAuthWithProjectIdScope(tokenId, projectId);
	}

	@Override
	public void tokenAuthWithProjectNameScope(String tokenId, String projectName, String domainId) {
		// TODO Auto-generated method stub
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithProjectNameScope";
		jData = Auth.tokenAuthWithProjectNameScope(tokenId, projectName, domainId);
	}

	@Override
	public void tokenAuthWithExplicitUnscope(String tokenId) {
		// TODO Auto-generated method stub
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "tokenAuthWithExplicitUnscope";
		jData = Auth.tokenAuthWithExplicitUnscope(tokenId);
	}

	@Override
	public void validateToken(String token) {
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "validateToken";
		jData = new JSONObject();
		mapHeaders.clear();
		mapHeaders.put("X-Auth-Token", token);
		mapHeaders.put("X-Subject-Token", token);
	}

	@Override
	public void checkToken(String token) {
		method = HttpHead.METHOD_NAME;
		postResponseMethod = "checkToken";
		jData = new JSONObject();
		mapHeaders.clear();
		mapHeaders.put("X-Auth-Token", token);
		mapHeaders.put("X-Subject-Token", token);
	}

	public JSONObject toJsonObject() {
		return jData;
	}

	public String toJsonString() {
		return jData.toString();
	}

}
