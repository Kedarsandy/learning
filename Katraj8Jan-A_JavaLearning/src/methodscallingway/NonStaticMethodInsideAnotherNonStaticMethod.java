package methodscallingway;

public class NonStaticMethodInsideAnotherNonStaticMethod {

	public void m1() {
		System.out.println("I am m1 Non Static ");
	}
	
	public void m2() {
		m1();
	}
	
	public static void main(String[] args) {
		NonStaticMethodInsideAnotherNonStaticMethod obj1 = new NonStaticMethodInsideAnotherNonStaticMethod();
		obj1.m2();
	}
}
