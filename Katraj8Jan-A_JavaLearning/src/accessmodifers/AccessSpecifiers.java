package accessmodifers;

 public class AccessSpecifiers {

	public static int a = 20;   //20
	
	public static void m1() {
		System.out.println("Static method present in AccessSpecifiers class");
	}
	
	 public static void main(String[] args) {
	m1();
	System.out.println(a);
	a =25;
	System.out.println(a);
	
	}
}
