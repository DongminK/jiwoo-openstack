package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.neutron.NeutronManager;
import jiwoo.openstack.rest.APIKey;

public class NeutronTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String userName = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		keystone.passwordAuthWithUnscope(domainName, userName, password);
		APIKey apiKey = keystone.getAPIKey();

		NeutronManager neutron = new NeutronManager();
		neutron.connect("http://192.168.119.31:9696", apiKey);

	}

}
