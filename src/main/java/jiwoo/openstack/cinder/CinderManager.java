package jiwoo.openstack.cinder;

import jiwoo.openstack.cinder.restapi.Versions;
import jiwoo.openstack.rest.APIKey;

public class CinderManager {

	private Cinder cinder = null;

	public void connect(String url, APIKey apiKey) throws Exception {
		cinder = new Cinder(url);
		cinder.setToken(apiKey.getToken());
		Versions versions = new Versions();
		versions.setOpenstackInfo(cinder);
		versions.process();
		System.out.println(cinder.getVer());
	}

}
