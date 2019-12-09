package jiwoo.openstack.keystone.auth.tokens.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

public class Scope extends JsonParams {

	private System system = null;
	private Domain domain = null;
	private Project project = null;

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public JSONObject toJSONObject() {
		JSONObject jObj = new JSONObject();

		set(jObj, "domain", domain != null ? domain.toJSONObject() : null);
		set(jObj, "system", system != null ? system.toJSONObject() : null);
		set(jObj, "project", project != null ? project.toJSONObject() : null);

		return jObj;
	}

}
