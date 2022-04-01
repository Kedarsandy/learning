package variableTypes;

public class NonStaticVar {

	public int a = 60;
	
	public static void main(String[] args) {
		NonStaticVar obj1 = new NonStaticVar();
		System.out.println(obj1.a);
		
		NonStaticVar obj2 = new NonStaticVar();
		obj2.a =100;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
