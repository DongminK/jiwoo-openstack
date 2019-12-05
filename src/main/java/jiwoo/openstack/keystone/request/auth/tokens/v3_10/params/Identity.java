package jiwoo.openstack.keystone.request.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

public class Identity extends JsonParams {

	private Methods methods = null;
	private Password password = null;
	private ApplicationCredential applicationCredential = null;
	private Token token = null;

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

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public ApplicationCredential getApplicationCredential() {
		return applicationCredential;
	}

	public void setApplicationCredential(ApplicationCredential applicationCredential) {
		this.applicationCredential = applicationCredential;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "methods", methods != null ? methods.toJSONArray() : null);
		set(jObj, "password", password != null ? password.toJSONObject() : null);
		set(jObj, "token", token != null ? token.toJSONObject() : null);
		set(jObj, "application_credential", applicationCredential != null ? applicationCredential.toJSONObject() : null);

		return jObj;
	}
}
