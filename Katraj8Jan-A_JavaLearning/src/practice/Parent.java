package practice;

public class Parent {

	public Parent() { // default constructor
		this(true, 55);
		System.out.println("Con1");
	}

	public Parent(int a) { // parametrized constructor
		main(50);
		System.out.println("Con2");
	}

	public Parent(boolean a, int b) { // with arg method
		this(66);
		System.out.println("Con3");
	}

	public static boolean main(boolean k) { // with arg with return method
		System.out.println("Main1");
		return true;
	}

	public void main(int v) { // overloaded main method
		System.out.println("Main2");
	}

	public static void main(String[] args) {
		new Parent();
		System.out.println(main(false));
	}
}
