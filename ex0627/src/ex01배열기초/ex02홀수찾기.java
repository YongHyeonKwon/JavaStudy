package ex01배열기초;

import java.util.Random;

public class ex02홀수찾기 {

	public static void main(String[] args) {

		// 1. 랜덤도구 꺼내오기
		Random ran = new Random();

		// 2. 정수형 5개 데이터 저장할 수 있는 array 선언
		int[] array = new int[5];

		// 3. 홀수의 총 개수를 저장할 수 있는 변수 cnt 선언
		int cnt = 0;

		System.out.print("array에 들어있는 홀수는 ");

		for (int i = 0; i < array.length; i++) {
			// 4. array 0번 안에 있는 데이터 랜덤한 숫자로 변경 (1~100까지)
			array[i] = ran.nextInt(100) + 1;

			// 5. array 0번 안에 있는 데이터가 홀수인지 조건 판단
			if (array[i] % 2 == 1) {
				// 6. 홀수라면 array 0번 안에 있는 데이터 출력
				System.out.print(array[i] + " ");
				// 7. 홀수라면 cnt를 1씩 증가
				cnt++;
			}
		}
		System.out.println("이며,");
		System.out.println("총 " + cnt + "개 입니다.");

	}

}
