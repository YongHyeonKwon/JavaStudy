package 자바페스티벌최종;

public class 문제03번 {

	public static void main(String[] args) {

		int plus = 0;
		int minus = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				plus += i;
			} else if (i % 2 == 0) {
				System.out.print(i * -1 + " ");
				minus += i * -1;
			}
		}

		System.out.println();
		System.out.println("결과 : " + (plus + minus));

	}

}
