package jiwoo.openstack.keystone.auth.catalog.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.catalog.AbstractAuthCatalogResponse;

public class AuthCatalogResponse extends AbstractAuthCatalogResponse {

	@Override
	protected JSONObject getServiceCatalog(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getServiceCatalog");
		return new JSONObject(response);
	}

}
