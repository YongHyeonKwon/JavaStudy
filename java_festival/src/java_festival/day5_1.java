package java_festival;

import java.util.Random;

public class day5_1 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] array = new int[8];
		int max = 0;
		int min = 56;
		
		System.out.print("배열에 있는 모든 값 : ");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(46) + 10;
			System.out.print(array[i]+" ");
			
			if(array[i] > max) {
				max = array[i];	
			}else if(array[i]<min) {
				min = array[i];
			}
			
		}
		
		System.out.println();
		System.out.print("가장 큰 값 : "+max);
		System.out.println();
		System.out.println("가장 작은 값 : "+min);
		
		
		
		
		
		
	}

}
