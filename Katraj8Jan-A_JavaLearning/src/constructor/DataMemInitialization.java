package constructor;

public class DataMemInitialization {

	int a;
	int b;
	int c;
	
	public DataMemInitialization(int a, int b, int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println(a + b + c);
	
	
		
	}
	
	public static void main(String[]args) {
		DataMemInitialization obj = new DataMemInitialization(10,20,50);
	}
}
