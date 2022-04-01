package methods;

public class StaticMethod {
	
	public static void meth1() {
		System.out.println("Meth1 is running which is static");
	}
	
	public static void meth2() {
		System.out.println("Meth2 is running which is static");
	}
	

	public static void main(String[] args) {
		meth2();
		meth1();
		
	}
}
