package jiwoo.openstack.keystone.request.auth.domains;

import jiwoo.openstack.rest.RestRequest;

public interface IAuthDomainsRequest extends RestRequest {

	void getAuthDomains();
}
