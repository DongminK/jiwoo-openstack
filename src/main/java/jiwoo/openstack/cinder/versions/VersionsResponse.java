package jiwoo.openstack.cinder.versions;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.rest.RestResponse;

public class VersionsResponse extends RestResponse {

	@Override
	public String handleResponse(final HttpResponse httpResponse) throws HttpResponseException, IOException {
		// TODO Auto-generated method stub
		String response = null;

		try {
			if (httpResponse.getStatusLine().getStatusCode() == 300) {

				HttpEntity entity = httpResponse.getEntity();
				response = handleEntity(entity);

			} else {
				response = baseHandleResponse(httpResponse);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		jResponse = new JSONObject(response);

		return toJsonString();
	}

}
