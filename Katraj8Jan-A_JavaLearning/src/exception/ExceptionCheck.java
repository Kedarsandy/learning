package exception;

public class ExceptionCheck {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("1");
		System.out.println("2");
		Thread.sleep(5000);    ///5 sec ke hold   ///Checked Exception
//		System.out.println(100/0); 
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
	
}
