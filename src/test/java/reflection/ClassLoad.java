package reflection;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarFile;

public class ClassLoad {

	public static void main(String[] args) throws Exception {

		String pkg = "jiwoo.openstack.wrapping.keystone.restapi";
		System.out.println(pkg);

		System.out.println(getClassList("src/main/java", pkg));

	}

	public static List getClassList(String libPath, String packagePath) throws IOException {
		List classList = new ArrayList();
		Package targetPackage = Package.getPackage(packagePath);
		if (targetPackage == null) {
			System.err.printf("Inserted Package Path(%s) is invalid!!", packagePath);
			return null;
		}

		if (new File(libPath).exists() == false) {
			System.err.printf("Invalid class path(%s)!!", libPath);
			return null;
		}
		if (libPath.toUpperCase().endsWith(".JAR")) {
			JarFile jf = new JarFile(libPath);
			for (Enumeration e = jf.entries(); e.hasMoreElements();) {
				String path = e.nextElement().toString().replace("/", ".");
				if (path.endsWith(".class") && path.startsWith(packagePath)) {
					classList.add(path.replace(".class", ""));
					System.out.println(path.replace(".class", ""));
				}
			}
		} else {
			if (new File(libPath).isDirectory() == false) {
				System.err.printf("Invalid class path(%s)!!", libPath);
				return null;
			}
			File[] files = new File(libPath).listFiles();
			for (int i = 0; i < files.length; i++) {
				String path = files[i].getName().replace("/", ".");
				if (path.endsWith(".class")) {
					classList.add(packagePath + "." + path.replace(".class", ""));
					System.out.println(packagePath + "." + path.replace(".class", ""));
				}
			}
		}

		return classList;
	}

}
