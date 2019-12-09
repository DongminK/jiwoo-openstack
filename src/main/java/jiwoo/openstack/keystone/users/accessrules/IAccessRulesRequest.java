package jiwoo.openstack.keystone.users.accessrules;

import jiwoo.openstack.rest.RestRequest;

public interface IAccessRulesRequest extends RestRequest {

	void getAccessRules(String userId);

	void getAccessRule(String accessRuleId, String userId);

	void deleteAccessRule(String accessRuleId, String userId);
}
