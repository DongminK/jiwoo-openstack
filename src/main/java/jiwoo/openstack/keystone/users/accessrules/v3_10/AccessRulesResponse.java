package jiwoo.openstack.keystone.users.accessrules.v3_10;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpResponseException;
import org.json.JSONObject;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.keystone.users.accessrules.AbstractAccessRulesResponse;

public class AccessRulesResponse extends AbstractAccessRulesResponse {

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
	protected JSONObject getAccessRules(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAccessRules");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject getAccessRule(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod getAccessRule");
		return new JSONObject(response);
	}

	@Override
	protected JSONObject deleteAccessRule(String response) {
		// TODO Auto-generated method stub
		System.out.println("Call TestMethod deleteAccessRule");
		return new JSONObject(response);
	}

}
