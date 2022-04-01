package argumentsandreturntype;

public class WithArgumentAndNoReturn {

	public void m1(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		WithArgumentAndNoReturn obj = new WithArgumentAndNoReturn();
		obj.m1(50, 50);
		
	}
}
