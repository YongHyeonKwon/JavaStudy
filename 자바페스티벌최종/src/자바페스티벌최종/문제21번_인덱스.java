package 자바페스티벌최종;

public class 문제21번_인덱스 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int min = Math.abs(point[0] - point[1]);

		int a = 0;
		int b = 0;

		for (int j = 0; j < point.length; j++) {
			for (int i = 0; i < point.length; i++) {
				if (j != i) {
					if (Math.abs(point[j] - point[i]) < min) {
						min = Math.abs(point[j] - point[i]);
						a = j;
						b = i;
					}
				}
			}
		}

		System.out.println("result = [" + a + ", " + b + "]");

		
		
		
	}

}
