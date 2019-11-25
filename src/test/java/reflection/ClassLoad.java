package reflection;

import java.lang.reflect.Method;

import jiwoo.openstack.wrapping.keystone.KeystoneConstants;
import jiwoo.openstack.wrapping.keystone.KeystoneInfo;
import jiwoo.openstack.wrapping.keystone.request.auth.tokens.IAuthTokensRequest;

public class ClassLoad {

	public static void main(String[] args) {

		KeystoneInfo info = new KeystoneInfo("http://192.168.119.31:5000");
		info.setVer(KeystoneConstants.VER_3_9);
		String clzName = "AuthTokens";
		String pkgName = getPkgName(clzName);

		String pkg = "";//KeystoneConstants.PACKAGE + "." + IAuthTokensRequest.PKG_NAME + "." + info.getVer() + "." + clzName + "Request";
		System.out.println(pkg);

		try {
			Class c = Class.forName(pkg);
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());

		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

	public static String getPkgName(String className) {
		String pkgName = className.replaceAll("(.)(\\p{Upper})", "$1.$2").toLowerCase();
		return pkgName;
	}
}
