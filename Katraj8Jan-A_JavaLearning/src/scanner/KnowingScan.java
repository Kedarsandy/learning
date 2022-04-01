package scanner;

import java.util.Scanner;

public class KnowingScan {

	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number a: ");
		
		int a = scn.nextInt();   ///5000;
		System.out.println("Enter number b: ");
		int b = scn.nextInt();
		int c = a-b;
		System.out.println("Result of calculation: "+ c);
	}
}
