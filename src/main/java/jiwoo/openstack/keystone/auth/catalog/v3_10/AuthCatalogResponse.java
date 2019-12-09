package jiwoo.openstack.keystone.auth.catalog.v3_10;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.keystone.auth.catalog.AbstractAuthCatalogResponse;

public class AuthCatalogResponse extends AbstractAuthCatalogResponse {

	@Override
	protected JSONObject setResponse(HttpResponse httpResponse) throws HttpResponseException, IOException {
		// TODO Auto-generated method stub
		String response = baseHandleResponse(httpResponse);
		JSONObject jResponse = null;

		if (postResponseMethod != null) {
			try {
				jResponse = (JSONObject) CommonUtil.executeMethod(this, postResponseMethod, response);
			} catch (Exception e) {
				e.printStackTrace();
				jResponse = new JSONObject(response);
			}
		} else {
			jResponse = new JSONObject(response);
		}

		return jResponse;
	}

	@Override
	protected JSONObject getServiceCatalog(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getServiceCatalog");
		return new JSONObject(response);
	}

}
