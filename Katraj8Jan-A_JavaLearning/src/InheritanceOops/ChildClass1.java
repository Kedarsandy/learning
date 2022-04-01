package InheritanceOops;

public class ChildClass1 extends ParentClass {

	
	public static void m4() {
		System.out.println("M4 is static method of ChildClass1");
	}
	
	public void m5() {
		System.out.println("M5 is Non static method of ChildClass1");
	}
	
	public static void main(String[] args) {
		m3();
		ChildClass1 child1Obj= new ChildClass1();
		child1Obj.m1();
		child1Obj.m2();
	}
}
