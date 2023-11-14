package for문;

import java.util.Scanner;

public class ex06약수구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 약수 구하기
		// 입력받은 정수의 약수 구하기
		// 1. 정수 입력 출력
		System.out.print("정수 입력 : ");
		// 2. 정수 입력 받기
		int num = sc.nextInt();
		// 3. 정수를 나눌 수 있는 임의 숫자 모두 가져오기(for문)
		for(int i = 1; i <= num ;i++) {
		// 4. 입력받은 숫자를 임의의 숫자로 나누었을 때
	    //    나머지가 0이라면 --> 약수! ---> 출력해주기
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i < num+1 ;i++) {
//			
//			if(num%i==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		
		
		
		
		
		
		
	}

}
