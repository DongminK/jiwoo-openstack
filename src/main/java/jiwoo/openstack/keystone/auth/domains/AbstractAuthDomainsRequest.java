package jiwoo.openstack.keystone.auth.domains;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAuthDomainsRequest extends RestRequest {

	abstract public void getAuthDomains();
}
