package jiwoo.openstack.keystone.auth.system;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

abstract public class AbstractAuthSystemResponse extends RestResponse {

	abstract protected JSONObject getAuthSystem(String response);

}
