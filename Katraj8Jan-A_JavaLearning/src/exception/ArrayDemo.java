package exception;

public class ArrayDemo {

	
	
	
	public static void main(String[] args) {
		int a[] = {11,22,53,44,65} ;  //size of array  5 digit array 
		
		System.out.println(a[5]);   // indexing will take place from 0 to 4// last number will stay in indices of 4
		// anything beyond 4 index will throw ArrayOutOfBondException
	}
}
