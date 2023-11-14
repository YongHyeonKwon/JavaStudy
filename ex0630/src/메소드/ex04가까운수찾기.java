package 메소드;

import java.util.Scanner;

public class ex04가까운수찾기 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("정수 입력 : ");
	int num1 = sc.nextInt();
	System.out.print("정수 입력 : ");
	int num2 = sc.nextInt();
	int result = close10( num1, num2);
	System.out.println("10에 가까운 수 : " + result);
				

	}

	public static int close10(int num1, int num2) {
		
		int result = 0;
		// 6, 5를 봤을 때 10과 가까운 수를 찾기 위해서 
		// 10-6 =>4  /  10-5 =>5  ---> 둘중에 더 작은 수가 10에 더 가깝다고 판단!
		// 9, 12를 봤을 때 
		// 10-9 =1 / 10 - 12 = -2 ---> 둘중에 더 작은 숫자 --> 12 xxx

		// 1. 큰수에서 작은수를 뺀다. (if가 많아진다!)
		// 2. 제곱 해주기 --> 1*1=1/-2*-2=4 --> -를 뗄수 있는 방법
//		if((10-num1)*(10-num1) < (10-num2)*(10-num2)) {
//			result = num1;
//		}else if ((10-num1)*(10-num1) > (10-num2)*(10-num2)) {
//			result = num2;
//		}else {
//			result = 0;
//		}
		// 3. 절댓값 씌우는 방법
		if(Math.abs(10-num1)<(Math.abs(10-num2))) {
			result = num1;
		}else if(Math.abs(10-num1)>(Math.abs(10-num2))) {
			result = num2;
		}else {
			result = 0;
		}
			
			
			
			
			
		
		
		return result;
		
		
		
//		int resultNum1 = 10 - num1;
//		int resultNum2 = 10 - num2;
//		
//		if (resultNum1 < 0) {
//			resultNum1 = -1 * resultNum1;
//		}
//		
//		if (resultNum2 < 0) {
//			resultNum2 = -1 * resultNum2;
//		}
//		
//		if (resultNum1 > resultNum2) {
//			result = num2;
//		}else if (resultNum1 < resultNum2) {
//			result = num1;
//		} else {
//			result = 0;
//		}
//		return result;

	}
	
	
}
