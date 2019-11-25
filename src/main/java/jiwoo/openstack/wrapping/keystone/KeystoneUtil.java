package jiwoo.openstack.wrapping.keystone;

public class KeystoneUtil {

	@SuppressWarnings("rawtypes")
	public static Object getClassByVersion(Class clzRequest, KeystoneInfo info) throws Exception {

		String pkg = clzRequest.getPackage().getName();
		String clzName = clzRequest.getSimpleName().substring(1);

		String fullPkgName = pkg + "." + info.getVer() + "." + clzName;

		Class clz = Class.forName(fullPkgName);

		if (clz != null) {
			return clz.newInstance();
		}

		return null;
	}

}
