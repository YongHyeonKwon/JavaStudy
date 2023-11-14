package java_festival;

import java.util.Scanner;

public class day5_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			num[i] = sc.nextInt();
		}
		
		// i == 0 -- 5  0 1 2 3 4    j == 1 2 3 4 5
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i + 1; j < num.length; j++) {
				
				if (num[i] > num[j]) {
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
					
				} else {
					break;
				}
			}
		}
	}

}
