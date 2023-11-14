package 이중for문;

public class ex04공포의별찍기 {

	public static void main(String[] args) {

		// 핸드디버깅 --> for문을 손으로 하나씩 다 풀어서 작성
		
		
		for(int j = 4; j>=0; j--) {
		for(int i = 0; i < j; i++) { // 4-3-2-1-0
		System.out.print(" ");
		}
		// j : 4-3-2-1-0
		// i : 1(5-4)-2(5-3)-3(5-2)-4-5
		for(int i = 0; i < 5-j; i++) { // 1-2-3-4-5
		System.out.print("*");
		}
		System.out.println();
		}

		
		
		
//		for (int k = 4; k >= 0; k--) {
//			for (int i = 0; i < k; i++) {
//				System.out.print(" ");
//			}
//			for (int j = 5; j > k; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		for(int j = 4; j>=0; j--) {
//			for(int i = 0; i < j; i++) { // 4-3-2-1-0
//			System.out.print(" ");
//			}
//			// 5-j : 1 - 2 - 3 - 4 - 5
//			// i : 1 - 3 - 5 - 7 - 9
//			for(int i = 0; i < (5-j)*2-1; i++) { // 1-2-3-4-5
//			System.out.print("*");
//			}
//			System.out.println();
//			}
//		
//		for(int j = 1; j<=4; j++) {
//			for(int i = 0; i < j; i++) { // 4-3-2-1-0
//			System.out.print(" ");
//			}
//			// 5-j : 1 - 2 - 3 - 4 - 5
//			// i : 1 - 3 - 5 - 7 - 9
//			for(int i = 0; i < (5-j)*2-1; i++) { // 1-2-3-4-5
//			System.out.print("*");
//			}
//			System.out.println();
//			}
		
		
		
		
		
		
		
		

	}

}
