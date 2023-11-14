package ex02연산자;

import java.util.Scanner;

public class ex03시분초구하기 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 초 입력 : 개행없이 출력하기
		System.out.print("초 입력: ");
		int totalSecond = sc.nextInt(); 
		
		// 3. 시간 구하기
		// 3600초 --> 1시간 
		int hour = totalSecond / 3600;
		
		// 4. 분 구하기
		// ex) 3723 , 7230
		int min = totalSecond % 3600/60;
		
		// 5. 초 구하기
		int second = totalSecond % 60;
		
		// 6. 결과 값 출력하기
		System.out.println(hour + "시" + min + "분" + second + "초");
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("초 입력: ");
//		
//		int num1 = sc.nextInt(); 
//		
//		int num2 = (num1/3600);
//		
//		int num3 = (num1%3600/60);
//		
//		int num4 = (num1%3600%60);
//		
//		System.out.println(num2 + "시" + num3 + "분" + num4 + "초");
		
	
		
		
		
		
		
	}

}
