package casting;

public class TypeCasting2Ch {

	public static void main(String[] args) {
		short a = 128;
		short b = 21;

		int c = a + b;   ///while doing operation JVM is set on int and it is performing upcasting 
		System.out.println(c);
	}
}
