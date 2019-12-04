package jiwoo.openstack.keystone.response.auth.tokens;

import org.json.JSONObject;

import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.rest.RestResponse;

abstract public class AbstractAuthTokensResponse extends RestResponse {

	abstract public APIKey getAPIKey();

	abstract protected JSONObject passwordAuthWithUnscope(String response);

	abstract protected JSONObject passwordAuthWithSystemScope(String response);

	abstract protected JSONObject passwordAuthWithDomainIdScope(String response);

	abstract protected JSONObject passwordAuthWithDomainNameScope(String response);

	abstract protected JSONObject passwordAuthWithProjectIdScope(String response);

	abstract protected JSONObject passwordAuthWithProjectNameScope(String response);

	abstract protected JSONObject passwordAuthWithExplicitUnscope(String response);

	abstract protected JSONObject tokenAuthWithUnscope(String response);

	abstract protected JSONObject tokenAuthWithSystemScope(String response);

	abstract protected JSONObject tokenAuthWithDomainIdScope(String response);

	abstract protected JSONObject tokenAuthWithDomainNameScope(String response);

	abstract protected JSONObject tokenAuthWithProjectIdScope(String response);

	abstract protected JSONObject tokenAuthWithProjectNameScope(String response);

	abstract protected JSONObject tokenAuthWithExplicitUnscope(String response);

	abstract protected JSONObject getTokenInfo(String response);

	abstract protected JSONObject validateToken(String response);

	abstract protected JSONObject deleteToken(String response);
}
