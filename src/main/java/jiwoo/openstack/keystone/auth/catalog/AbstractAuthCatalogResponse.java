package jiwoo.openstack.keystone.auth.catalog;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public abstract class AbstractAuthCatalogResponse extends RestResponse {

	abstract protected JSONObject getServiceCatalog(String response);
}
