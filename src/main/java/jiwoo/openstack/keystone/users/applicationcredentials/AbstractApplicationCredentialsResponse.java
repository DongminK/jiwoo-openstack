package jiwoo.openstack.keystone.users.applicationcredentials;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public abstract class AbstractApplicationCredentialsResponse extends RestResponse {

	abstract protected JSONObject createApplicationCredential(String response);

	abstract protected JSONObject getApplicationCredentials(String response);

	abstract protected JSONObject getApplicationCredential(String response);

	abstract protected JSONObject deleteApplicationCredential(String response);
	
	
}
