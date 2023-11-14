package 자바페스티벌최종;

import java.util.Scanner;

public class 반제31번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int input = sc.nextInt();

		int sum = 1;

		System.out.print("출력 : ");

		for (int i = 1; i <= input; i++) {
			sum *= i;
		}

		System.out.println(sum);

	}

}
