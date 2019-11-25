package jiwoo.openstack.wrapping.keystone;

public class KeystoneManager {

	private static KeystoneManager keystoneManager = new KeystoneManager();

	private KeystoneManager() {
	}

	public static KeystoneManager getInstacne() {
		return keystoneManager;
	}

}
