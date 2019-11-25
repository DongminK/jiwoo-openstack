package jiwoo.openstack.wrapping.keystone;

import org.apache.http.impl.client.BasicResponseHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.wrapping.keystone.request.RestRequest;

public abstract class RestHandler {

	private Logger logger = LoggerFactory.getLogger(RestHandler.class);
	protected KeystoneInfo keystoneInfo;
	protected RestRequest restRequest = null;
	protected BasicResponseHandler basicResponseHandler = new BasicResponseHandler();

	public void setKeystoneInfo(KeystoneInfo keystoneInfo) throws Exception {
		this.keystoneInfo = keystoneInfo;
		setRequest();
		setResponse();
	}

	public String process() throws Exception {

		String response = null;

		try {
			logger.debug("[REQ] " + restRequest.toJsonString());
			response = execute();
			logger.debug("[RSP] " + response);
		} catch (Exception e) {
			logger.debug("[RSP][ERROR] " + e.toString());
			logger.error("", e);
		}

		return response;

	}

	abstract public String getUrl();

	abstract public Object getRequest();

	abstract public Object getResponse();

	abstract protected void setRequest() throws Exception;

	protected void setResponse() throws Exception {
		this.basicResponseHandler = new BasicResponseHandler();
	}

	abstract protected String execute() throws Exception;

}
