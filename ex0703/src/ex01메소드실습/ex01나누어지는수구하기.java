package ex01메소드실습;

import java.util.Scanner;

public class ex01나누어지는수구하기 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1,num2);
		System.out.println(divisor);
		
	}
	public static boolean isDivisor(int num1, int num2) {
//		// 1. num1이 num2로 나누어 떨어진다면
//		if(num1 % num2 == 0) {
//			// 2. true 결과값 반환
//			return true;
//		}else {
//			// 3. 그렇지 않은 경우 
//			return false;
//		// 4. false 결과값 반환
		
		
		return num1 % num2 == 0? true : false;
		
		
//		boolean result = num1%num2==0;
//				return result;
	}
	
	
	
}
