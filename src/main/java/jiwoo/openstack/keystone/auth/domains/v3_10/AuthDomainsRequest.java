package jiwoo.openstack.keystone.auth.domains.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.domains.AbstractAuthDomainsRequest;

public class AuthDomainsRequest extends AbstractAuthDomainsRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/domains";
	}

	@Override
	public void getAuthDomains() {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
	}

}
