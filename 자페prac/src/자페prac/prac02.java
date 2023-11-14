package 자페prac;

import java.util.Random;

public class prac02 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		int [] num = new int[6];
		
		
		for(int i = 0; i<num.length; i++) {
			num[i] = ran.nextInt(60)+1;
		for(int j = 0; j<i; j++) {	
			if(num[i]==num[j]) {
				i--;
				break;
			}
		}
		}
		
		for(int i = 0; i<num.length; i++) {
		System.out.println("행운의 숫자: " + num[i]);
		}
	}

}
