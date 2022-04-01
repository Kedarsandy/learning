package arrayprograming;

import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		int [] a = {1,2,3,4};
		int [] b = {80,56,44,8};
		int [] c = {1,2,3,4};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));
		System.out.println(Arrays.equals(b, c));
	}
}
