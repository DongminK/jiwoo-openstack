package jiwoo.openstack.keystone.users.accessrules.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.users.accessrules.IAccessRulesRequest;

public class AccessRulesRequest implements IAccessRulesRequest {

	private JSONObject jData = null;
	private String method = HttpGet.METHOD_NAME;
	private String postResponseMethod = null;
	private HashMap<String, String> mapHeaders = new HashMap<String, String>();

	@Override
	public HashMap<String, String> getHeaders() {
		// TODO Auto-generated method stub
		return mapHeaders;
	}

	@Override
	public String getHttpMethod() {
		// TODO Auto-generated method stub
		return method;
	}

	@Override
	public String getPostResponseMethod() {
		// TODO Auto-generated method stub
		return postResponseMethod;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "users/{user_id}/access_rules/{access_rule_id}";
	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return jData;
	}

	@Override
	public String toJsonString() {
		// TODO Auto-generated method stub
		return jData.toString();
	}

	public void getAccessRules(String userId) {
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getAccessRules";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", "");

		jData.put("uris", jURI);
	}

	public void getAccessRule(String accessRuleId, String userId) {
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getAccessRule";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", accessRuleId);

		jData.put("uris", jURI);
	}

	public void deleteAccessRule(String accessRuleId, String userId) {
		method = HttpDelete.METHOD_NAME;
		postResponseMethod = "deleteAccessRule";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("access_rule_id", accessRuleId);

		jData.put("uris", jURI);
	}
}
