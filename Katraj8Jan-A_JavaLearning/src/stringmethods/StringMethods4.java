package stringmethods;

public class StringMethods4 {

	public static void main(String[] args) {
		String s = "  value    ";
		System.out.println(s);
		String res = s.trim();
		System.out.println(res);
		
		String s1 = "acbcdefc";
		int resin = s1.lastIndexOf('c');
		System.out.println(resin);
		
		String s2 = "abcdefg";
		boolean resContains = s2.contains("def");
		System.out.println(resContains);
	}
}
