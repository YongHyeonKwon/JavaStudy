package ex02배열예제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ex02로또 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[5];

		// array에 랜덤한 수 1~10 지정
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;

			// 중복 제거
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
					break;
				}
			}

		}
		System.out.println("====로또타임====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
