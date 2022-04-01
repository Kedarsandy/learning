package inheritanceofvariables;

public class InheritanceVar3 extends InheritanceVar2 {

	int a = 2000;
	static int b = 20;
	
	public void m1() {
		System.out.println(a);  
		System.out.println(super.a);
		InheritanceVar objThisClass = new InheritanceVar3();
		System.out.println(objThisClass.a);	
	}

	public static void main(String[] args) {
		InheritanceVar3 objLasChild = new InheritanceVar3();
		objLasChild.m1();
	}
}
