package diffbetweenequals;

public class diffEqualsOpsAndMethod {
	
	public static void main(String[] args) {
	
		int f = 20;
		int z = 20;
		
		String a = "avdhut";   /// heap region memory would be different than memory with new keyword 
		String b = "avdhut";
		String c = new String("avdhut");
		
		System.out.println(a==c);   //false
		// == operator indicates the address of memory where content is stored
		
		System.out.println(a.equals(c));  // true 
		// .equals method indicates the comparision on content of that object
		
		System.out.println(f==z);
	}
}
