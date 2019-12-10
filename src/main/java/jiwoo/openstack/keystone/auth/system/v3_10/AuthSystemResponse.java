package jiwoo.openstack.keystone.auth.system.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.system.AbstractAuthSystemResponse;

public class AuthSystemResponse extends AbstractAuthSystemResponse {

	@Override
	protected JSONObject getAuthSystem(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAuthSystem");
		return new JSONObject(response);
	}

}
