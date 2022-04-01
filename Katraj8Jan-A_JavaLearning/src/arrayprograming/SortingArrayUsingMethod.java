package arrayprograming;

import java.util.Arrays;

public class SortingArrayUsingMethod {

	public static void main(String[] args) {
		int[] a = { 200, 105, 45, 81, 1, 545, 478, 65, 448, 568, 28, 45, 888, 445, 88, 66, 8, 8, 6, 82558, 8, 555, 22,
				88, 66, 22, 6, 6, 8, 222, 5 };

		Arrays.sort(a);
		
		for(int i = 0; i<a.length;i++ )
			System.out.print(a[i]+ " ");
	}		
}
