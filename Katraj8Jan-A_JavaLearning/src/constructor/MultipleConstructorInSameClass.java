package constructor;

public class MultipleConstructorInSameClass {

	public MultipleConstructorInSameClass() {
		System.out.println("Constructor is running - without argument");
	}

	public MultipleConstructorInSameClass(boolean a) {
		this(); 
		//Using this keyword we can match the argument of another constructor to call another constructor inside constructor
		//this is called constructor chaining of same class
		System.out.println("Constructor is runnning - with argument");
	}

	public static void main(String[] args) {
		MultipleConstructorInSameClass obj1 = new MultipleConstructorInSameClass(true);
	}

}
