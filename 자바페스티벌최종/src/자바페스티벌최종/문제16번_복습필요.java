package 자바페스티벌최종;

import java.util.Scanner;

public class 문제16번_복습필요 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int result = num;
		int sum = 0;

		while (result > 0) {
			sum += result % 10;
			result = result / 10;
		}
		System.out.println("합은 " + sum + "입니다.");
		
	}

}
