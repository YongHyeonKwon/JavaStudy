package 메소드;

public class ex03메소드오버로딩 {

	public static void main(String[] args) {

		// 메소드 중복정의 ---> 메소드 오버로딩
		
		// 메소드 오버로딩의 조건
		// 1. 메소드 이름이 같아야 한다.
		// 2. 매개변수의 개수 혹은 타입(자료형)이 달라야한다.
		// 3. 매개변수와 메소드 이름이 동일하고 리턴 타입만 다른 경우는 오버로딩이 아니다.
		
		System.out.println(add(3.5,5.5));
		System.out.println(add(3.5,5));
		
		
	}
	// 메소드 오버로딩 성립 조건    참고) 명품자바 209p
	// 1. 메소드 이름이 같아야 한다.
	// 2. 매개변수의 개수 혹은 타입(자료형)이 달라야한다.
	// 3. 매개변수와 메소드 이름이 동일하고 리턴 타입만 다른 경우는 오버로딩이 아니다.
	
	private static double add(double num1, double num2) {
		return num1+num2;
	}

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	
	
}
