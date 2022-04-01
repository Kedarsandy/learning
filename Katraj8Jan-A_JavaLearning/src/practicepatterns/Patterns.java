package practicepatterns;

public class Patterns {

	public static void main(String[] args) {
		new Patterns(5); 
	}
	
	public Patterns(int n) {
		for(int row =1; row<=n; row++)
		{
			for(int col =2*(n-row);col>=0;col--) {
				System.out.print(" ");
			}
			for(int col = 1; col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
