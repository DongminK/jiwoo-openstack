package jiwoo.openstack.wrapping.nova;

import jiwoo.openstack.rest.APIKey;

public class NovaInfo {

	private String url = "";
	private String ver = "";

	private APIKey apiKey = null;

	public NovaInfo(String url) {
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

	public void setApiKey(APIKey apiKey) {
		this.apiKey = apiKey;
	}

}
