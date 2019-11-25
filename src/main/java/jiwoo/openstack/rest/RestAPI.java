package jiwoo.openstack.rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

public class RestAPI {

	private static HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성

	public static String get(APIKey key, String url) throws Exception {
		return get(key, url, new BasicResponseHandler());
	}

	public static String get(APIKey key, String url, BasicResponseHandler responseHandler) throws Exception {

		HttpGet getRequest = new HttpGet(url);

		if (key != null) {
			getRequest.addHeader("X-Auth-Token", key.getToken());
		}

		HttpResponse response = client.execute(getRequest);

		// Response 출력
		int returnCode = response.getStatusLine().getStatusCode();

		if (returnCode >= 200 && returnCode < 300) {
			return responseHandler.handleResponse(response);
		} else {
			String exception = "[" + returnCode + "] " + response.getStatusLine().toString();
			throw new RestException(exception);
		}

	}

	public static String post(APIKey key, String url, JSONObject data) throws Exception {
		return post(key, url, data, new BasicResponseHandler());
	}

	public static String post(APIKey key, String url, JSONObject data, BasicResponseHandler responseHandler) throws Exception {

		HttpPost postRequest = new HttpPost(url); // POST 메소드 URL 새성
		postRequest.setHeader("Accept", "application/json");
		postRequest.setHeader("Connection", "keep-alive");
		postRequest.setHeader("Content-Type", "application/json");

		if (key != null) {
			postRequest.addHeader("X-Auth-Token", key.getToken()); // KEY 입력
		}

		postRequest.setEntity(new StringEntity(data.toString())); // json 메시지 입력

		HttpResponse response = client.execute(postRequest);

		// Response 출력
		int returnCode = response.getStatusLine().getStatusCode();

		if (returnCode >= 200 && returnCode < 300) {
			return responseHandler.handleResponse(response);
		} else {
			String exception = "[" + returnCode + "] " + response.getStatusLine().toString();
			throw new RestException(exception);
		}

	}
}
