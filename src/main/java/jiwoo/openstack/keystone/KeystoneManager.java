package jiwoo.openstack.keystone;

import jiwoo.openstack.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.keystone.restapi.AuthTokens;
import jiwoo.openstack.keystone.restapi.Versions;
import jiwoo.openstack.rest.APIKey;

public class KeystoneManager {

	private Keystone keystone = null;

	public void connect(String url) throws Exception {
		keystone = new Keystone(url);
		Versions versions = new Versions();
		versions.setOpenstackInfo(keystone);
		versions.process();
	}

	public String passwordAuthWithUnscope(String domainName, String userName, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithUnscope(domainName, userName, password);

		return authTokens.process();
	}

	public String passwordAuthWithSystemScope(String id, String password, boolean isAll) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithSystemScope(id, password, isAll);

		return authTokens.process();
	}

	public String passwordAuthWithDomainIdScope(String domainId, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithDomainIdScope(domainId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithDomainNameScope(String domainName, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithDomainNameScope(domainName, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithProjectIdScope(String projectId, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithProjectIdScope(projectId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password)
			throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithProjectNameScope(projectName, domainId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithExplicitUnscope(String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithExplicitUnscope(id, password);

		return authTokens.process();
	}

	public String validateToken(String token) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.validateToken(token);

		return authTokens.process();
	}

	public String checkToken(String token) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.checkToken(token);

		return authTokens.process();
	}

	public APIKey getAPIKey() {
		if (keystone != null) {
			return keystone.getApiKey();
		}

		return null;
	}

}
