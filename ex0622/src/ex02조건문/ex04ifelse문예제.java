package ex02조건문;

import java.util.Scanner;

public class ex04ifelse문예제 {

	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 에버랜드에 오신 걸 환영합니다! 출력하기
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		// 3. 나이를 입력하세요 : 개행없이 출력하기 
		System.out.print("나이를 입력하세요 : ");
		// 4. 나이 입력받기 
		int age = sc.nextInt();
		// 5. 인원수를 입력하세요 : 개행없이 출력하기 
		System.out.print("인원수를 입력하세요 : ");
		// 6. 인원 수 입력받기 
		int count = sc.nextInt(); 
		
		int ticket = 5000;
		// 7. 나이가 20세 미만인지 조건 판단하기 
		// ★★★★지역변수(local variable)★★★★
		// : {} 즉, 영역 안에서 선언된 변수는 해당하는 영역을 벗어나서 사용할 수 없다.
		int money = 0;
		if(age < 20) {
			// 8. 참이라면 입장료 50% 할인하기
			money = (int) (ticket * 0.5 * count);
		}else {
			// 9. 거짓이라면 기본금액(5000원)으로 계산하기
			money = ticket * count;
		}
		    // 10. 총 금액 출력하기
		System.out.println("총"+money+"원입니다.");
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//
//		System.out.print("인원수를 입력하세요 : ");
//		int num = sc.nextInt(); 
//		
//		int tiket = 5000;
//		
//		if (age<20) {
//			System.out.println("총" + num*tiket/2 + "입니다.");
//		}else {
//			System.out.println("총" + num*tiket + "입니다.");
//		}
		
		
		
		
	}

}
