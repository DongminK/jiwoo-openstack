package jiwoo.openstack.keystone.auth.catalog;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAuthCatalogRequest extends RestRequest {

	abstract public void getServiceCatalog();

}
