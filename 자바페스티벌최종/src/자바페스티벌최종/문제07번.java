package 자바페스티벌최종;

import java.util.Scanner;

public class 문제07번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int j = 0; j<num; j++) {
		for(int i = num; i>j; i--) {
		System.out.print("*");
		}
		System.out.println();
		}
		
	}

}
