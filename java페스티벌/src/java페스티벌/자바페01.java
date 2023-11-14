package java페스티벌;

public class 자바페01 {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n) ;
		System.out.println("결과 학인 : " + result);
		
	}

	public static int powerN(int base, int n) {
		
		int result = base;
		
		for(int i = 1; i<n; i++) {
		
			result *= base;
		}
		return result;
	}
	
}
