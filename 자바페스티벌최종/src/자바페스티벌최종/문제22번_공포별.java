package 자바페스티벌최종;

public class 문제22번_공포별 {

	public static void main(String[] args) {

		for (int k = 4; k >= 0; k--) {
			for (int i = 0; i < k; i++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
