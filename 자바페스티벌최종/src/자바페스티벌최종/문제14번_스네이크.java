package 자바페스티벌최종;

import java.util.Scanner;

public class 문제14번_스네이크 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 N을 입력하세요 >> ");
		int n = sc.nextInt();


		// 1. 이차원배열 선언 및 생성
		int[][] array = new int[n][n];
		int num = 1;

		// 2. 데이터 입력

		// 0, 2, 4(인덱스가 짝수일 때) ----->
		// 1, 3 (인덱스가 홀수일 때) <------

		for (int j = 0; j < n; j++) {
			// 행이 홀수인지, 짝수인지 판별
			// 행의 값 --> j

			if (j % 2 == 0) {
				// 행이 짝수일 때!
				for (int i = 0; i < n; i++) {
					array[j][i] = num++;
				}
			} else {
				// 행이 홀수일 때!
				for (int i = n-1; i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 3. 출력
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(array[j][i] + "\t"); // tab 크기만큼 띄어쓰기
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
