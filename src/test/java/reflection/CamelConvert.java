package reflection;

public class CamelConvert {

	public static void main(String[] args) {
		
		String s = "TestCamel";
		System.out.println(s.replaceAll("(.)(\\p{Upper})", "$1.$2").toLowerCase());

	}
}
