package practice;

public class NumberSwapping {


	public static void main(String[] args) {
		int a = 20;
		int b = 21;

		a = a+b;   //a=41
		b = a-b;   // a= 41; b =21, final b = 20
		a = a-b;   // a=41; b=20, final a = 21
		System.out.println("a: " + a);
		System.out.println("b: "+ b);
	}
}
