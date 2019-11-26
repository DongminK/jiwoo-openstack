package api.keystone;

import jiwoo.openstack.keystone.KeystoneManager;

public class KeystoneTest {

	public static void main(String[] args) throws Exception {

		String domain = "Default";
		String user = "admin";
		String password = "insoft00";

		KeystoneManager keystone = new KeystoneManager();
		keystone.connect("http://192.168.119.31:5000");
		String response = keystone.auth(domain, user, password);

		System.out.println(response);

	}

}
