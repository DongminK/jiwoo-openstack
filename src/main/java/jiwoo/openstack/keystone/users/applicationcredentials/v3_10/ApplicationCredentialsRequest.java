package jiwoo.openstack.keystone.users.applicationcredentials.v3_10;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.users.applicationcredentials.AbstractApplicationCredentialsRequest;
import jiwoo.openstack.keystone.users.applicationcredentials.v3_10.params.ApplicationCredential;

public class ApplicationCredentialsRequest extends AbstractApplicationCredentialsRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "users/{user_id}/application_credentials/{application_credential_id}";
	}

	@Override
	public void createApplicationCredential(String userId, String name) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);

		JSONObject jData = ApplicationCredential.create(name);

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", "");
		jData.put("uris", jURI);

		setData(jData);
	}

	@Override
	public void getApplicationCredentials(String userId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", "");

		jData.put("uris", jURI);

		setData(jData);
	}

	@Override
	public void getApplicationCredential(String appId, String userId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", appId);

		jData.put("uris", jURI);

		setData(jData);
	}

	@Override
	public void deleteApplicationCredential(String appId, String userId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpDelete.METHOD_NAME);

		JSONObject jData = new JSONObject();

		JSONObject jURI = new JSONObject();
		jURI.put("user_id", userId);
		jURI.put("application_credential_id", appId);

		jData.put("uris", jURI);

		setData(jData);
	}

}
