package jiwoo.openstack.rest;

public class APIKey {

	private String token = "";

	public APIKey(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
