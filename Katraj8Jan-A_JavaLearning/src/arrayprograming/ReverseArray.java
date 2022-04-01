package arrayprograming;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 12, 55, 88, 44, 55, 66, 88, 99, 77, 44, 100, 55, 6600, 55, 789, 786, 55698 };

		// Printing of given array
		System.out.println("Before Reversing: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		
		System.out.println();
		
		// Printing of Array After Reversing it
		System.out.println("After Reversing: ");
		for (int i = a.length-1; i>=0; i--)
			System.out.print(a[i] + " ");
	}
}
