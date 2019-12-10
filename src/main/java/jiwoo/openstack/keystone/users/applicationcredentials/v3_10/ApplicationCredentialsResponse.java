package jiwoo.openstack.keystone.users.applicationcredentials.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.users.applicationcredentials.AbstractApplicationCredentialsResponse;

public class ApplicationCredentialsResponse extends AbstractApplicationCredentialsResponse {

	@Override
	protected JSONObject createApplicationCredential(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod createApplicationCredential");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getApplicationCredentials(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getApplicationCredentials");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getApplicationCredential(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getApplicationCredential");
		return new JSONObject(response);
	}

	protected JSONObject deleteApplicationCredential(String response) {
		System.out.println("Call TestMethod deleteApplicationCredential");
		return new JSONObject(response);
	}
}
