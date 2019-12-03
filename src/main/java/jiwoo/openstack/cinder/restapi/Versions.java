package jiwoo.openstack.cinder.restapi;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.cinder.CinderConstants;
import jiwoo.openstack.cinder.request.versions.VersionsRequest;
import jiwoo.openstack.cinder.response.versions.VersionsResponse;
import jiwoo.openstack.rest.RestAPI;
import jiwoo.openstack.rest.RestHandler;

public class Versions extends RestHandler {

	private Logger logger = LoggerFactory.getLogger(Versions.class);

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return CinderConstants.VERSIONS;
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

		JSONArray jArrVersions = jResponse.getJSONArray("versions");

		for (int i = 0, size = jArrVersions.length(); i < size; i++) {
			JSONObject jVersion = jArrVersions.getJSONObject(i);
			String status = jVersion.getString("status");

			System.out.println("status : " + status);

			if (status.compareTo("CURRENT") == 0) {
				String id = jVersion.getString("id"); // Version

				System.out.println("id : " + id);
				JSONArray jArrLinks = jVersion.getJSONArray("links");

				for (int j = 0, linkSize = jArrLinks.length(); j < linkSize; j++) {
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
