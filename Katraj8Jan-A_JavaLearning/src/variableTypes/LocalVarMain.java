package variableTypes;

public class LocalVarMain {

	int a = 55; // Non static Var
	static int b = 60; // Static vari
	
	public static void m1() {
		int a = 888;   // Local Var
		int b = 9000;   // Local var 
		
		System.out.println(a);
		System.out.println(b);
		
		LocalVarMain obj = new LocalVarMain();
		System.out.println(obj.a);
		
		System.out.println(LocalVarMain.b);
	}
	
	public static void main(String[] args) {
		m1();
	}
}
