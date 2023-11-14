package 자바페스티벌최종;

import java.util.Scanner;

public class 문제24번_작은수출력 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		int [] arr = new int[n];
		int [] num = new int[n];
				
		for(int i = 0; i<n; i++) {
			System.out.print(i+1+"번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
	
		}
		
		System.out.print("결과 >> ");
		
		for(int i = 0; i<n; i++) {
			if(arr[i]<x) {
				num[i] = arr[i];
			}
			
			if(num[i] != 0) {
				System.out.print(num[i]+" ");
			}
			
		}
		
		
	}

}
