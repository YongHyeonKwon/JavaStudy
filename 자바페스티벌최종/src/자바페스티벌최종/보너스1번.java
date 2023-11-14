package 자바페스티벌최종;

import java.util.Scanner;

public class 보너스1번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();

			System.out.print("B 입력 >> ");
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				break;
			}

			System.out.println("결과 >> " + (a - b));
		} while (true);

	}

}
