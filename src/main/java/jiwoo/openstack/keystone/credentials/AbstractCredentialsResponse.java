package jiwoo.openstack.keystone.credentials;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public abstract class AbstractCredentialsResponse extends RestResponse {

	abstract public JSONObject create(String response);

	abstract public JSONObject getCredentials(String response);

	abstract public JSONObject getCredential(String response);
	
	abstract public JSONObject update(String response);
	
	abstract public JSONObject delete(String response);

}
