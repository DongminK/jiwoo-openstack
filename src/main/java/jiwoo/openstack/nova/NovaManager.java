package jiwoo.openstack.nova;

import jiwoo.openstack.nova.restapi.Versions;
import jiwoo.openstack.rest.APIKey;

public class NovaManager {

	private Nova nova = null;

	public void connect(String url, APIKey apiKey) throws Exception {
		nova = new Nova(url);
		nova.setToken(apiKey.getToken());
		Versions versions = new Versions();
		versions.setOpenstackInfo(nova);
		versions.process();
		System.out.println(nova.getVer());
	}

}
