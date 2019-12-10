package jiwoo.openstack.keystone.users.applicationcredentials;

import jiwoo.openstack.rest.RestRequest;

abstract public class AbstractApplicationCredentialsRequest extends RestRequest {

	abstract public void createApplicationCredential(String userId, String name);

	abstract public void getApplicationCredentials(String userId);

	abstract public void getApplicationCredential(String appId, String userId);

	abstract public void deleteApplicationCredential(String appId, String userId);

}
