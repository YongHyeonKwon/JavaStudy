package while문;

import java.util.Scanner;

public class ex03while문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 불러오기
		Scanner sc = new Scanner(System.in);
		int sum = 0; // 정수를 누적시킬 공간
		
		// 2. 정수 입력 출력하기(줄바꿈 없이)
		while(true) {
			System.out.print("정수 입력 : ");
		// 3. 정수 입력 받기
		int num = sc.nextInt();
		// 4. 입력받은 정수 누적하기
		// --> 누적할 변수가 하나 필요!!
		// sum = sum+num;
		sum += num;
		System.out.println("누적결과 : "+sum);
		// 5. 2-4번까지 반복
		// -1을 입력하면 종료되었습니다. 출력 후 프로그램 끝
		if (num == -1) {
			System.out.println("종료되었습니다.");
			break;
		}
	}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = sc.nextInt();
//			
//			if(num >= 0) {
//				sum = num+sum;
//				System.out.println("누적결과 : "+sum);
//			}else if(num < 0) {
//				System.out.println("누적결과: "+(sum+num));
//				System.out.println("종료되었습니다.");
//				break;
//			}
			
			
		}
		
		
		
		
	

}
