package jiwoo.openstack.glance.request.versions;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

import jiwoo.openstack.rest.RestRequest;

public class VersionsRequest implements RestRequest {

	private JSONObject jData = new JSONObject();

	@Override
	public String getHttpMethod() {
		// TODO Auto-generated method stub
		return HttpGet.METHOD_NAME;
	}

	@Override
	public String getPostResponseMethod() {
		return null;
	}

	@Override
	public String getUrl() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public JSONObject toJsonObject() {
		// TODO Auto-generated method stub
		return jData;
	}

	@Override
	public String toJsonString() {
		// TODO Auto-generated method stub
		return jData.toString();
	}

	@Override
	public HashMap<String, String> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
