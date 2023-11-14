package 자바페스티벌최종;

import java.util.Scanner;

public class 문제15번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n을 입력하세요 >> ");
		int n = sc.nextInt();

		int num = 1;

		for (int i = 0; i < n; i++) {

			num += i;

			System.out.print(num + " ");
		}

	}

}
