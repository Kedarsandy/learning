package argumentsandreturntype;

public class WithoutArgumentsAndWithoutReturnTypeMethod {

	public static void m1() {
		
		System.out.println("Without Argument And Without Return Type "+" Static Method");
	}
	
	public void m2() {
		System.out.println("Without Argument And Without Return Type "+" Non-Static Method");
	}
	
	public static void main(String[] args) {
		m1();
		WithoutArgumentsAndWithoutReturnTypeMethod obj= new WithoutArgumentsAndWithoutReturnTypeMethod();
		obj.m2();
	}
	
}
