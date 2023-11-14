package ex02조건문;

import java.util.Scanner;

public class ex10switch문예제 {

	public static void main(String[] args) {

		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		// 2. 월 입력 : 출력
		System.out.print("월 입력 : ");
		// 3. 월 입력 받기
		int month = sc.nextInt() ;
	    // 4. 몇 월인지 판단해서 계절 출력하기		
		switch(month) {
		case 12:
		case 1:
		case 2: 	 
			System.out.println(month+"월은 겨울입니다.");
			 break;
		case 3:
		case 4:
		case 5:
			System.out.println(month+"월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"월은 여름입니다.");
			break;
		default:
			System.out.println(month+"월은 가을입니다.");
			
		}
		
		
		
		
		
		
	}

}
