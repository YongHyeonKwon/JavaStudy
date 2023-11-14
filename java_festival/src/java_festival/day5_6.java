package java_festival;

import java.util.Scanner;

public class day5_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String input = sc.next();
		
		String [] array = input.split("");
	
		int cnt = 0;
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			switch(array[i]) {
			case "o" :
				cnt ++;
				sum += cnt;
				break;
			case "x" :
				cnt = 0;
				break;
				
			}
		}
		
		
		System.out.println(sum);
		
		
		
	}

}
