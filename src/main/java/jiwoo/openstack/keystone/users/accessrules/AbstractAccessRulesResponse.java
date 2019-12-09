package jiwoo.openstack.keystone.users.accessrules;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public abstract class AbstractAccessRulesResponse extends RestResponse {

	abstract protected JSONObject getAccessRules(String response);

	abstract protected JSONObject getAccessRule(String response);
	
	abstract protected JSONObject deleteAccessRule(String response);

}
