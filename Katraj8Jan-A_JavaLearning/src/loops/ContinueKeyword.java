package loops;

public class ContinueKeyword {

	
	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			if(i==4)
				continue;
			System.out.println("value of :" + i);
		}
		System.out.println("loop compeleted");
	}
}
