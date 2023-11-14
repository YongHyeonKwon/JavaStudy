package 자바페스티벌최종;

import java.util.Scanner;

public class 문제20_십진수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력 >>");
		int n = sc.nextInt();
		
		int[] b = new int[32];

		int i = 0;
		while (n != 1) {
			b[i++] = n % 2;
			n = n / 2;
		}
		b[i] = n;

		for (int j = i; j >= 0; --j) {
			System.out.print(b[j] + " ");
		}

//		String binarString = Integer.toBinaryString(num);
//		System.out.println(binarString);
		
	}

}
