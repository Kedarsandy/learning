package inheritanceofconstructor;

public class Child2 extends Child1 {

	public Child2(int vv) {
		super('a');
		System.out.println("Constructor of Child2");
	}
	
	public static void main(String[] args) {
		new Child2(100);
	}
}
