package 자페prac;

import java.util.Scanner;

public class prac06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 n을 입력하세요");
		int n = sc.nextInt();
		
		int [][] arr = new int [n] [n];
		
		int num = 1;
		
		for(int j = 0; j<n; j++) {
			
			if(j%2==0) {
				for(int i = 0; i<n; i++) {
					arr[j][i] = num++;
				}
			}else if(j%2==1){
				for(int i = n-1; i>=0; i--) {
					arr[j][i] = num++;
				}
			}
		}
		
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(arr[j][i] + "\t"); // tab 크기만큼 띄어쓰기
			}
			System.out.println();
		}
		
	}

}
