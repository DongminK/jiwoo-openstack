package jiwoo.openstack.keystone.request.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

public class User extends JsonParams {

	private String id = null;
	private String name = null;
	private String password = null;
	private Domain domain = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "id", id);
		set(jObj, "name", name);
		set(jObj, "domain", domain != null ? domain.toJSONObject() : null);
		set(jObj, "password", password);

		return jObj;
	}
}
