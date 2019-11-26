package jiwoo.openstack.rest;

import org.json.JSONObject;

public interface RestRequest {

	public String getHttpMethod();

	public String getPostResponseMethod();

	public String getUrl();

	public JSONObject toJsonObject();

	public String toJsonString();

}
