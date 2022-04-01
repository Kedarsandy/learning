package stringcheck;

public class StringImutabilityCheck {

	public static void main(String[] args) {
		String abc = "avdhut";
		///String is by default final and immutable
		
		abc = "pawar";
		// upon changing the string object content it will always create new object 
		//it will not update or change the previous object content 
		// this proves string is immutable and final 
	}
}
