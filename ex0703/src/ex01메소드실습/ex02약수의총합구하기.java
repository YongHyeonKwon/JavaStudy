package ex01메소드실습;

public class ex02약수의총합구하기 {

	public static void main(String[] args) {

		System.out.println(getSum(44));
		
	}
	
	public static int getSum (int num) {
		
		// num의 약수를 구해서 num을 제외한 약수들의 총합을 구하기
		// 4의 약수 --> 4 % ? == 0
		
		// 1. 약수의 총합을 구할 수 있는 변수 선언하기 
		int  sum = 1; 
		for(int i = 2; i <= num/2; i++) {
		// 2. num을 ? 나누었을 때 나누어 떨어진다면 
		if(num % i == 0) {
		// 3. 총합 누적하기 
			sum += i;
		}
		}	
		// 4. 2~3 num 만큼 반복
		return sum;
		
		// 5. 총합 결과값 반환하기
		
		
//		int sum = 0;
//		
//		for(int i = 1; i < num ;i++) {
//				if(num%i==0) {
//					sum += i;
//			}
//		}
//	
//		return sum;
	}
	}
