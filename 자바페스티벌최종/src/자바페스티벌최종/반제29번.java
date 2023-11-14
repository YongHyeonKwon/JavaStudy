package 자바페스티벌최종;

import java.util.Random;
import java.util.Scanner;

public class 반제29번 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int num = 0;

		do {
			int ran1 = ran.nextInt(10);
			int ran2 = ran.nextInt(10);
			System.out.print(ran1 + " + " + ran2 + " = ");
			int result = sc.nextInt();

			if (result == (ran1 + ran2)) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				num++;
			}

			if (num == 5) {
				System.out.println("GAME OVER!");
				break;
			}

		} while (true);

	}

}
