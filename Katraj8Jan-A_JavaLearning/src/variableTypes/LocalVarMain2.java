package variableTypes;

public class LocalVarMain2 {

	int a =100; // Non static Var
	
	static float b = 55.29f;  // static var
	
	public void method1() {
		int a = 500; // local var
		boolean b = false; ///local var
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(LocalVarMain2.b);
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		LocalVarMain2 localVarMain2= new LocalVarMain2();
		localVarMain2.method1();
	}
}
