package jiwoo.openstack.keystone.response.auth.tokens;

import org.json.JSONObject;

import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestResponse;

abstract public class AbstractAuthTokensResponse extends RestResponse {

	abstract public APIKey getAPIKey();

	abstract protected JSONObject passwordAuthWithUnscopeAuthorization(String response);

	abstract protected JSONObject passwordAuthWithScopeAuthorization(String response);

}
