package stringmethods;

public class StringMethods1 {

	public static void main(String[] args) {

		String s = "abc";
		char storingChar = s.charAt(2);
		System.out.println(storingChar);

		String s2 = "def";
		String stroringResult = s.concat(s2);
		System.out.println(stroringResult);
		
		boolean Checkresult = s.equals(s2);
		System.out.println(Checkresult);

	}
}
