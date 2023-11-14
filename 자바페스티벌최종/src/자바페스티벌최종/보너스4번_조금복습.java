package 자바페스티벌최종;

import java.util.Scanner;

public class 보너스4번_조금복습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+"번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i< arr.length; i++) {
		System.out.print(arr[i]+ ":");
		for(int j = arr[i]; j>0; j--) {
		System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		
	}

}
