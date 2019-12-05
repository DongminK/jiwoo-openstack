package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.nova.NovaManager;
import jiwoo.openstack.rest.APIKey;

public class NovaTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String userName = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");

		keystone.passwordAuthWithUnscope(domainName, userName, password);
		APIKey apiKey = keystone.getAPIKey();
		
		NovaManager nova = new NovaManager();
		 nova.connect("http://192.168.119.31:8774", apiKey);
		

	}

}
