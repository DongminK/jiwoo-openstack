package api.keystone;

import jiwoo.openstack.cinder.CinderManager;
import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.rest.APIKey;

public class CinderTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String userName = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		keystone.passwordAuthWithUnscope(domainName, userName, password);
		APIKey apiKey = keystone.getAPIKey();

		CinderManager cinder = new CinderManager();
		cinder.connect("http://192.168.119.31:8776", apiKey);

	}

}
