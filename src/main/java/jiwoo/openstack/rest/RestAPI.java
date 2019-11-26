package jiwoo.openstack.rest;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
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

		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Accept", "application/json");
		httpGet.setHeader("Connection", "keep-alive");
		httpGet.setHeader("Content-Type", "application/json");

		if (key != null) {
			httpGet.addHeader("X-Auth-Token", key.getToken());
		}

		HttpResponse response = client.execute(httpGet);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String post(APIKey key, String url, JSONObject data) throws Exception {
		return post(key, url, data, new BasicResponseHandler());
	}

	public static String post(APIKey key, String url, JSONObject data, BasicResponseHandler responseHandler) throws Exception {

		HttpPost httpPost = new HttpPost(url); // POST 메소드 URL 새성
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Connection", "keep-alive");
		httpPost.setHeader("Content-Type", "application/json");

		if (key != null) {
			httpPost.addHeader("X-Auth-Token", key.getToken()); // KEY 입력
		}

		httpPost.setEntity(new StringEntity(data.toString())); // json 메시지 입력

		HttpResponse response = client.execute(httpPost);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String put(APIKey key, String url, JSONObject data) throws Exception {
		return put(key, url, data, new BasicResponseHandler());
	}

	public static String put(APIKey key, String url, JSONObject data, BasicResponseHandler responseHandler) throws Exception {

		HttpPut httpPut = new HttpPut(url); // PUT 메소드 URL 새성
		httpPut.setHeader("Accept", "application/json");
		httpPut.setHeader("Connection", "keep-alive");
		httpPut.setHeader("Content-Type", "application/json");

		if (key != null) {
			httpPut.addHeader("X-Auth-Token", key.getToken()); // KEY 입력
		}

		httpPut.setEntity(new StringEntity(data.toString())); // json 메시지 입력

		HttpResponse response = client.execute(httpPut);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String delete(APIKey key, String url) throws Exception {
		return delete(key, url, new BasicResponseHandler());
	}

	public static String delete(APIKey key, String url, BasicResponseHandler responseHandler) throws Exception {

		HttpDelete httpDelete = new HttpDelete(url); // DELETE 메소드 URL 새성
		httpDelete.setHeader("Accept", "application/json");
		httpDelete.setHeader("Connection", "keep-alive");
		httpDelete.setHeader("Content-Type", "application/json");

		if (key != null) {
			httpDelete.addHeader("X-Auth-Token", key.getToken()); // KEY 입력
		}

		HttpResponse response = client.execute(httpDelete);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String head(APIKey key, String url) throws Exception {
		return head(key, url, new BasicResponseHandler());
	}

	public static String head(APIKey key, String url, BasicResponseHandler responseHandler) throws Exception {

		HttpHead httpHead = new HttpHead(url); // HEAD 메소드 URL 새성
		httpHead.setHeader("Accept", "application/json");
		httpHead.setHeader("Connection", "keep-alive");
		httpHead.setHeader("Content-Type", "application/json");

		if (key != null) {
			httpHead.addHeader("X-Auth-Token", key.getToken()); // KEY 입력
		}

		HttpResponse response = client.execute(httpHead);

		// Response 출력
		return responseHandler.handleResponse(response);

	}
}
