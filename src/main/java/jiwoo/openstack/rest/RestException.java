package jiwoo.openstack.rest;

public class RestException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RestException(String name) {
		super(name);
	}

	public RestException(Throwable th) {
		super(th);
	}

	public RestException(String name, Throwable th) {
		super(name, th);
	}

}
