package stringmethods;

public class StringMethods2 {

	public static void main(String[] args) {
		
		String s = "abc";
		String s1 = "ABC";
		
		boolean res = s.equalsIgnoreCase(s1);
		System.out.println(res);
	}
}
