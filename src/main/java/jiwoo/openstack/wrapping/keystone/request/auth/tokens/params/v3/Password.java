package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class Password extends JsonParams {

	private User user = null;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "user", user != null ? user.toJSONObject() : null);

		return jObj;
	}
}
