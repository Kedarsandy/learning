package InheritanceOops;

public class LimitationInheritanceChild {
	
	
	public static void m100() {
		System.out.println("child property");
	}
	
	public static void main(String[]args) {
		
		ParentClass.m3();
		LimitationInheritanceParent.m3();   ///composition 
	}
}
