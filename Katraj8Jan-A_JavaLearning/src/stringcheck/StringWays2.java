package stringcheck;

public class StringWays2 {


	public static void main(String[] args) {
		String a = "Ramesh";   // it creates one object in SCP area and ref will be in heap area
		String b = "Ramesh";
		a = "suresh";
		System.out.println(a);
		b = "suresh";
		
		
	}
	
}
