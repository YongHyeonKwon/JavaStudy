package ex02조건문;

import java.util.Scanner;

public class ex05마트계산대프로그램 {

	public static void main(String[] args) {

		// 다음은 마트 계산대 프로그램입니다
		// 10000원짜리 선물세트를 구입했을 때 지불해야하는 금액을 계산해 보세요.
		// 단 , 11개 이상 구매 시에는 전체금액에서 10% 할인이 적용됩니다
		
		
		// 상품의 개수를 입력받아서 11개 이상이면
		// 할인된 금액으로 계산해주는 프로그램
		
		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 상품의 개수를 입력하세요 출력하기
		System.out.print("상품의 개수를 입력하세요 : ");
		// 3. 변수에 상품의 개수 입력 받기
		int num = sc.nextInt();
		int money = 0;
		// 4. 상품의 개수가 11개 이상인지 판별!
		if(num>=11) {
			// 5. 상품의 개수가 11개 이상일 때!
			// 전체 금액에서 10% 할인
			money = (int) (10000*num*0.9);
		}else {
			// 6. 상품의 개수가 11개 이상이 아닐 때!
			money = (num*10000);
		}
		
		// 7. 결과 출력하기
		System.out.println("가격은 " + money + "원입니다. ");
		
		
		
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("상품의 개수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		int set = 10000;
//		int price = 0;
//		
//		if(num>=11) {
//			price = (int) (set*0.9*num);
//		}else{
//			price = (set*num);
//		}
//		
//		System.out.println("가격은 " + price + "원입니다.");
		
		
		
		
		
		
		
		
		
	}

}
