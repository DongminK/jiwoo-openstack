package jiwoo.openstack.keystone.auth.projects.v3_10;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.projects.AbstractAuthProjectsRequest;

public class AuthProjectsRequest extends AbstractAuthProjectsRequest {

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "auth/projects";
	}

	@Override
	public void getAuthProjects() {
		// TODO Auto-generated method stub
		setResponseMethodName();
		setHttpMethod(HttpGet.METHOD_NAME);
		setData(new JSONObject());
	}

}
