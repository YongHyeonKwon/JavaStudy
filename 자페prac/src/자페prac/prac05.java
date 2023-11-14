package 자페prac;

import java.util.Scanner;

public class prac05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		int [] arr= new int [n];
		int [] array = new int [n];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("결과 >> ");
		
		for(int i = 0; i<10; i++) {
		if(arr[i]<x) {
		array[i] = arr[i];
		}
		if(array[i]!= 0) {
			System.out.print(array[i]+ " ");
		}
		}
		
		
	}

}
