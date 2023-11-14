package 자바페스티벌최종;

import java.util.Scanner;

public class 문제27번_채점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		String input = sc.next();
		
		String[] arr = input.split("");
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case "o" : {
				num++;
				sum += num;
				break;
			}
			case "x": {
				num = 0;
				sum += num;
				break;
			}	
			}
		}
		System.out.println(sum);
		
		
	}

}
