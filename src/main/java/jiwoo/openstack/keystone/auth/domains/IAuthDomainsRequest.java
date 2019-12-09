package jiwoo.openstack.keystone.auth.domains;

import jiwoo.openstack.rest.RestRequest;

public interface IAuthDomainsRequest extends RestRequest {

	void getAuthDomains();
}
