package jiwoo.openstack.keystone.auth.domains.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.domains.AbstractAuthDomainsResponse;

public class AuthDomainsResponse extends AbstractAuthDomainsResponse {

	@Override
	protected JSONObject getAuthDomains(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAuthDomains");
		return new JSONObject(response);
	}

}
