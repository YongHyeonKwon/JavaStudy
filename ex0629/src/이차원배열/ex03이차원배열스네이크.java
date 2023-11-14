package 이차원배열;

import java.util.Arrays;

public class ex03이차원배열스네이크 {

	public static void main(String[] args) {

		// 스네이크
		// 21 22 23 24 25
		// 30 29 28 27 26
		// 31 32 33 34 35
		// 40 39 38 37 36
		// 41 42 43 44 45

		// 1. 이차원배열 선언 및 생성
		int[][] array = new int[5][5];
		int num = 21;
		
		// 2. 데이터 입력

		// 0, 2, 4(인덱스가 짝수일 때) ----->
		// 1, 3 (인덱스가 홀수일 때) <------
		
		for (int j = 0; j < 5; j++) {
			// 행이 홀수인지, 짝수인지 판별
			// 행의 값 --> j
			
			if (j % 2 == 0) {
				// 행이 짝수일 때!
				for (int i = 0; i < 5; i++) {
					array[j][i] = num++;
				}
			} else {
				// 행이 홀수일 때!
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 3. 출력
		for(int j = 0; j<5; j++) {
			for(int i = 0; i<5; i++) {
			System.out.print(array[j] [i] + "\t"); //tab 크기만큼 띄어쓰기
			}
			System.out.println();
			}
		
		
		
	}

}
