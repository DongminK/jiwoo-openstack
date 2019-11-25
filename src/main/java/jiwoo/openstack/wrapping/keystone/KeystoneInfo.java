package jiwoo.openstack.wrapping.keystone;

public class KeystoneInfo {

	private String url = "";
	private String ver = "";

	public KeystoneInfo(String url) {
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

}
