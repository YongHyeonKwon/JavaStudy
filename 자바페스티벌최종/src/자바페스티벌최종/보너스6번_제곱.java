package 자바페스티벌최종;

public class 보너스6번_제곱 {

	public static void main(String[] args) {

		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}

	public static int powerN(int base, int n) {


		int result = base;
		
		for(int i = 1; i<n; i++) {
		result *= base;
		}
		return result;

	}

}
