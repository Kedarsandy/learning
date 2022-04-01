package inheritanceofvariables;

public class InheritanceVar2 extends InheritanceVar {
	int a = 1;
	static int b = 2;
	
	public void m1() {
		System.out.println(a);   //child wala 
		System.out.println(super.a);  //parent wala
		System.out.println(b);  //child wala
		System.out.println(InheritanceVar.b); //parent wala
	}
	
	public static void main(String[] args) {
		InheritanceVar2 child = new InheritanceVar2();
		child.m1();
	}
}
