package methods;

public class NonStaticMethod {

	
	public void method1() {
		System.out.println("Method1 is running which is non static");
	}
	
	public static void main(String[] args) {
		NonStaticMethod obj1 = new NonStaticMethod();
		
		obj1.method1();
		
		obj1.method1();
		
		System.out.println("avdhut is runnning ");
	
	}
}
