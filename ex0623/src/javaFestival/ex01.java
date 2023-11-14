package javaFestival;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int timeMoney = 5000;
		int money = 0;
		int over = 0;
		
		System.out.print("일한시간을 입력하세요 : ");
		int work = sc.nextInt();
		
		if(work <= 8) {
			money = timeMoney * work;
		}else if(work > 8){
			over = work-8;
			money = (int) ((timeMoney*8) + (over*1.5*timeMoney));
		}
		
		System.out.println("총 임금은 "+money+"원 입니다.");
		
		
		
		
	}

}
