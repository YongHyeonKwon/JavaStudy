package 자바페스티벌최종;

import java.util.Random;

public class 문제18번_로또 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(60) + 1;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		System.out.println("====로또타임====");
		System.out.println("이번 주 출력번호는요.. !!두구두구!!");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
