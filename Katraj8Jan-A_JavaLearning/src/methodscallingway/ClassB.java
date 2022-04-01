package methodscallingway;

public class ClassB {

	
	public static void main(String[] args) {
		ClassAContainsNonStaticMeth obj = new ClassAContainsNonStaticMeth();
		obj.me2();
	}
}
