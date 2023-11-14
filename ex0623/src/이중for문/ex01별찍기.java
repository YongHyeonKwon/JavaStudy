package 이중for문;

public class ex01별찍기 {

	public static void main(String[] args) {

		// 별찍기
		// *****
		// *****
		// *****

		// *****
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// *****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}

		System.out.println();
		// *****
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}

	}

}
