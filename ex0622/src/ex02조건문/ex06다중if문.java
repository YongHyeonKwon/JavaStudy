package ex02조건문;

import java.util.Scanner;

public class ex06다중if문 {

	public static void main(String[] args) {

		// 사용자로부터 숫자를 입력받아서 햐당하는 숫자가
		// 0인지, 홀수인지, 짝수인지 판별하는 프로그램
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 숫자를 입력하세요 출력하기
		System.out.print("숫자를 입력하세요 >> ");
		// 3. 숫자를 입력 받기 
		int num = sc.nextInt();
		// 4. 조건을 판다해서 0인지, 홀수인지, 짝수인지 출력
		// *** 조건식의 순서도 생각해보자!!
		if (num == 0) {
			System.out.println("0입니다.");
		} else if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			// 위에 있는 모든 조건식이 거짓이라면 실행하는 코드
			System.out.println("홀수입니다.");
		}
				
				
		
		
		
		
		
		
		
		
		
		
	}

}
