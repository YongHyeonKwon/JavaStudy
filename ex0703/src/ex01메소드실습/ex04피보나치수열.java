package ex01메소드실습;

import java.util.Scanner;

public class ex04피보나치수열 {

	public static void main(String[] args) {
		// 피보나치 수열
		// 1 1 2 3 5 8 13 21 34 
		// fibo(5)
		
		System.out.println(fibo(3));
		
	
	}
	
	public static int fibo (int num) {		
		// 1. num이 2보다 작거나 같았을 경우에는 
		if(num <= 2) {
		// 2. 1이라는 결과값을 반환
		   return 1;
		}else {
			// 3. 그렇지 않은경우
			// 1. 1, 2
			// fibo(4) -> 1+2
			return fibo(num-2) + fibo(num-1);
			// fibo(3) -> 
			// 재귀함수  fibo(1) +    fibo(2)
			
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(fibo(num));
//		
//		
//		
//	}
//	public static int fibo (int num) {
//		// 1. num만큼 배열 생성 
//		int[] array = new int[num];
//		// 2. array[0] , array[1] 데이터 1로 변경
//		if(num > 0 ) {
//		array[0] = 1;
//		}
//		if (num > 1) {
//		array[1] = 1;
//		}
//		// 3. 3번째 숫자를 구해보자!!!!
//		for(int i = 2; i<num; i++) {
//		array[i] = array[i-2] + array[i-1];
//		}
//	
//		return array[num-1];
		
		
		
		
		
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			if(i == 0) {
//				arr[0] = 1;
//			}else if (i == 1) {
//				arr[1] = 1;
//			}else if (i > 1) {
//				arr[i] = arr[i - 2] + arr[i - 1];
//			}
//		}
//		
//		
//		return arr[num-1]; 
	
	
	
	
}
