package 자바페스티벌최종;

import java.util.Scanner;

public class 문제25번_대시문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] dash = {6,2,5,5,4,5,6,3,7,6};
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		int result = 0;
		
		while(num>0) {
			int a = num % 10;
			result += dash[a];
			num/= 10;
		}
		System.out.println("대시('-')의 총 합 >> " + result);
		
		
		
		
		
	}

}
