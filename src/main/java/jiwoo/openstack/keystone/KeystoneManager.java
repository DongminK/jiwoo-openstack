package jiwoo.openstack.keystone;

import jiwoo.openstack.keystone.auth.catalog.AbstractAuthCatalogRequest;
import jiwoo.openstack.keystone.auth.domains.AbstractAuthDomainsRequest;
import jiwoo.openstack.keystone.auth.projects.AbstractAuthProjectsRequest;
import jiwoo.openstack.keystone.auth.system.AbstractAuthSystemRequest;
import jiwoo.openstack.keystone.auth.tokens.AbstractAuthTokensRequest;
import jiwoo.openstack.keystone.credentials.AbstractCredentialsRequest;
import jiwoo.openstack.keystone.restapi.AccessRules;
import jiwoo.openstack.keystone.restapi.ApplicationCredentials;
import jiwoo.openstack.keystone.restapi.AuthCatalog;
import jiwoo.openstack.keystone.restapi.AuthDomains;
import jiwoo.openstack.keystone.restapi.AuthProjects;
import jiwoo.openstack.keystone.restapi.AuthSystem;
import jiwoo.openstack.keystone.restapi.AuthTokens;
import jiwoo.openstack.keystone.restapi.Credential;
import jiwoo.openstack.keystone.restapi.Versions;
import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesRequest;
import jiwoo.openstack.keystone.users.applicationcredentials.AbstractApplicationCredentialsRequest;
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

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithUnscope(domainName, userName, password);

		return authTokens.process();
	}

	public String passwordAuthWithSystemScope(String id, String password, boolean isAll) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithSystemScope(id, password, isAll);

		return authTokens.process();
	}

	public String passwordAuthWithDomainIdScope(String domainId, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithDomainIdScope(domainId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithDomainNameScope(String domainName, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithDomainNameScope(domainName, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithProjectIdScope(String projectId, String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithProjectIdScope(projectId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithProjectNameScope(String projectName, String domainId, String id, String password)
			throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithProjectNameScope(projectName, domainId, id, password);

		return authTokens.process();
	}

	public String passwordAuthWithExplicitUnscope(String id, String password) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithExplicitUnscope(id, password);

		return authTokens.process();
	}

	public String applicationCredential(String id, String secret) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.applicationCridential(id, secret);

		return authTokens.process();
	}

	public String applicationCredential(String name, String userId, String secret) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.applicationCridential(name, userId, secret);

		return authTokens.process();
	}

	public String getTokenInfo(String token) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.getTokenInfo(token);

		return authTokens.process();
	}

	public String validateToken(String token) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.validateToken(token);

		return authTokens.process();
	}

	public String deleteToken(String token) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setOpenstackInfo(keystone);

		AbstractAuthTokensRequest request = authTokens.getRequest();
		request.deleteToken(token);

		return authTokens.process();
	}

	public String getServiceCatalog() throws Exception {

		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthCatalog authCatalog = new AuthCatalog();
		authCatalog.setOpenstackInfo(keystone);

		AbstractAuthCatalogRequest request = authCatalog.getRequest();
		request.getServiceCatalog();

		return authCatalog.process();

	}

	public String getAuthProjects() throws Exception {

		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthProjects authProjects = new AuthProjects();
		authProjects.setOpenstackInfo(keystone);

		AbstractAuthProjectsRequest request = authProjects.getRequest();
		request.getAuthProjects();

		return authProjects.process();

	}

	public String getAuthDomains() throws Exception {

		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthDomains authDomains = new AuthDomains();
		authDomains.setOpenstackInfo(keystone);

		AbstractAuthDomainsRequest request = authDomains.getRequest();
		request.getAuthDomains();

		return authDomains.process();

	}

	public String getAuthSystem() throws Exception {

		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthSystem authSystem = new AuthSystem();
		authSystem.setOpenstackInfo(keystone);

		AbstractAuthSystemRequest request = authSystem.getRequest();
		request.getAuthSystem();

		return authSystem.process();

	}

	public String createApplicationCredential(String userId, String name) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		ApplicationCredentials appCredential = new ApplicationCredentials();
		appCredential.setOpenstackInfo(keystone);

		AbstractApplicationCredentialsRequest request = appCredential.getRequest();
		request.createApplicationCredential(userId, name);

		return appCredential.process();

	}

	public String getApplicationCredentials(String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		ApplicationCredentials appCredential = new ApplicationCredentials();
		appCredential.setOpenstackInfo(keystone);

		AbstractApplicationCredentialsRequest request = appCredential.getRequest();
		request.getApplicationCredentials(userId);

		return appCredential.process();

	}

	public String getApplicationCredential(String appId, String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		ApplicationCredentials appCredential = new ApplicationCredentials();
		appCredential.setOpenstackInfo(keystone);

		AbstractApplicationCredentialsRequest request = appCredential.getRequest();
		request.getApplicationCredential(appId, userId);

		return appCredential.process();

	}

	public String deleteApplicationCredential(String appId, String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		ApplicationCredentials users = new ApplicationCredentials();
		users.setOpenstackInfo(keystone);

		AbstractApplicationCredentialsRequest request = users.getRequest();
		request.deleteApplicationCredential(appId, userId);

		return users.process();

	}

	public String getAccessRules(String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AccessRules accessRules = new AccessRules();
		accessRules.setOpenstackInfo(keystone);

		AbstractAccessRulesRequest request = accessRules.getRequest();
		request.getAccessRules(userId);

		return accessRules.process();

	}

	public String getAccessRule(String accessRuleId, String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");

		AccessRules accessRules = new AccessRules();
		accessRules.setOpenstackInfo(keystone);

		AbstractAccessRulesRequest request = accessRules.getRequest();
		request.getAccessRule(accessRuleId, userId);

		return accessRules.process();

	}

	public String deleteAccessRules(String accessRuleId, String userId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		AccessRules accessRules = new AccessRules();
		accessRules.setOpenstackInfo(keystone);

		AbstractAccessRulesRequest request = accessRules.getRequest();
		request.deleteAccessRule(accessRuleId, userId);

		return accessRules.process();

	}

	public String createCredential(String projectId, String type, String userId, String blob) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		Credential credential = new Credential();
		credential.setOpenstackInfo(keystone);

		AbstractCredentialsRequest request = credential.getRequest();
		request.create(projectId, type, userId, blob);

		return credential.process();

	}

	public String getCredentials() throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		Credential credential = new Credential();
		credential.setOpenstackInfo(keystone);

		AbstractCredentialsRequest request = credential.getRequest();
		request.getCredentials();

		return credential.process();

	}

	public String getCredential(String credentialId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		Credential credential = new Credential();
		credential.setOpenstackInfo(keystone);

		AbstractCredentialsRequest request = credential.getRequest();
		request.getCredential(credentialId);

		return credential.process();

	}

	public String updateCredential(String credentialId, String projectId, String type, String userId, String blob)
			throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		Credential credential = new Credential();
		credential.setOpenstackInfo(keystone);

		AbstractCredentialsRequest request = credential.getRequest();
		request.update(credentialId, projectId, type, userId, blob);

		return credential.process();

	}

	public String deleteCredential(String credentialId) throws Exception {
		if (keystone == null)
			throw new Exception("Not connect keystone");
		Credential credential = new Credential();
		credential.setOpenstackInfo(keystone);

		AbstractCredentialsRequest request = credential.getRequest();
		request.delete(credentialId);

		return credential.process();

	}

	public APIKey getAPIKey() {
		if (keystone != null) {
			return keystone.getApiKey();
		}

		return null;
	}

}
