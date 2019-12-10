package jiwoo.openstack.keystone.credentials.v3_10;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONObject;

import jiwoo.openstack.keystone.credentials.AbstractCredentialsRequest;

public class CredentialsRequest extends AbstractCredentialsRequest {

	@Override
	protected String getUrl() {
		// TODO Auto-generated method stub
		return "credentials/{{credential_id}";
	}

	@Override
	public void create(String projectId, String type, String userId, String blob) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPost.METHOD_NAME);

		JSONObject jCredential = new JSONObject();
		jCredential.put("project_id", projectId);
		jCredential.put("type", type);
		jCredential.put("user_id", userId);
		jCredential.put("blob", blob);

		JSONObject jURIs = new JSONObject();
		jURIs.put("credential_id", "");

		JSONObject jData = new JSONObject();
		jData.put("credential", jCredential);
		jData.put("uris", jURIs);

		setData(jData);
	}

	@Override
	public void getCredentials() {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
	}

	@Override
	public void getCredential(String credentialId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);

		JSONObject jURIs = new JSONObject();
		jURIs.put("credential_id", credentialId);

		JSONObject jData = new JSONObject();
		jData.put("uris", jURIs);

		setData(jData);
	}

	@Override
	public void delete(String credentialId) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpDelete.METHOD_NAME);

		JSONObject jURIs = new JSONObject();
		jURIs.put("credential_id", credentialId);

		JSONObject jData = new JSONObject();
		jData.put("uris", jURIs);

		setData(jData);
	}

	@Override
	public void update(String credentialId, String projectId, String type, String userId, String blob) {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpPatch.METHOD_NAME);

		JSONObject jCredential = new JSONObject();
		jCredential.put("project_id", projectId);
		jCredential.put("type", type);
		jCredential.put("user_id", userId);
		jCredential.put("blob", blob);

		JSONObject jURIs = new JSONObject();
		jURIs.put("credential_id", credentialId);

		JSONObject jData = new JSONObject();
		jData.put("credential", jCredential);
		jData.put("uris", jURIs);

		setData(jData);
	}

}
