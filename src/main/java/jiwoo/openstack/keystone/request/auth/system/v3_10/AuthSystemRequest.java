package jiwoo.openstack.keystone.request.auth.system.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.request.auth.system.IAuthSystemRequest;

public class AuthSystemRequest implements IAuthSystemRequest {

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
		return postResponseMethod;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/system";
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
	public void getAuthSystem() {
		// TODO Auto-generated method stub
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getAuthSystem";
		jData = new JSONObject();
	}

}
