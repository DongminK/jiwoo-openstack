package jiwoo.openstack.common;

import jiwoo.openstack.rest.APIKey;

public interface Openstack {

	public String getUrl();

	public String getVer();

	public void setUrl(String url);

	public void setVer(String ver);

	public APIKey getApiKey();

	public void setToken(String token);

}
