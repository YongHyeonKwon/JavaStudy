package java페스티벌;

import java.util.Scanner;

public class 자바페2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int num = sc.nextInt();
		
		int jan = num;
		
		System.out.println("잔돈 : " + jan+"원");
		System.out.println("10000원 : " + jan/10000+ "개");
		System.out.println("5000원 : " + jan%10000/5000+ "개");
		System.out.println("1000원 : " + jan%10000%5000/1000+ "개");
		System.out.println("500원 : " + jan%10000%5000%1000/500+ "개");
		System.out.println("100원 : " + jan%10000%5000%1000%500/100+ "개");
		
		
		
		
		
		
		
	}

}
