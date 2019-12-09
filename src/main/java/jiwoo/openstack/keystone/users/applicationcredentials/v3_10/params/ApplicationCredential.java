package jiwoo.openstack.keystone.users.applicationcredentials.v3_10.params;

import org.json.JSONObject;

import jiwoo.openstack.common.JsonParams;

public class ApplicationCredential extends JsonParams {

	public static JSONObject create(String name) {

		JSONObject jApplicationCredential = new JSONObject();
		jApplicationCredential.put("name", name);

		JSONObject jObj = new JSONObject();
		jObj.put("application_credential", jApplicationCredential);

		return jObj;

	}
}
