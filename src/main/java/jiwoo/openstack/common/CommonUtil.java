package jiwoo.openstack.common;

import java.lang.reflect.Method;

import jiwoo.openstack.keystone.Keystone;

public class CommonUtil {

	@SuppressWarnings("rawtypes")
	public static Object getClassByVersion(Class clzRequest, Keystone info) throws Exception {

		String pkg = clzRequest.getPackage().getName();
		String clzName = clzRequest.getSimpleName();
		String version = info.getVer();

		if (clzName.startsWith("I"))
			clzName = clzName.substring(1);
		else if (clzName.startsWith("Abstract"))
			clzName = clzName.replace("Abstract", "");

		String fullPkgName = pkg + ".";
		fullPkgName += version == null ? "" : version + ".";
		fullPkgName += clzName;

		Class clz = Class.forName(fullPkgName);

		if (clz != null) {
			return clz.newInstance();
		}

		return null;
	}

	public static Object executeMethod(Object obj, String name, String param) throws Exception {
		Method method = obj.getClass().getDeclaredMethod(name, String.class);
		method.setAccessible(true);
		return method.invoke(obj, param);
	}

}
