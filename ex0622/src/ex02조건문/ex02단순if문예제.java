package ex02조건문;

import java.util.Scanner;

public class ex02단순if문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 개행없이 출력하기
		System.out.print("정수를 입력하세요 : ");
		// 3. 정수 입력받기
		int num = sc.nextInt();
		// 4. 3의 배수이면서, 5의 배수인지 조건 판단
		if (num % 3 == 0 && num % 5 == 0) {
			// 5. 참이라면 3과 5의 배수입니다. 출력하기
			System.out.println("3과 5의 배수입니다.");
		}

		// 15의 배수
		if (num % 15 == 0) {
			System.out.println("3과 5의 배수입니다.");

		}

		// if문 여러개 사용
		if (num % 3 == 0) {
			// 3의 배수이다.
			if (num % 5 == 0) {
				// 3의 배수이면서, 5의 배수이다.
				System.out.println("3과 5의 배수입니다.");
			}
		}

		// 코드를 예쁘게 정렬할 수 있는 단축키
		// ctrl shift f

		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//	
//		int num = sc.nextInt();
//	
//		if (num % 15 == 0) {
//			System.out.println("3과 5의 배수입니다");
//		
//		}

	}

}
