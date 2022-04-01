package variableTypes;

public class LocalVar {

	static int a;  // Global var - static var
	int b = 20;    // Global var - non static var
	
	public static void method1() {
		int a = 25;  /// Local Var
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		
		method1();
	}
}
