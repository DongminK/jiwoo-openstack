package jiwoo.openstack.cinder;

import jiwoo.openstack.common.Openstack;
import jiwoo.openstack.rest.APIKey;

public class Cinder implements Openstack {

	private String url = null;
	private String ver = null;
	private final APIKey apiKey = new APIKey();

	public Cinder(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public APIKey getApiKey() {
		return apiKey;
	}

	@Override
	public void setToken(String token) {
		// TODO Auto-generated method stub
		apiKey.setToken(token);
	}

}
