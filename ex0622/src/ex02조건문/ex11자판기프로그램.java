package ex02조건문;

import java.util.Scanner;

public class ex11자판기프로그램 {

	public static void main(String[] args) {

		// 1. 입력하는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		// 2. 출력문 작성하기
		System.out.print("금액을 입력하세요 >> ");
		// 3. 입력금액 저장할 변수 선언하기
		int money = sc.nextInt();
		// 4. 메뉴를 고르세요 출력문 작성하기
		System.out.println("메뉴를 고르세요.");
		// 5. 출력문 작성하기 (메뉴판)
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		// 6. 사용자가 선택한 메뉴 입력받기 (변수 선언하기)
		int menu = sc.nextInt();
		// 7. 사용자가 선택한 메뉴가 무엇인지 판단
		// 판단 --> 조건문
		// switch 문이나 if-elseif
		int change = money; // 잔돈
		
		if (menu==1) {
			// 만약에 사용자가 1번을 선택
			// 잔돈 = 내가 지불한 금액 - 아우터 가격
			
			// 내가 지불한 금액이 선택한 메뉴의 금액보다 크거나 같은지 판단
			if (money>=700) {
				change = money - 700;
			}else {
				// 내가 지불한 금액이 선택한 메뉴의 금액보다 작을 때
				System.out.println("돈이 부족합니다 ㅠㅠ");
			}
		}else if(menu==2) {
			// 만약에 사용자가 2번을 선택
			// 잔돈 = 내가 지불한 금액 - 이구동성 가격
			if(money>=1000) {
				change = money = 1000;
			}else {
				System.out.println("돈이 부족합니다 ㅠㅠ");
			}
		}else if(menu== 3) {
			// 만약에 사용자가 3번을 선택
			// 잔돈 = 내가 지불한 금액 - 에그몽 가격
			if(money>=500) {
				System.out.println("돈이 부족합니다 ㅠㅠ");
			}
		}else {
			System.out.println("잘못된 숫자를 입력하셨습니다.");
		}
		
		// 잔돈 출력!
		
		System.out.println("잔돈 :"+ change + "원 ");
		System.out.print("천원 :"+change/1000+"개 ");
		System.out.print("오백원 :"+change%1000/500+"개 ");
		System.out.print("백원 :"+change%1000%500/100+"개");
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int money, choice, change = 0; // 들어갈 금액, 선택될 음료, 잔돈
//		
//		int igudong = 700;
//		int sunchip = 1000;
//		int bbobbai = 500;
//		
//		// 금액 입력
//		System.out.println("금액을 입력하세요.");
//		money = sc.nextInt();
//		
//		// 메뉴 선택
//		System.out.println("메뉴를 고르세요.");
//		
//		System.out.print("1.이구동성(700원) ");
//		System.out.print("2.썬칩(1000원) ");
//		System.out.print("3.뽀빠이(500원) >> ");		
//		choice = sc.nextInt();
//		
//		// 금액 입력과 메뉴를 선택한이후 받게될 잔돈구하기 또는 돈이 부족한지 확인하기
//		if(choice == 1 && money>=igudong) {
//			change = money - igudong;
//		}else if (choice == 2 && money>=sunchip) {
//			change = money - sunchip;
//		}else if (choice == 3 && money>=bbobbai) {
//			change = money - bbobbai;
//		{else if (choice != (0<=3) 
//		    System.out.println("잘못된 숫자를 입력하셨습니다.");
//      }
//		}else {
//			change = money;
//			System.out.println("돈이 부족해요ㅠㅠ");
//		}
//		
//		// 잔돈의 천원,오백원,백원 개수를 담을 변수 선언
//		int change1000 = change/1000;
//		int change500 = change%1000/500;
//		int change100 = (change%1000%500/100);
//		
//		System.out.println("잔돈 : "+ change + "원");
//		
//		System.out.print("천원 : "+change1000+"개, ");
//		System.out.print("오백원 : "+(change500)+"개, ");
//		System.out.print("백원 : "+(change100)+"개");
		
	}

}
