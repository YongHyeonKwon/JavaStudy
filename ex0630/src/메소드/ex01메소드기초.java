package 메소드;

public class ex01메소드기초 {

	public static void main(String[] args) {
		
		// 메소드 사용하기  (main 영역 안쪽에서 사용하기)
		double result = addDouble(3.14, 4.2);
		System.out.println(result);
	
		System.out.println(minusNum(9,85));
		
		// ~~~~() == 메소드
		
	}
	
	// 2. 빼기 메소드 
	// 리턴타입 : int / 매개변수는 : int 2개 / 메소드명: minusNum
	// 매개변수로 받아온 데이터 두개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰수에서 작은수를 뺀 결과를 돌려주기 
	
	public static int minusNum(int num1, int num2 ) {
		
	
		int result = 0;
		result = num1 > num2? num1-num2 : num2 - num1;
		
		return result;
	}
		
		
		
//		if (num1>num2) {
//			int result1 = num1 - num2;
//			return result1;
//		}else {
//			int result1 = num2-num1;
//			return result1;
//		}
//	}
	
	
	
	
	
	
	
	
	
	// 메소드 생성(main영역을 벗어나서 작성하기)
	// 1.더하기 메소드
	// 리턴타입 : double / 매개변수 : 2개 double / 메소드명 :addDouble
	public static double addDouble(double num1, double num2) {
		// void : 리턴타입이 없다는 것을 의미하는 키워드 
		double result = num1 + num2;
		// 메소드는 return을 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에만 코드를 작성할 것!!
		return result;
	}
	
	
	
	
	

}
