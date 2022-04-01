package InheritanceOops;

public class ChildClass2 extends ChildClass1{

	public static void m6() {
		System.out.println("M6 is static method of ChildClass2");
	}
	
	public static void main(String[] args) {
		m3();
		ChildClass2 child2Obj= new ChildClass2();
		child2Obj.m1();
		child2Obj.m2();
		
		m4();
		child2Obj.m5();
	}
	
}
