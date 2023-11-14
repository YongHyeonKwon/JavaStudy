package javaFestival;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		int array[] = new int[10];
		
		for(int i = 0; i<10; i++) {
		System.out.print((i+1)+"번 째 정수 입력 >> ");
		num[i] = sc.nextInt();
		}
		
		// 3의 배수 필터링
		for(int i = 0; i < 10; i++) {
			if(num[i]%3==0) {
		    array[i]=num[i];
		    // 값이 0일 때는 성공
			}
		}
		
		// 3의 배수 출력
		System.out.print("3의 배수 : ");
		for(int i = 0; i < 10; i++) {
			if(array[i] != 0)
				System.out.print(array[i]+ " ");
		}

		
		
		
		
		
		
		
		
		
	}

}
