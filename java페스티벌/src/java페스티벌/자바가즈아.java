package java페스티벌;

import java.util.Scanner;

public class 자바가즈아 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [10];
		int [] array = new int [10];
				
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1)+ "번 째 정수 입력 >> ");
			arr[i] = sc.nextInt();
			
			if(arr[i]%3==0) {
				array[i] = arr[i];
			}
		}
		
		System.out.print("3의 배수 :");
		
		for(int i = 0; i<arr.length; i++) {
			if(array[i] != 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		
		
	}

}
