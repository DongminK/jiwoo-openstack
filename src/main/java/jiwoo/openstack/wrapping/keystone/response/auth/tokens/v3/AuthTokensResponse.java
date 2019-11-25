package jiwoo.openstack.wrapping.keystone.response.auth.tokens.v3;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.apache.http.impl.client.BasicResponseHandler;

import jiwoo.openstack.rest.APIKey;
import jiwoo.openstack.wrapping.keystone.response.auth.tokens.IAuthTokensResponse;

public class AuthTokensResponse extends BasicResponseHandler implements IAuthTokensResponse {

	private APIKey apiKey = null;

	@Override
	public APIKey getAPIKey() {
		// TODO Auto-generated method stub
		return apiKey;
	}

	@Override
	public String handleResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException {

		String response = super.handleResponse(httpResponse);
		String token = null;

		Header[] header = httpResponse.getHeaders("X-Subject-Token");
		if (header != null && header.length > 0) {
			token = header[0].getValue();
			apiKey = new APIKey(token);
		}

		return response;

	}

}
