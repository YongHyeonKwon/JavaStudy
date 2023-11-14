package javaFestival;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
	    int num2_100 = num2/100;
	    int num2_10 = num2%100/10;
	    int num2_1 = num2%100%10/1;
		
		System.out.println(num1*num2_1);
		System.out.println(num1*num2_10);
		System.out.println(num1*num2_100);
		System.out.println(num1*num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
