package jiwoo.openstack.keystone.users.accessrules.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesRequest;

public class AccessRulesRequest extends AbstractAccessRulesRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "users/{user_id}/access_rules/{access_rule_id}";
	}

	public void getAccessRules(String userId) {

		setHttpMethod(HttpGet.METHOD_NAME);
		setResponseMethodName();

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", "");

		jData.put("uris", jURI);

		setData(jData);
	}

	public void getAccessRule(String accessRuleId, String userId) {

		setHttpMethod(HttpGet.METHOD_NAME);
		setResponseMethodName();

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", accessRuleId);

		jData.put("uris", jURI);

		setData(jData);
	}

	public void deleteAccessRule(String accessRuleId, String userId) {

		setHttpMethod(HttpGet.METHOD_NAME);
		setResponseMethodName();

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", accessRuleId);

		jData.put("uris", jURI);

		setData(jData);
	}
}
