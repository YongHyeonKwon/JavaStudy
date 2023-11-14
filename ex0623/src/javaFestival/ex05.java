package javaFestival;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 1; 
		
		do { 
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			now = now-minus;
			
		}while(now > goal);
		
		System.out.println(now + "kg 달성!! 축하합니다!");
		
		
		
		
		
		
	}

}
