package 이차원배열;

import java.util.Arrays;

public class ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기
		
		int[] [] array = new int [3] [3];
		
		System.out.println(array);
		System.out.println("array의 1번 인덱스 출력 : " + array[1]);
		System.out.println(array[0] [2]); // 몇번째 행의 몇 번 인덱스로 들어갈지 정해줘야한다.
		
		// 2. 이차원배열 값을 넣으면서 생성하기
		int [] [] array2 = {{1,2,3,},
				            {4,5,6},
				            {7,8,9}};
		
		// 3. 이차원배열 안에 데이터 넣기!
		
		int num = 1;
		
		for( int j = 0; j<=2; j++) { // 행 데이터
		for(int i = 0; i<=2; i++) { // 열 데이터
		array[j] [i] = num++;
		}
		}

		
		// 4. 이차원배열 출력하기!!
		
		for (int j = 0; j < array.length; j++) { // 행 데이터
		for(int i = 0; i < array[j].length; i++) { // 열 데이터
		System.out.print(array[j] [i] + " ");
		}
		System.out.println();
		}
		
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		
		
	}

}
