package stringmethods;

public class StringMethods5 {

	public static void main(String[] args) {
		String a = "check"; 
		System.out.println("string :----- " + a);
		
		char[] outArray = a.toCharArray();
		for(int i=0; i<outArray.length; i++)
			System.out.println(outArray[i]);
		
	}
}
