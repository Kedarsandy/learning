package exception;

public class ThrowsCheck {

	public static void main(String[] args) throws InterruptedException{
		
		for(int a =0; a<=10; a++) {
			if(a<5) {
				System.out.println("less than five : " + a );
			}
			
			Thread.sleep(5000);
			int c = 100/0;
			
			if(a>5) {
				System.out.println("greater than five : " + a);
			}
		}
	}
}
