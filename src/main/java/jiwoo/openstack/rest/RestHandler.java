package jiwoo.openstack.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jiwoo.openstack.common.CommonUtil;
import jiwoo.openstack.common.Openstack;

public abstract class RestHandler {

	private Logger logger = LoggerFactory.getLogger(RestHandler.class);
	protected Openstack openstack;
	protected RestRequest restRequest = null;
	protected RestResponse restResponse = null;

	public void setOpenstackInfo(Openstack openstack) throws Exception {
		this.openstack = openstack;
		initialize(getRequestClass(), getResponseClass());
	}

	public String process() throws Exception {

		String response = null;

		try {
			logger.debug("[URL] " + getUrl());
			logger.debug("[REQ] " + (restRequest != null ? restRequest.toJsonString() : "{}"));
			response = execute();
			logger.debug("[RSP] " + response);
		} catch (Exception e) {
			logger.debug("[RSP][ERROR] " + e.toString());
			logger.error("", e);
		}

		return response;

	}

	protected String getUrl() {

		String reqUrl = restRequest.getUrl();
		if (!reqUrl.startsWith("/"))
			reqUrl = "/" + reqUrl;

		return openstack.getUrl() + reqUrl;
	}

	@SuppressWarnings("rawtypes")
	protected void initialize(Class restRequest, Class restResponse) throws Exception {
		this.restRequest = (RestRequest) CommonUtil.getClassByVersion(restRequest, openstack);
		this.restResponse = (RestResponse) CommonUtil.getClassByVersion(restResponse, openstack);
	}

	abstract public String getName();

	abstract public Object getRequest();

	abstract public Object getResponse();

	@SuppressWarnings("rawtypes")
	abstract protected Class getRequestClass();

	@SuppressWarnings("rawtypes")
	abstract protected Class getResponseClass();

	abstract protected String execute() throws Exception;

}
