package argumentsandreturntype;

public class WithArgumentAndWithReturnType {

	public int m1(int a) {
		return 20;
	}
	
	public static void main(String[] args) {
		WithArgumentAndWithReturnType obj = new WithArgumentAndWithReturnType();
		System.out.println(obj.m1(20));
	}
}
