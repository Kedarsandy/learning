package stringcheck;

public class StringWays {

	public static void main(String[] args) {
		
		String ss = new String("avdhut");  //Creates two object in heap memory and in SCP area
		
		String aa = new String("avdhut");
		
		String pp = new String ("Pawar");
		
		System.out.println(ss);
		System.out.println(aa);
		System.out.println(pp);
	}
}
