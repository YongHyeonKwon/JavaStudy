package ex02조건문;

import java.util.Scanner;

public class ex07다중if문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수 입력 : 출력
		System.out.print("점수 입력 : ");
		// 3. 숫자 입력 받기
		int totalScore = sc.nextInt();
		// 4. 학점 계산
		char grade = 'A';

		if (totalScore >= 90) {
			// 90점 이상일 때
			grade = 'A';
		} else if (totalScore >= 80) {
			// 80점 이상 90점 미만
			grade = 'B';
		} else if (totalScore >= 70) {
			// 70점 이상 80점 미만
			grade = 'C';
		} else {
			// 70점 미만
			grade = 'D';
		}
		System.out.println(grade+"학점입니다.");

		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("점수 입력 : ");
//		
//		int num = sc.nextInt();
//		
//		if (num>=90) {
//			System.out.println("A학점입니다!");
//		} else if (num>=80) {
//			System.out.println("B학점입니다!");
//		} else if (num>=70) {
//			System.out.println("C학점입니다!");
//		} else {
//			System.out.println("D학점입니다!");
//		}

	}

}
