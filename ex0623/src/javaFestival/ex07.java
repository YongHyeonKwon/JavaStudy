package javaFestival;

import java.util.Random;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int fail = 0;

		do {
			int num1 = ran.nextInt(9) + 1;
			int num2 = ran.nextInt(9) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();
			if (input == num1 + num2) {
				System.out.println("SUCCESS!");
			} else if (input != num1 + num2) {
				System.out.println("Fail...");
				fail++;
			}
		} while (fail < 5);
		{
			System.out.println("GAME OVER!");
		}

	}

}
