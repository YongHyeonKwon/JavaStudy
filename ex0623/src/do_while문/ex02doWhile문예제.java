package do_while문;

import java.util.Scanner;

public class ex02doWhile문예제 {

	public static void main(String[] args) {

		// 1. 입력받을 도구
		Scanner sc = new Scanner(System.in);
		// 2. 현재 몸무게 입력
		System.out.print("현재 몸무게 입력 : ");
		int now = sc.nextInt();
		// 3. 목표 몸무게 입력
		System.out.print("목표 몸무게 입력 : ");
		int goal = sc.nextInt();

		int week = 1;
		// 4. 주차별 감량 몸무게 입력 받기
//		do{
//			System.out.print(week+"주차 감량 몸무게 : ");
//			week++;
//		int minus = sc.nextInt();
//		// 현재 몸무게 = 현재 몸무게(다이어트시작) - 주차별 감량몸무게
//		now = now - minus;
//		// 5. 현재 몸무게가 목표 몸무게에 도달했는지 판단
//		if(now <= goal) {
//			System.out.println(now+"kg 달성!! 축하합니다!!");
//			break;
//		  }	
//		}while(true);

		// do-while 두번째 방법
		do {
			System.out.print(week + "주차 감량 몸무게 : ");
			week++;
			int minus = sc.nextInt();
			now -= minus;
		} while (now > goal); // 반복시킬 조건!

		System.out.println(now+"kg 달성!! 축하합니다!");
	}

}
