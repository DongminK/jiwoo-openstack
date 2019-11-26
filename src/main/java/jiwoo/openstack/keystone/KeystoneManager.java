package jiwoo.openstack.keystone;

import jiwoo.openstack.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.keystone.restapi.AuthTokens;
import jiwoo.openstack.keystone.restapi.Versions;

public class KeystoneManager {

	private Keystone keystone = null;

	public void connect(String url) throws Exception {
		keystone = new Keystone(url);
		Versions versions = new Versions();
		versions.setKeystoneInfo(keystone);
		versions.process();
	}

	public String auth(String domain, String user, String password) throws Exception {

		if (keystone == null)
			throw new Exception("Not connect keystone");

		AuthTokens authTokens = new AuthTokens();
		authTokens.setKeystoneInfo(keystone);

		IAuthTokensRequest request = authTokens.getRequest();
		request.passwordAuthWithUnscopeAuthorization(domain, user, password);

		return authTokens.process();

	}

}
