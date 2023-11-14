package for문;

public class ex02for문예제 {

	public static void main(String[] args) {

		// for문을 활욜해서 96에서 73까지 출력
		// 숫자들 중에서 홀수만 출력!!
		for (int i = 96; i > 72; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 96; i > 72; i--) {
			if (i % 2 == 1) {
				//홀수 인지 확인!!
				System.out.print(i + " ");
			}

		}

	}

}
