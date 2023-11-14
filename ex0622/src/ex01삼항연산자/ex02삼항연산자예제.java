package ex01삼항연산자;

import java.util.Scanner;

public class ex02삼항연산자예제 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 개행없이 출력하기
		System.out.print("첫 번째 정수 입력 : ");
		// 3. 정수 입력받기
		int num1 = sc.nextInt();
		// 4. 개행없이 출력하기
		System.out.print("두 번째 정수 입력 : ");
		// 5. 정수 입력받기
		int num2 = sc.nextInt();
		// 6. 큰 수에서 작은 수를 뺀 결과값을 구하기
		// 조건 판단 : 입력받은 정수 두 개 중에 어떤 수가 더 큰지
		int result = num1>num2 ? num1-num2 : num2-num1;
		
		// 7. 결과값 출력하기
		System.out.println("두 수의 차 : " + result);
		
	
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//	
//		
//		System.out.print("첫 번째 정수 입력 : ");
//		
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수 입력 : ");
//		
//		int num2 = sc.nextInt();
//		
//		System.out.println("두수의 차 : " ); 
//		System.out.println(num1>num2 ? (num1-num2) : (num2-num1));
		
		
		
		
		
		

	}

}
