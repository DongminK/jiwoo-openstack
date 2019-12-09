package jiwoo.openstack.keystone.auth.catalog;

import jiwoo.openstack.rest.RestRequest;

public interface IAuthCatalogRequest extends RestRequest {

	void getServiceCatalog();
	
}
