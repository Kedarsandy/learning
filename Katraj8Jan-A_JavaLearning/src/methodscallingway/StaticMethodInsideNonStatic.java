package methodscallingway;

public class StaticMethodInsideNonStatic {

	public static void m1() {
		System.out.println("M1 is static called under nonstatic");
	}
	
	public void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		StaticMethodInsideNonStatic obj = new StaticMethodInsideNonStatic();
		obj.m2();
	}
}
