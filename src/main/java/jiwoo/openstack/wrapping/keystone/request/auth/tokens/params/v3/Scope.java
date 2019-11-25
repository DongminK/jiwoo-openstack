package jiwoo.openstack.wrapping.keystone.request.auth.tokens.params.v3;

import org.json.JSONObject;

import jiwoo.openstack.wrapping.keystone.request.JsonParams;

public class Scope extends JsonParams {

	private System system = null;
	private Domain domain = null;

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "domain", domain != null ? domain.toJSONObject() : null);
		set(jObj, "system", system != null ? system.toJSONObject() : null);

		return jObj;
	}

}
