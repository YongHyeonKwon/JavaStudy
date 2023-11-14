package ex01배열기초;

import java.util.Arrays;
import java.util.Random;

public class ex03가장큰수찾기 {

	public static void main(String[] args) {

		// 1. 배열을 선언하는 또 다른 방법
//		int[] array = {5,3,2,10,9};
		
		// 2. 배열 안에 있는 모든 데이터를 출력하는 또 다른 방법
		// --> Arrays.toString(배열의 레퍼런스 변수명)
//		System.out.println(Arrays.toString(array));

		
		// 1. 랜덤 도구 꺼내오기
		Random ran = new Random();
		// 2. 정수형 데이터 5개를 저장할 수 있는 배열 arr 선언
		int[] arr = new int[5];
		// 3. 가장 큰 수를 담을 수 있는 정수형 max 변수 선언
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
		
		// 4. arr 0번 데이터를 랜덤수로 초기화(1~10까지의 수)
		arr[i] = ran.nextInt(10) + 1;
		// 5. max보다 arr 0번 데이터가 더 큰지 조건 비교하기
		if(max < arr[i]) {
		// 6. 더 크다면 max를 arr 0번 데이터로 변경
		   max = arr[i]; 
		}
		}
		
		// 8. 배열의 모든 값 출력하기
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(arr));
		// 9. max 안에 들어있는 데이터 출력하기 
		System.out.println("가장 큰 값은 " + max + "입니다.");

		
//		Random ran = new Random();
//
//		int[] arr = new int[5];
//
//		int max = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = ran.nextInt(10) + 1;
//			if (max < arr[i]) {
//				max = arr[i];
//			}
//
//		}
//
//		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(arr));
//
//		System.out.println("가장 큰 값은 " + max + "입니다.");
//
	}
//
}
