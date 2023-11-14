package ex02배열예제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex01정수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 성적 데이터를 저장할 수 있는 배열 array 생성
		int[] array = new int[5];
		// 2. 성적 입력 (5개)
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		// 3. 입력 받은 데이터를 전부 출력
		System.out.println("입력된 점수 : " + Arrays.toString(array));

		int max = 0; // 최고 점수를 담아줄 공간
		int min = array[0]; // 최저 점수를 담아줄 공간
		int sum = 0; // 합계를 담아줄 공간

		for (int i = 0; i < array.length; i++) {
			// 4. 최고 점수 구하기
			if (max < array[i]) {
				max = array[i];
			}
			// 5. 최저 점수 구하기
			if (min > array[i]) {
				min = array[i];
			}
			// 6. 합계 구하기
			sum += array[i];
		}

		// 출력하기.
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		// 7. 평균 구하기
		System.out.println("평균 : " + (double)sum / array.length);

//		Scanner sc = new Scanner(System.in);
//		
//		int[] array = new int[5];
//		
//		for(int i = 0; i<5; i++) {	
//		System.out.print((i+1)+"번째 입력 >> ");
//		array[i] = sc.nextInt();
//		}
//		
//		System.out.println("입력된 점수 : " + Arrays.toString(array));
//		
//		int max= 0;
//		int min= array[0];
//		int sum= 0;
//		double aver= 0;
//		
//		for(int i=0; i < array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//		if(min > array[i]) {
//			min = array[i];
//		}
//		sum += array[i];
//		aver = sum/5.0;
//			
//		}
//		System.out.println("최고 점수 : "+max);
//		System.out.println("최저 점수 : "+min);
//		System.out.println("총합 : "+sum);
//		System.out.println("평균 : "+aver);

	}

}
