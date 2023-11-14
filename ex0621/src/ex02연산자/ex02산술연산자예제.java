package ex02연산자;

import java.util.Scanner;

public class ex02산술연산자예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력: 개행없이 출력하기
		System.out.print("정수입력 : ");
		// 3. 정수 입력받기 (num 변수 저장하기)
		int num1 = sc.nextInt(); 
		// 4. 백의 자리 이하를 버리기
		// 412 --> 400 : 백의 자리 숫자만 꺼내오기(100숫자로 나눈 몫)
		int result = num1 / 100 * 100;
		// 717 --> 700 : 717(num) - 17(num % 100)
		int result2 = num1 - num1%100;
		
		
		// 5. 출력하기
		System.out.println("결과 값 : " + result);
		System.out.println("결과 값 : " + result2);
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수입력 : ");
//		
//		int num1 = sc.nextInt(); 
//		
//		System.out.println("결과 값: " + num1/100*100);
//		
		
		
		
		
		
		
		
		
		
		
		
	}

}
