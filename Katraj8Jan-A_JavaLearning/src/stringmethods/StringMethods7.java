package stringmethods;

public class StringMethods7 {

	public static void main(String[] args) {
		String s1 = "avdhut pawar";
		
		String[] output = s1.split("\\s");
		
		for(String result:output)
		{
			System.out.println(result);
		}
	}
}
