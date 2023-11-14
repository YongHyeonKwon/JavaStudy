package for문;

import java.util.Scanner;

public class ex04for문예제 {

	public static void main(String[] args) {

		// 원하는 단을 입력받아 구구단 출력
		// 1. 입력받을 도구 꺼내기 
		Scanner sc = new Scanner(System.in);
		// 2. 단 입력 : 출력
		System.out.print("단 입력 : ");
		// 3. 단 입력 받기
		int dan = sc.nextInt();
		// 4. 입력받은 단 *1~9 한 값을 출력
		for (int i =1; i < 10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//		
//		for (int i =1; i < 10; i++) {
//			System.out.println(dan+"*"+i+"="+(dan*i));
//		}
		
		
		
		
		
		
		
		
		
	}

}
