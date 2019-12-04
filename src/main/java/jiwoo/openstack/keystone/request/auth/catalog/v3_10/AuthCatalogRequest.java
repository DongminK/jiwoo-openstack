package jiwoo.openstack.keystone.request.auth.catalog.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.request.auth.catalog.IAuthCatalogRequest;

public class AuthCatalogRequest implements IAuthCatalogRequest {

	private JSONObject jData = null;
	private String method = HttpGet.METHOD_NAME;
	private String postResponseMethod = null;
	private HashMap<String, String> mapHeaders = new HashMap<String, String>();

	@Override
	public HashMap<String, String> getHeaders() {
		// TODO Auto-generated method stub
		return mapHeaders;
	}

	@Override
	public String getHttpMethod() {
		// TODO Auto-generated method stub
		return method;
	}

	@Override
	public String getPostResponseMethod() {
		// TODO Auto-generated method stub
		return postResponseMethod;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/catalog";
	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return jData;
	}

	@Override
	public String toJsonString() {
		// TODO Auto-generated method stub
		return jData.toString();
	}

	@Override
	public void getServiceCatalog() {
		// TODO Auto-generated method stub
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getServiceCatalog";
		jData = new JSONObject();
	}

}
