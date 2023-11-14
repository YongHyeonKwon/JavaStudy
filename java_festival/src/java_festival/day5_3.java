package java_festival;

import java.util.Random;

public class day5_3 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int[] array = new int[6];
		
		
		
		for(int i = 0; i<array.length; i++) {
			array[i] = ran.nextInt(50)+1;	
			
		for(int j = 0; j<i; j++) {
			if(array[i]==array[j]) {
				i--;
				break;
			}
		}
		}
		
		for(int i=0; i<6; i++) {
		System.out.println("행운의 숫자 : "+array[i]);
		}
		
		
		
	}

}
