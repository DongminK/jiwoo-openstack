package jiwoo.openstack.keystone.users.applicationcredentials.v3_10;

import java.util.HashMap;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.users.applicationcredentials.IApplicationCredentialsRequest;
import jiwoo.openstack.keystone.users.applicationcredentials.v3_10.params.ApplicationCredential;

public class ApplicationCredentialsRequest implements IApplicationCredentialsRequest {

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
		return "users/{user_id}/application_credentials/{application_credential_id}";
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
	public void createApplicationCredential(String userId, String name) {
		// TODO Auto-generated method stub
		method = HttpPost.METHOD_NAME;
		postResponseMethod = "createApplicationCredential";
		jData = ApplicationCredential.create(name);

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", "");
		jData.put("uris", jURI);
	}

	@Override
	public void getApplicationCredentials(String userId) {
		// TODO Auto-generated method stub
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getApplicationCredentials";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", "");

		jData.put("uris", jURI);
	}

	@Override
	public void getApplicationCredential(String appId, String userId) {
		// TODO Auto-generated method stub
		method = HttpGet.METHOD_NAME;
		postResponseMethod = "getApplicationCredential";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", appId);

		jData.put("uris", jURI);
	}

	@Override
	public void deleteApplicationCredential(String appId, String userId) {
		// TODO Auto-generated method stub
		method = HttpDelete.METHOD_NAME;
		postResponseMethod = "deleteApplicationCredential";
		jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", appId);

		jData.put("uris", jURI);
	}

	
}
