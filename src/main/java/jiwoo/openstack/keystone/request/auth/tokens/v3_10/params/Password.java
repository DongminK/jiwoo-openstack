package jiwoo.openstack.keystone.request.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

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
