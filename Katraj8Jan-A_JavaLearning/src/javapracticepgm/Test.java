package javapracticepgm;

public class Test {

	public static void main(String[] args) {

		
		String a = "nitin";
		String rev = "";
		for(int i = a.length()-1;i>=0; i--) {
			rev = rev + a.charAt(i);
		}
		if(rev.equals(a))
			System.out.println(a + " is palindrome");
		else
			System.out.println(a + " is not palindrome");
	}
}