package jiwoo.openstack.keystone.credentials.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.credentials.AbstractCredentialsResponse;

public class CredentialsResponse extends AbstractCredentialsResponse {

	@Override
	public JSONObject create(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod create");
		return new JSONObject(response);
	}

	@Override
	public JSONObject getCredentials(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getCredentials");
		return new JSONObject(response);
	}

	@Override
	public JSONObject getCredential(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getCredential");
		return new JSONObject(response);
	}

	@Override
	public JSONObject delete(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod delete");
		return new JSONObject(response);
	}

	@Override
	public JSONObject update(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod update");
		return new JSONObject(response);
	}

}
