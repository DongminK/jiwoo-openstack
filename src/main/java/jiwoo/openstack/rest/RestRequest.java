package jiwoo.openstack.rest;

import java.util.HashMap;

import org.json.JSONObject;

public interface RestRequest {

	public HashMap<String, String> getHeaders();

	public String getHttpMethod();

	public String getPostResponseMethod();

	public String getUrl();

	public JSONObject toJsonObject();

	public String toJsonString();

}
