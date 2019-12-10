package jiwoo.openstack.keystone.credentials;

import jiwoo.openstack.rest.RestRequest;

public abstract class AbstractCredentialsRequest extends RestRequest {

	abstract public void create(String projectId, String type, String userId, String blob);

	abstract public void getCredentials();

	abstract public void getCredential(String credentialId);

	abstract public void update(String credentialId, String projectId, String type, String userId, String blob);

	abstract public void delete(String credentialId);

}
