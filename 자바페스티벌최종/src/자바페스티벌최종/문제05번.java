package 자바페스티벌최종;

import java.util.Scanner;

public class 문제05번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
