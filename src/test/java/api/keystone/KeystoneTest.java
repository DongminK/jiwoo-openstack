package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.rest.APIKey;

public class KeystoneTest {

	public static void main(String[] args) throws Exception {

		String domainId = "default";
		String domainName = "Default";
		String userId = "207217b295084e888b5b7f8256be7909";
		String userName = "admin";
		String password = "insoft00";
		String projectName = "admin";
		String appId = "253175ed8bdd4e80807a51ad3b976a76";
		String secret = "ld8GyBfoN9f4L-XJ5ABZTcuoBXtaO0OBralPO7dLvLYwz_BMhd6ZQibqqtAgMq2L44hpw6NiKwKAql8nlfEwAA";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		// String response = keystone.passwordAuthWithUnscope(domainName, userName, password);
		// String response = keystone.passwordAuthWithSystemScope(userId, password, true);
		// String response = keystone.passwordAuthWithDomainIdScope(domainId, userId, password);
		String response = keystone.passwordAuthWithProjectNameScope(projectName, domainId, userId, password);
		// String response = keystone.passwordAuthWithDomainNameScope(domainName, userId, password);
		System.out.println(response);

		APIKey apiKey = keystone.getAPIKey();

		System.out.println(apiKey.getToken());

		keystone.getTokenInfo(apiKey.getToken());
		keystone.validateToken(apiKey.getToken());
		keystone.getServiceCatalog();
		keystone.getAuthProjects();
		keystone.getAuthDomains();
		keystone.getAuthSystem();
		keystone.applicationCredential(appId, secret);
		keystone.applicationCredential("monitoring", userId, secret);
		// keystone.createApplicationCredential(userId, "monitoring");
		keystone.getApplicationCredentials(userId);
		keystone.getApplicationCredential(appId, userId);
		keystone.deleteApplicationCredential(appId, userId);

		keystone.getAccessRules(userId);
		keystone.getAccessRule(appId, userId);

	}

}
