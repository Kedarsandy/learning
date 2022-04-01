package castingclass;

public class Child extends Parent {

	public void m2() {
		System.out.println("m2 is child method");
	}
	
	public static void main(String[] args) {
		Parent parRef= new Parent();
		Child ch = (Child)parRef;
		ch.m2();
	}
}
