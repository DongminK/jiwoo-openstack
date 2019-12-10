package jiwoo.openstack.rest;

import java.util.HashMap;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

abstract public class RestRequest {

	private HashMap<String, String> mapHeaders = new HashMap<String, String>();
	private JSONObject jData = null;
	private String methodName = null;
	private String httpMethod = HttpGet.METHOD_NAME;

	public HashMap<String, String> getHeaders() {
		return mapHeaders;
	}

	public void addHeader(String key, String value) {
		mapHeaders.put(key, value);
	}

	public void clearHeader() {
		mapHeaders.clear();
	}

	public String getResponseMethodName() {
		return methodName;
	}

	public void setResponseMethodName() {
		methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	protected void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	protected void setData(JSONObject jData) {
		this.jData = jData;
	}

	public JSONObject toJsonObject() {
		return jData;
	}

	public String toJsonString() {
		if (jData != null)
			return jData.toString();

		return "{}";
	}

	abstract protected String getUrl();
}
