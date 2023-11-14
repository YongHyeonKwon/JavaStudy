package java페스티벌;

import java.util.Random;

public class 자바로또 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int [] num = new int[6];
		
		for(int j = 0; j<num.length; j++) {
			num [j] = ran.nextInt(60)+1;
			for(int i = 0; i<j; i++) {
				if(num[i]==num[j]) {
					j--;
					break;
				}
			}
		}
		
		for(int i = 0; i<num.length; i++) {
		System.out.print("행운의숫자 : "+ num[i]);
		System.out.println();
		}
		
	}

}
