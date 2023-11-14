package java페스티벌;

import java.util.Scanner;

public class 자바팩토리얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int num = 1;
		
		System.out.print("출력 : ");
		
		for(int i = 1; i<=input; i++) {
			num = num*i;
		}
		
		System.out.print(num);
	}

}
