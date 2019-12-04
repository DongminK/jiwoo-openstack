package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.rest.APIKey;

public class OpenstackTest {

	public static void main(String[] args) throws Exception {

		String domainId = "default";
		String domainName = "Default";
		String userId = "207217b295084e888b5b7f8256be7909";
		String userName = "admin";
		String password = "insoft00";
		String projectName = "admin";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		String response = keystone.passwordAuthWithUnscope(domainName, userName, password);
		// String response = keystone.passwordAuthWithSystemScope(userId, password, true);
		// String response = keystone.passwordAuthWithDomainIdScope(domainId, userId, password);
		// String response = keystone.passwordAuthWithProjectNameScope(projectName, domainId, userId, password);
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

		// NovaManager nova = new NovaManager();
		// nova.connect("http://192.168.119.31:8774", apiKey);
		//
		// NeutronManager neutron = new NeutronManager();
		// neutron.connect("http://192.168.119.31:9696", apiKey);
		//
		// CinderManager cinder = new CinderManager();
		// cinder.connect("http://192.168.119.31:8776", apiKey);
		//
		// GlanceManager glance = new GlanceManager();
		// glance.connect("http://192.168.119.31:9292", apiKey);

	}

}
