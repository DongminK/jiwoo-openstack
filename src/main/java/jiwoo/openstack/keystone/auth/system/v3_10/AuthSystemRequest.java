package jiwoo.openstack.keystone.auth.system.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.system.AbstractAuthSystemRequest;

public class AuthSystemRequest extends AbstractAuthSystemRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/system";
	}

	@Override
	public void getAuthSystem() {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
	}

}
