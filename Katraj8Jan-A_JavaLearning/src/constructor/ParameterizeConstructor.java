package constructor;

public class ParameterizeConstructor {

	public ParameterizeConstructor(int a) { 
		System.out.println("I am Constructor with argument running on obj creation");
	}

	public static void main(String[] args) {

		ParameterizeConstructor constructorIntro = new ParameterizeConstructor(10);
	}
}

