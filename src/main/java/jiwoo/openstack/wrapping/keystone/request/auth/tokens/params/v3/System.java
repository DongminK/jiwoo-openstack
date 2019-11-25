package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class System extends JsonParams {

	private boolean all = false;

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "all", all);

		return jObj;
	}
}
