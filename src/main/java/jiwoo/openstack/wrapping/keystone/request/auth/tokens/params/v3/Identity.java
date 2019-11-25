package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class Identity extends JsonParams {

	private Methods methods = null;
	private Password password = null;

	public Methods getMethods() {
		return methods;
	}

	public void setMethods(Methods methods) {
		this.methods = methods;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "methods", methods != null ? methods.toJSONArray() : null);
		set(jObj, "password", password != null ? password.toJSONObject() : null);

		return jObj;
	}
}
