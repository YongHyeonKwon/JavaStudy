package ex01삼항연산자;

import java.util.Scanner;

public class ex01삼항연산자 {

	public static void main(String[] args) {
		
		// 삼항연산자
		// 조건문 ? 실행문1 : 실행문2 ;
		// --> 조건문은 반드시 결과값이 boolean형태로 나와야한다.
		// 조건문의 결과가 참인 경우 실행문1을 실행
		// 조건문의 결과가 거짓인 경우 실행문2를 실행
		// ex) (String result) 3 == 10 ? "같아" : "달라"
		
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수입력: 개행없이 출력하기
		System.out.print("정수를 입력하세요 : ");
		// 3. 정수 입력받기
		int num = sc.nextInt();
		// 4. 삼항연산자 활용하여 입력받은 정수가 짝수인지 조건 판단
		// --> 짝수인지 판단하는 방법은? 정수를 2로 나누었을 때 나머지를 보고 판단!
		String result = num % 2==0 ? "짝수" : "홀수";
		
		// 5. 결과 값 출력하기
		System.out.println(num+"는(은)"+result+"입니다.");
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//	
//		
//		System.out.print("정수를 입력하세요 : ");
//		
//		int num = sc.nextInt();
//		
//		System.out.print(num + "는(은)");
//		System.out.println(num % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

		
		
		
		
		
}


