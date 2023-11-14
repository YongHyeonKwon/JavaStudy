package for문;

import java.util.Scanner;

public class ex05for문예제 {

	public static void main(String[] args) {

		// 원하는 단과 어느수까지 출력할지 입력받아서 구구단 출력하기!
		// 1. 입력받는 도구
		Scanner sc = new Scanner(System.in);
		// 2. 단 입력받기
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		// 3. 어느 수까지 출력할지 입력 받기
		System.out.print("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		
		for(int i = 1; i < (num2+1) ;i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("어느 수까지 출력 : ");
//		int num2 = sc.nextInt();
//		
//		for(int i = 1; i < (num2+1) ;i++) {
//			System.out.println(num1+"*"+i+"="+num1*i);
//		}
		
		
		
		
		
		
		
		
		
		
	}

}
