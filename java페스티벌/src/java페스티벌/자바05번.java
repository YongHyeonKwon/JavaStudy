package java페스티벌;

import java.util.Scanner;

public class 자바05번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 :");
		int num = sc.nextInt();
		
		for(int j = 0; j<num; j++) {
		for(int i = 1; i<=j+1; i++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
	}

}
