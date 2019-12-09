package jiwoo.openstack.keystone.users.applicationcredentials;

import jiwoo.openstack.rest.RestRequest;

public interface IApplicationCredentialsRequest extends RestRequest {

	void createApplicationCredential(String userId, String name);

	void getApplicationCredentials(String userId);

	void getApplicationCredential(String appId, String userId);

	void deleteApplicationCredential(String appId, String userId);

}
