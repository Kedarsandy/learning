package exception;



public class TryCatchF {

	
	public static void main(String[] args) {
		System.out.println("Login the application");
		System.out.println("performing Home page with several task");
		System.out.println("Buying shares");
		try {
			System.out.println(100/0 + "Selling shares after calculation");	
		}
		catch(NullPointerException c){
			System.out.println( c.getMessage());
		}
		catch(Exception d) {
			System.out.println( d.getMessage());
		}
		finally {
			System.out.println("CLosing DataBAse Access");
		}
		System.out.println("operation which do not requires database");
	}
}
