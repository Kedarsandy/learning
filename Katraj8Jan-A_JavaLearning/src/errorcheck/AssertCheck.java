package errorcheck;

import java.util.Scanner;

public class AssertCheck {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int input = scn.nextInt();
		
		assert input >= 40 : "failed";		
		System.out.println("mark is " + input + " Passed");
	}
}
