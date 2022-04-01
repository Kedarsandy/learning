package methodscallingway;

public class StaticMethodInsideStaticMethod {

	
	public static void m1() {
		System.out.println("I am M1 Static Method");
	}
	
	public static void m2() {
		m1();
	}
	
	public static void main(String[]args) {
		m2();
	}
}
