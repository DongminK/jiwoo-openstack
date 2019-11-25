package jiwoo.openstack.wrapping.keystone.request;

import org.json.JSONObject;

public interface RestRequest {

	public String getUrl();

	public JSONObject toJsonObject();

	public String toJsonString();

}
