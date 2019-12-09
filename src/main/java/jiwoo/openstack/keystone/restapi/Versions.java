package jiwoo.openstack.keystone.restapi;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.keystone.KeystoneConstants;
import jiwoo.openstack.keystone.versions.VersionsRequest;
import jiwoo.openstack.keystone.versions.VersionsResponse;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class Versions extends RestHandler {

	private Logger logger = LoggerFactory.getLogger(Versions.class);

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return KeystoneConstants.VERSIONS;
	}

	@Override
	public VersionsRequest getRequest() {
		// TODO Auto-generated method stub
		return (VersionsRequest) restRequest;
	}

	@Override
	public VersionsResponse getResponse() {
		// TODO Auto-generated method stub
		return (VersionsResponse) restResponse;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getRequestClass() {
		// TODO Auto-generated method stub
		return VersionsRequest.class;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class getResponseClass() {
		// TODO Auto-generated method stub
		return VersionsResponse.class;
	}

	@Override
	protected String execute() throws Exception {
		// TODO Auto-generated method stub
		RestAPI.get(null, getUrl(), restResponse);

		JSONObject jResponse = restResponse.toJsonObject();

		JSONObject jVersions = jResponse.getJSONObject("versions");
		JSONArray jArrValues = jVersions.getJSONArray("values");

		for (int i = 0, size = jArrValues.length(); i < size; i++) {
			JSONObject jValue = jArrValues.getJSONObject(i);
			String status = jValue.getString("status");

			if (status.compareTo("stable") == 0) {
				String id = jValue.getString("id"); // Version
				JSONArray jArrLinks = jValue.getJSONArray("links");

				for (int j = 0, linkSize = jArrLinks.length(); i < linkSize; j++) {
					JSONObject jLink = jArrLinks.getJSONObject(j);
					String rel = jLink.getString("rel");

					if (rel.compareTo("self") == 0) {
						String href = jLink.getString("href");
						int lastIdx = href.lastIndexOf("/");

						openstack.setVer(id.replace(".", "_"));
						openstack.setUrl(href.substring(0, lastIdx));
						break;
					}
				}
				break;
			}
		}

		logger.info("[RESULT][" + openstack.getVer() + "] " + jResponse);

		return jResponse.toString();
	}

}
