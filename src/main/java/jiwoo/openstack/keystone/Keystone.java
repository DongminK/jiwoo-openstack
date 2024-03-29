package jiwoo.openstack.keystone;

import jiwoo.openstack.common.Openstack;
import jiwoo.openstack.rest.APIKey;

public class Keystone implements Openstack {

	private String url = null;
	private String ver = null;
	private final APIKey apiKey = new APIKey();

	public Keystone(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String getVer() {
		return ver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public APIKey getApiKey() {
		return apiKey;
	}

	public void setToken(String token) {
		apiKey.setToken(token);
	}

}
