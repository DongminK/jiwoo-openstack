package api.keystone;

import jiwoo.openstack.glance.GlanceManager;
import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.rest.APIKey;

public class GlanceTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String userName = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		keystone.passwordAuthWithUnscope(domainName, userName, password);
		APIKey apiKey = keystone.getAPIKey();

		GlanceManager glance = new GlanceManager();
		glance.connect("http://192.168.119.31:9292", apiKey);

	}

}
