package jiwoo.openstack.keystone.response.auth.domains;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

abstract public class AbstractAuthDomainsResponse extends RestResponse {

	abstract protected JSONObject getAuthDomains(String response);

}
