package jiwoo.openstack.keystone.users.accessrules.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesResponse;

public class AccessRulesResponse extends AbstractAccessRulesResponse {

	@Override
	protected JSONObject getAccessRules(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAccessRules");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getAccessRule(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAccessRule");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject deleteAccessRule(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod deleteAccessRule");
		return new JSONObject(response);
	}

}
