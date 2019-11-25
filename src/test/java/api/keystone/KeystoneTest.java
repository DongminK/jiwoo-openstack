package api.keystone;

import jiwoo.openstack.wrapping.keystone.KeystoneConstants;
import jiwoo.openstack.wrapping.keystone.KeystoneInfo;
import jiwoo.openstack.wrapping.keystone.request.auth.tokens.IAuthTokensRequest;
import jiwoo.openstack.wrapping.keystone.response.auth.tokens.IAuthTokensResponse;
import jiwoo.openstack.wrapping.keystone.restapi.AuthTokens;

public class KeystoneTest {

	public static void main(String[] args) throws Exception {

		KeystoneInfo info = new KeystoneInfo("http://192.168.119.31:5000");
		info.setVer(KeystoneConstants.VER_3);

		String domain = "Default";
		String domainId = "default";
		String id = "207217b295084e888b5b7f8256be7909";
		String name = "admin";
		String password = "insoft00";
		boolean isAll = true;

		AuthTokens authTokens = new AuthTokens();
		authTokens.setKeystoneInfo(info);

		IAuthTokensRequest request = (IAuthTokensRequest) authTokens.getRequest();
		request.passwordAuthWithUnscopeAuthorization(domain, name, password);
		// request.passwordAuthWithScopeAuthorization(id, password, isAll);
		// request.passwordAuthWithScopeAuthorization(domainId, id, password);

		String result = authTokens.process();
		IAuthTokensResponse response = authTokens.getResponse();
		
		System.out.println(result);
		System.out.println(response.getAPIKey().token);

	}

}
