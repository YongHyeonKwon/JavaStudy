package ex01메소드실습;

public class ex05메소드오버로딩 {

	public static void main(String[] args) {
		// 메소드 오버로딩?
		// : 매개변수가 자료형 타입이나 개수가 다르게 메소드를 중복으로 선언하는 기법
		// --> 리턴타입이 다른 것도 오버로딩인가요?
		// --> xxxxx
		
		
		
	}

	// 1. 정수형 매개변수를 2개 받아서 더한 결과값을 되돌려주는 add 메소드 생성
	public static int add (int num1, int num2) {
		return num1+num2;
	}
	
	// 2. 실수형 매개변수를 2개 받아서 더한 결과값을 되돌려주는 addDouble 메소드 생성
	public static int add (double num1, double num2) {
		return (int) (num1+num2);
	}
	
}
