package methodscallingway;

public class NonStaticMethodInsideStaticMethod {

	public void m1() {
		System.out.println("m1 is running which non static called under static");
	}
	
	public static void m2() {
		NonStaticMethodInsideStaticMethod obj = new NonStaticMethodInsideStaticMethod();
		obj.m1();
	}
	
	public static void main(String[] args) {
		m2();
	}
}
