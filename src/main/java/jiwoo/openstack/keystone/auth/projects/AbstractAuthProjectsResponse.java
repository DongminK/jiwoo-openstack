package jiwoo.openstack.keystone.auth.projects;

import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public abstract class AbstractAuthProjectsResponse extends RestResponse {

	abstract protected JSONObject getAuthProjects(String response);

}
