package jiwoo.openstack.keystone.auth.system;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAuthSystemRequest extends RestRequest {

	abstract public void getAuthSystem();

}
