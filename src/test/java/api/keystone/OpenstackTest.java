package api.keystone;

import jiwoo.openstack.cinder.CinderManager;
import jiwoo.openstack.glance.GlanceManager;
import jiwoo.openstack.keystone.KeystoneManager;
import jiwoo.openstack.neutron.NeutronManager;
import jiwoo.openstack.nova.NovaManager;
import jiwoo.openstack.rest.APIKey;

public class OpenstackTest {

	public static void main(String[] args) throws Exception {

		String domainName = "Default";
		String user = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");
		
		String response = keystone.passwordAuthWithUnscope(domainName, user, password);
		System.out.println(response);
		
		APIKey apiKey = keystone.getAPIKey();
		
		keystone.validateToken(apiKey.getToken());
		keystone.checkToken(apiKey.getToken());
		
		NovaManager nova = new NovaManager();
		nova.connect("http://192.168.119.31:8774", apiKey);
		
		NeutronManager neutron = new NeutronManager();
		neutron.connect("http://192.168.119.31:9696", apiKey);
		
		CinderManager cinder = new CinderManager();
		cinder.connect("http://192.168.119.31:8776", apiKey);
		
		GlanceManager glance = new GlanceManager();
		glance.connect("http://192.168.119.31:9292", apiKey);
	}

}
