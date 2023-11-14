package 자바페스티벌최종;

import java.util.Scanner;

public class 문제17번_살짝복습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[10];
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번 째 정수 입력 >> ");
			arr[i] = sc.nextInt();

			if (arr[i] % 3 == 0) {
				num[i] = arr[i];
			}
		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < 10; i++) {
			if (num[i] != 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
