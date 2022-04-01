package arraycheck;

public class WaysToDeclare {

	public static void main(String[] args) {
		int[] checkingArray = new int[5];   //one of way of writing an array using new keyword
		
		//initialization of an array
		checkingArray[0]=22;
		checkingArray[1]=33;
		checkingArray[2]=44;
		checkingArray[3]=56;
		checkingArray[4]=88;
		
		for(int i=0;i<5;i++)
			System.out.println(checkingArray[i]);
	}
	
}

