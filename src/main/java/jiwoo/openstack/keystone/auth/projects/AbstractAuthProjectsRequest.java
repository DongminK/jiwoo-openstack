package jiwoo.openstack.keystone.auth.projects;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractAuthProjectsRequest extends RestRequest {

	abstract public void getAuthProjects();

}
