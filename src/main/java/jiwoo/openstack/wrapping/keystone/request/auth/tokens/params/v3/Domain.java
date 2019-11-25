package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class Domain extends JsonParams {

	private String id = null;
	private String name = null;

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

	public JSONObject toJSONObject() {

		JSONObject jObj = new JSONObject();

		set(jObj, "id", id);
		set(jObj, "name", name);

		return jObj;

	}
}
