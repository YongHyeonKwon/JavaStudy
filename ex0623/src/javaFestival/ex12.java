package javaFestival;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int result = n;
		int sum = 0;

		while(result >0) {
			sum = sum + (result % 10);
			result = result/10;
		}
		System.out.println("합은 " + sum + "입니다.");
		

		
		
		
		
		
	}

}
