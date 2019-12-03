package jiwoo.openstack.rest;

import java.util.HashMap;

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

	public static String get(HashMap<String, String> mapHeaders, String url) throws Exception {
		return get(mapHeaders, url, new BasicResponseHandler());
	}

	public static String get(HashMap<String, String> mapHeaders, String url, BasicResponseHandler responseHandler)
			throws Exception {

		HttpGet httpGet = new HttpGet(url);
		httpGet.setHeader("Accept", "application/json");
		httpGet.setHeader("Connection", "keep-alive");
		httpGet.setHeader("Content-Type", "application/json");

		if (mapHeaders != null) {
			for (String key : mapHeaders.keySet()) {
				httpGet.addHeader(key, mapHeaders.get(key));
			}
		}

		HttpResponse response = client.execute(httpGet);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String post(HashMap<String, String> mapHeaders, String url, JSONObject data) throws Exception {
		return post(mapHeaders, url, data, new BasicResponseHandler());
	}

	public static String post(HashMap<String, String> mapHeaders, String url, JSONObject data,
			BasicResponseHandler responseHandler) throws Exception {

		HttpPost httpPost = new HttpPost(url); // POST 메소드 URL 새성
		httpPost.setHeader("Accept", "application/json");
		httpPost.setHeader("Connection", "keep-alive");
		httpPost.setHeader("Content-Type", "application/json");

		if (mapHeaders != null) {
			for (String key : mapHeaders.keySet()) {
				httpPost.addHeader(key, mapHeaders.get(key));
			}
		}

		httpPost.setEntity(new StringEntity(data.toString())); // json 메시지 입력

		HttpResponse response = client.execute(httpPost);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String put(HashMap<String, String> mapHeaders, String url, JSONObject data) throws Exception {
		return put(mapHeaders, url, data, new BasicResponseHandler());
	}

	public static String put(HashMap<String, String> mapHeaders, String url, JSONObject data,
			BasicResponseHandler responseHandler) throws Exception {

		HttpPut httpPut = new HttpPut(url); // PUT 메소드 URL 새성
		httpPut.setHeader("Accept", "application/json");
		httpPut.setHeader("Connection", "keep-alive");
		httpPut.setHeader("Content-Type", "application/json");

		if (mapHeaders != null) {
			for (String key : mapHeaders.keySet()) {
				httpPut.addHeader(key, mapHeaders.get(key));
			}
		}

		httpPut.setEntity(new StringEntity(data.toString())); // json 메시지 입력

		HttpResponse response = client.execute(httpPut);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String delete(HashMap<String, String> mapHeaders, String url) throws Exception {
		return delete(mapHeaders, url, new BasicResponseHandler());
	}

	public static String delete(HashMap<String, String> mapHeaders, String url, BasicResponseHandler responseHandler)
			throws Exception {

		HttpDelete httpDelete = new HttpDelete(url); // DELETE 메소드 URL 새성
		httpDelete.setHeader("Accept", "application/json");
		httpDelete.setHeader("Connection", "keep-alive");
		httpDelete.setHeader("Content-Type", "application/json");

		if (mapHeaders != null) {
			for (String key : mapHeaders.keySet()) {
				httpDelete.addHeader(key, mapHeaders.get(key));
			}
		}

		HttpResponse response = client.execute(httpDelete);

		// Response 출력
		return responseHandler.handleResponse(response);

	}

	public static String head(HashMap<String, String> mapHeaders, String url) throws Exception {
		return head(mapHeaders, url, new BasicResponseHandler());
	}

	public static String head(HashMap<String, String> mapHeaders, String url, BasicResponseHandler responseHandler)
			throws Exception {

		HttpHead httpHead = new HttpHead(url); // HEAD 메소드 URL 새성
		httpHead.setHeader("Accept", "application/json");
		httpHead.setHeader("Connection", "keep-alive");
		httpHead.setHeader("Content-Type", "application/json");

		if (mapHeaders != null) {
			for (String key : mapHeaders.keySet()) {
				httpHead.addHeader(key, mapHeaders.get(key));
			}
		}

		HttpResponse response = client.execute(httpHead);

		// Response 출력
		return responseHandler.handleResponse(response);

	}
}
