package customizedexception;

public class CustomException {

	public void m1(int age) {
		
		if(age<18)
			try {
				throw new IllegalArgumentException("Voting Is Not Allowed because age is below 18");	
			}
		catch(IllegalArgumentException refExcption) {
			
			System.out.println(refExcption.getMessage());
		}
			
		else
			System.out.println("Voting Is Allowed");
	}
	
	public static void main(String[] args) {
		CustomException ref = new CustomException();
			ref.m1(17);  ///handle
		
		 
		System.out.println("Upload Adhar card");  
	}
	
	
}
