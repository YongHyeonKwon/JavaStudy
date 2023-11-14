package 자바페스티벌최종;

import java.util.Scanner;

public class 문제02번 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int timeMoney = 5000;
		int money = 0;

		System.out.print("일한시간을 입력하세요 : ");
		int workTime = sc.nextInt();

		if (workTime <= 8) {
			money = workTime * timeMoney;
		} else {
			money = (int) (timeMoney * 8 + (workTime - 8) * (timeMoney * 1.5));
		}

		System.out.println("총 임금은 " + money + "원 입니다.");

	}

}
