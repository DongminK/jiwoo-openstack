package jiwoo.openstack.keystone.request.auth.domains.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.request.auth.domains.IAuthDomainsRequest;

public class AuthDomainsRequest implements IAuthDomainsRequest {

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
		return "auth/domains";
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
	public void getAuthDomains() {
		// TODO Auto-generated method stub
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getAuthDomains";
		jData = new JSONObject();
	}

}
