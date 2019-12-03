package jiwoo.openstack.glance;

import jiwoo.openstack.glance.restapi.Versions;
import jiwoo.openstack.rest.APIKey;

public class GlanceManager {

	private Glance glance = null;

	public void connect(String url, APIKey apiKey) throws Exception {
		glance = new Glance(url);
		glance.setToken(apiKey.getToken());
		Versions versions = new Versions();
		versions.setOpenstackInfo(glance);
		versions.process();
		System.out.println(glance.getVer());
	}

}
