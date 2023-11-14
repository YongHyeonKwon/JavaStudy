package 메소드;

import java.util.Scanner;

public class ex02계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';
		System.out.println(cal(num1,num2,op));

	}
	
	
	
	
	
	
	
	
	
	// private : 다른 클래스에서 사용할 수 없게 막는 접근 제한자
	private static int cal(int num1, int num2, char op) {
		// op가 어떤 모양인지 따라서 달라져야함 
		// 조건 비교 필요!!
		// op ---> +,-,*,/
		if(op == '+') {
			return num1 + num2;
		}else if (op == '-') {
			return num1>num2? num1-num2 : num2-num1;
		}else if (op=='*') {
			return num1*num2;
		}else if (op=='/') {
			return num1/num2;
		}else {
			// 조건에 맞지 않는 값이 들어왔을 때 보내줄 결과값도 작성해줘야함!
			return 0;
		}
		
	}










	// 야매 계산기.
//	public static int cal (int num1, int num2, char op) {
//		
//		int result = 0;
//	
//		if (op=='+') {
//			result = num1 + num2; 
//		
//		}else if (op == '-') {
//			result = num1>num2? num1-num2 : num2-num1;
//		}else if (op == '*') {
//			result = num1*num2;
//		}else if (op == '/') {
//			result = num1/num2;
//		}
//		return result;
//	}
	
	
	
	
	
	
	

	// 1. 더하기
	public static int add (int num1, int num2) {
		
		int result = num1+num2;
		
		return result;
	}
	
	// 2. 빼기
	public static int sub (int num1, int num2) {
		
		int result = num1-num2;
		
		return result;
	}
	
	// 3. 곱하기
	public static int mul (int num1, int num2) {
		
		int result = num1*num2;
		
		return result;
	}
	
	// 4. 나누기
	public static int div (int num1, int num2) {
		
		int result = num1/num2;
		
		return result;
	}
	
}
