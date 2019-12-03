package jiwoo.openstack.neutron;

import jiwoo.openstack.neutron.restapi.Versions;
import jiwoo.openstack.rest.APIKey;

public class NeutronManager {

	private Neutron neutron = null;

	public void connect(String url, APIKey apiKey) throws Exception {
		neutron = new Neutron(url);
		neutron.setToken(apiKey.getToken());
		Versions versions = new Versions();
		versions.setOpenstackInfo(neutron);
		versions.process();
		System.out.println(neutron.getVer());
	}

}
