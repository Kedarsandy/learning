package constructor;

public class UserDefineDefaultConstructor {

	public UserDefineDefaultConstructor() { 
		System.out.println("I am Constructor without argument running on obj creation");
	}

	public static void main(String[] args) {

		UserDefineDefaultConstructor constructorIntro = new UserDefineDefaultConstructor();
	}
}
