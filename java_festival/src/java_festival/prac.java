package java_festival;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {

	int [] [] arr = new int [5] [5];
	int num = 1;
	
	for(int i=0; i<5; i++) {
		for(int j = 0; j<5; j++) {
			arr[j][i] = num++;
		}
	}
		
	for(int i = 0; i<5; i++) {
		for(int j = 0; j<5; j++) {
			System.out.print(arr[i][j] + " ");
			
		}
		System.out.println();
	}
}
}