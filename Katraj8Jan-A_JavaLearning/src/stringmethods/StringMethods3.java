package stringmethods;

public class StringMethods3 {

	public static void main(String[] args) {
		String s2 = "abcDDLJ";
		
		String subString = s2.substring(1,7);
		System.out.println(subString);
		
		String s = "123456abcded";
		int  resL = s.length();
		System.out.println(resL);
		
		String s1 = "ababa";
		 String resuCh = s1.replace('a', 'b');
		 System.out.println(resuCh);
		 
		 String s3 = "AB1FDD";
		 String resLowCase= s3.toLowerCase();
		 System.out.println(resLowCase);
		 
		 String s4 = "dd2s";
		 String resUpCase = s4.toUpperCase();
		 System.out.println(resUpCase);
	}
}
