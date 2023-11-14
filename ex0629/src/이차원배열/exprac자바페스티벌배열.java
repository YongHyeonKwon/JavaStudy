package 이차원배열;

import java.util.Arrays;
import java.util.Scanner;

public class exprac자바페스티벌배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >> ");
		int n = sc.nextInt();
		
		int [][] array = new int [n][n];
		
		int num = 1;
		// n = 5
		
		for(int j = 0; j<array.length; j++) { // 열
		for(int i= 0; i<array[0].length; i++) { // 행
		array [i] [j] = num++;
		}
		}

		
		for(int j = 0; j<array.length; j++) {
			for(int i = 0; i<array[0].length; i++) {
			System.out.print(array[j] [i] + "\t"); //tab 크기만큼 띄어쓰기
			}
			System.out.println();
			}
		
		
		
		
		
	}

}
