package java_festival;

import java.util.Scanner;

public class day5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];
		int num[] = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력 >>");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				num[i] = array[i];
			}
		}

		System.out.print("3의 배수 : ");
		for (int i = 0; i < 10; i++) {
			if (num[i] != 0)
				System.out.print(num[i] + " ");
		}

	}

}
