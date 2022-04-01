package practice;

public class EvenOddWithoutLoop {

	
	public EvenOddWithoutLoop(int a) {
		
		if(a%2==0) {
			System.out.println(a + " is even number");
		}
		
		else {
			System.out.println(a+" is odd number");
		}
	}
	
	public static void main(String[] args) {
		EvenOddWithoutLoop conExe= new EvenOddWithoutLoop(15);
	}
}
