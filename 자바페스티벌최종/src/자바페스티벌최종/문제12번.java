package 자바페스티벌최종;

import java.util.Scanner;

public class 문제12번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 N을 입력하세요 : ");
		int n = sc.nextInt();

		int[][] array = new int[n][n];

		int num = 1;

		// 규칙!

		// 행
		for (int j = 0; j < n; j++) {
			// 열
			for (int i = 0; i < n; i++) {
				array[i][j] = num++;
			}
		}

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}


	}

}
