package jiwoo.openstack.keystone.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

public class ApplicationCredential extends JsonParams {

	private String name = null;
	private String id = null;
	private String secret = null;
	private User user = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public JSONObject toJSONObject() {

		JSONObject jObj = new JSONObject();

		set(jObj, "name", name);
		set(jObj, "id", id);
		set(jObj, "secret", secret);
		set(jObj, "user", user != null ? user.toJSONObject() : null);

		return jObj;

	}

}
