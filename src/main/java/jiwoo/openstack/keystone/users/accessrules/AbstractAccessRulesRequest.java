package jiwoo.openstack.keystone.users.accessrules;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAccessRulesRequest extends RestRequest {

	abstract public void getAccessRules(String userId);

	abstract public void getAccessRule(String accessRuleId, String userId);

	abstract public void deleteAccessRule(String accessRuleId, String userId);
	
}
