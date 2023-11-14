package javaFestival;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int result,a,b = 0; 
	

		while (true) {
		System.out.print("A 입력 >> ");
		a = sc.nextInt(); 
		System.out.print("B 입력 >> ");
		b = sc.nextInt();
		
		result = a-b;
		
		if (a == 0 && b== 0) {
		break;
		}else {
			System.out.println("결과 >> " + (result));
		}
			
		}
		
		
		
		
		}

}
