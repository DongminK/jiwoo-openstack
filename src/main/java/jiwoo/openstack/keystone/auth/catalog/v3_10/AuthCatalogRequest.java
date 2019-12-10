package jiwoo.openstack.keystone.auth.catalog.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.catalog.AbstractAuthCatalogRequest;

public class AuthCatalogRequest extends AbstractAuthCatalogRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/catalog";
	}

	@Override
	public void getServiceCatalog() {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
	}

}
