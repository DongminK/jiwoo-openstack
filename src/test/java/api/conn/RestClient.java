package api.conn;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestClient {

	private String apiKey = "";
	private HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public void get(String requestURL) {
		try {
			HttpGet getRequest = new HttpGet(requestURL);
			getRequest.addHeader("X-Auth-Token", apiKey);

			HttpResponse response = client.execute(getRequest);

			// Response 출력
			int returnCode = response.getStatusLine().getStatusCode();

			if (returnCode >= 200 && returnCode < 300) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				System.out.println(body);
			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

	public void post(String requestURL, String jsonMessage) {

		try {
			
			HttpPost postRequest = new HttpPost(requestURL); // POST 메소드 URL 새성
			postRequest.setHeader("Accept", "application/json");
			postRequest.setHeader("Connection", "keep-alive");
			postRequest.setHeader("Content-Type", "application/json");
			postRequest.addHeader("X-Auth-Token", apiKey); // KEY 입력

			postRequest.setEntity(new StringEntity(jsonMessage)); // json 메시지 입력

			HttpResponse response = client.execute(postRequest);

			// Response 출력
			int returnCode = response.getStatusLine().getStatusCode();

			if (returnCode >= 200 && returnCode < 300) {
				ResponseHandler<String> handler = new BasicResponseHandler();
				String body = handler.handleResponse(response);
				System.out.println(body);

				Header[] header = response.getHeaders("X-Subject-Token");
				if (header != null && header.length > 0) {
					apiKey = header[0].getValue();
				}

			} else {
				System.out.println("response is error : " + response.getStatusLine().getStatusCode());
				System.out.println(response.getStatusLine().toString());
			}
			
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
