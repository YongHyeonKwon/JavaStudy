package 자바페스티벌최종;

public class 문제06번 {

	public static void main(String[] args) {

		int plus = 1;
		int sum = 0;

		for (int i = 77; i > 0; i--) {

			sum += i * plus;
			plus++;

		}

		System.out.println(sum);

	}

}
