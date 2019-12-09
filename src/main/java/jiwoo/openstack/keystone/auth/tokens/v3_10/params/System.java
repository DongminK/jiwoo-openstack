package jiwoo.openstack.keystone.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

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
