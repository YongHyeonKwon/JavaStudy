package do_while문;

import java.util.Random;
import java.util.Scanner;

public class ex03doWhile문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 랜덤한 수 생성하는 방법!!
		// 1. 랜덤한 숫자를 생성하는 도구 꺼내오기
		Random ran = new Random();
		
		// 2. 랜덤한 숫자 2개 생성
		do{int ranNum1 = ran.nextInt(10)+1;
		int ranNum2 = ran.nextInt(10)+1;
		System.out.print(ranNum1+"+"+ranNum2+"= ");
		// 3. 사용자로부터 정답 입력
		int input = sc.nextInt();
		// 4. 입력받은 숫자와 실제 정답이 같은지 비교
		if(ranNum1+ranNum2 == input) {
			System.out.println("성공!");
		}else {
			System.out.println("실패!");
			// 정답이 일치하지 않을 때 계속 하시겠습니까? 출력
			System.out.println("계속 하시겠습니까?");
			String answer = sc.next();
			// 6. N을 입력받으면 프로그램 종료
			if(answer.equals("N")) {
				// String은 기본형이 아닌 특이한 자료형
				// 그래서 비교하기 위해서 .equals() 사용
				// 일치 --> true , 불일치--> false
				// 부정은 !answer.equals("N")
				System.out.println("종료!");
				break;
			}
			
		}}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// 랜덤한 수 생성하는 방법!!
//		// 랜덤한 숫자를 생성하는 도구 꺼내오기
//		Random ran = new Random();
//		
//
//		
//		System.out.println("===Plus Game===");
//		
//		do {
//			int ranNum1 = ran.nextInt(10)+1;
//			int ranNum2 = ran.nextInt(10)+1;
//			
//		System.out.print(ranNum1 + "+" + ranNum2 +"=");
//		int result = sc.nextInt();
//		
//		if(result==ranNum1+ranNum2) {
//			System.out.println("Success");
//		}else if (result != ranNum1+ranNum2) {
//			System.out.println("Fail");
//			break;
//		}
//		
//		}while(true);
//
//		System.out.print("계속 하시겠습니까? >> ");
//		String a = sc.next();
//		
//		String a = sc.next();
//		if(a.equals("n ")) // String은 기본형이 아닌 특이한 데이터타입
			               // 그래서 비교하기 위해서 .equals() 사용
		
	
		
		
		
		
		
		
		
		
		
		
	}

	}
