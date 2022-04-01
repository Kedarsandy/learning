package accessmodifers2;

import accessmodifers.AccessSpecifiers;

public class CheckingClassDifferentPackage  extends AccessSpecifiers{

	public static void main(String[] args) {
	
		AccessSpecifiers.m1();
		System.out.println(AccessSpecifiers.a);
	}
}
