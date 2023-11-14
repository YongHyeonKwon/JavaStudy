package 이차원배열;

import java.util.Arrays;

public class ex02이차원배열예제 {

	public static void main(String[] args) {

		int [][] array =  new int [5] [5];
		
		int num = 21;
		
		
		for(int j = 0; j< 5; j++) { // 열을 바꿔주는 식
		for(int i = 0; i < 5; i++) { // 행을 바꿔주는 식
		array [i] [j] = num++;
		}
		}
		
		
		for(int j = 0; j<5; j++) {
		for(int i = 0; i<5; i++) {
		System.out.print(array[j] [i] + " ");
		}
		System.out.println();
		}
		
		
		
		
		// 규칙!
		
//		array [0] [0] = num++; 
//		array [1] [0] = num++;
//		array [2] [0] = num++;
//		array [3] [0] = num++;
//		array [4] [0] = num++;
//		
//		array [0] [1] = num++; 
//		array [1] [1] = num++;
//		array [2] [1] = num++;
//		array [3] [1] = num++;
//		array [4] [1] = num++;
//		
//		array [0] [2] = num++; 
//		array [1] [2] = num++;
//		array [2] [2] = num++;
//		array [3] [2] = num++;
//		array [4] [2] = num++;
		
		
		
		
		
		
		// 이렇게 만드세요.
		
		// 21 26 31 36 41
		// 22 27 32 37 42
		// 23 28 33 38 43
		// 24 29 34 39 44
		// 25 30 35 40 45
		
		
//		int [][] array =  new int [5] [5];
//		
//		int num = 21;
//		
//		
//		for(int j = 0; j <5; j++) {
//		for(int i = 0; i <5; i++) {
//		array [i] [j] = num++;
//		}
//		}
//	

//		for (int j = 0; j < array.length; j++) { // 열 데이터
//			for(int i = 0; i < array[j].length; i++) { // 행 데이터 
//			System.out.print(array[j] [i] + " ");
//			}
//			System.out.println();
//			}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
