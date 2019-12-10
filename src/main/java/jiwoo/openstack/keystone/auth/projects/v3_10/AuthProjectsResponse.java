package jiwoo.openstack.keystone.auth.projects.v3_10;

import org.json.JSONObject;

import jiwoo.openstack.keystone.auth.projects.AbstractAuthProjectsResponse;

public class AuthProjectsResponse extends AbstractAuthProjectsResponse {

	@Override
	protected JSONObject getAuthProjects(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAuthProjects");
		return new JSONObject(response);
	}

}
