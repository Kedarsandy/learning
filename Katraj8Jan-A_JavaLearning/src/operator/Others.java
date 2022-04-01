package operator;

public class Others {
	public static void main(String[] args) {
		int x = 20;
		int y = 30;
		
		if(x==y) {
			System.out.println("Yes It is equal");
		}
		
		if(x!=y) {
			System.out.println("Yes it is not equal");
		}
		
		if(!(x>y)){
			System.out.println("Yes it is not equal");
		}
		
		if(!(x<y)){
			System.out.println("x is not equal to y");
		}
		
		if((x>y)&&(y==30)) {
			System.out.println("both condition should get satisfy");
		}
		
		if((x>y)||(y==30)) {
			System.out.println("Any one of the condtion should get satisfy");
		}
	}
}
