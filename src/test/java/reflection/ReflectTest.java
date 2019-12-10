package reflection;

import java.lang.reflect.Method;

public class ReflectTest {

	public static void main(String args[]) {

		try {
			Class c = Class.forName("jiwoo.openstack.wrapping.keystone.v3.request.auth.tokens.AuthTokensRequest");
			Method m[] = c.getDeclaredMethods();
			for (int i = 0; i < m.length; i++)
				System.out.println(m[i].toString());

		} catch (Throwable e) {
			System.err.println(e);
		}

		test();

	}

	public static void test() {

		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
			System.out.println(ste.getMethodName());
		}

	}

}
