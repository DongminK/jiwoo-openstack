package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.nova.NovaManager;
import jiwoo.openstack.rest.APIKey;

public class KeystoneTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String domainId = "default";
		String user = "admin";
		String id = "207217b295084e888b5b7f8256be7909";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");
		
		String response = keystone.passwordAuthWithUnscope(domainName, user, password);
		System.out.println(response);
		
		response = keystone.passwordAuthWithDomainIdScope(domainName, id, password);
		System.out.println(response);

		
		APIKey apiKey = keystone.getAPIKey();

		NovaManager nova = new NovaManager();
		nova.connect("http://192.168.119.31:8774", apiKey);
		

	}

}
