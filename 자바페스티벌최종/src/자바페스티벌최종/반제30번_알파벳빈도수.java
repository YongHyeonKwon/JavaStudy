package 자바페스티벌최종;

import java.util.Scanner;

public class 반제30번_알파벳빈도수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 빈도수 구하기");
		
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int [] array = new int[26];
		char [] num = str.toCharArray();
		
		for(int j= 0; j<str.length(); j++) {
			for(int i='a'; i<='z'; i++) {
				
				if(num[j]==i) {
					array[i-'a']++;
				}
			}
		}
			
			for(int j = 0; j<array.length; j++) {
				System.out.println((char)(j+97)+":"+array[j]+ " ");
			}
			
	}

}
