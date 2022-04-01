package loops;

public class breakKeyword {

	public static void main(String[] args) {
		OuterLoop: for (int i = 1; i <= 5; i++) {

			for (int j = 1; j < 5; j++) {
				if (j == 2)
					break OuterLoop;
				System.out.println("inner loop: " + j);
			}

		}
	}
}
