package ex01메소드실습;

public class ex03완전수구하기 {

	public static void main(String[] args) {
		
		// ctrl 누른 상태에서 메소드 호출하는 걸 클릭
		// --> 선언하는 구간으로 데리고 가준다!
		// 공부할 때, 핸드디버깅하면서 메소드의 흐름을 파악해보기!!
		
		for(int i =2; i< 1001; i++) {
		if(isPerfect(i)) {
			System.out.println(i);
		}
		}
		
		
		
		
//		int getSum = 0;
//	
//		System.out.print("1부터 1000까지의 완전수 : ");
//		
//	    for(int i = 2; i<=1000; i++) {
//	    	if(i==getSum(i)) {
//	    		System.out.print(i+" ");
//	    	}
//		}
	}

	public static int isDivisor(int num1, int num2) {
		// num1을 num2로 나누었을 때 나누어 떨어진다면 
		// --> num2가 num1의 약수 
		// --> num2를 결과값으로 반환
		// 그렇지 않은 경우
		// --> 0 결과값으로 반환
		return num1 % num2 == 0 ? num2 : 0;
	}

	public static int getSum(int num) {

		int sum = 1;
		for (int i = 2; i <= num / 2; i++) {
				sum += isDivisor(num,i);
			
		}
		return sum;
	}

	public static boolean isPerfect(int num) {

		int sum = getSum(num);

		return getSum(num) == num;
	}

}
