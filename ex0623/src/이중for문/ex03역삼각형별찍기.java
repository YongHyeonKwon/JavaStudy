package 이중for문;

public class ex03역삼각형별찍기 {

	public static void main(String[] args) {

		// 반복문의 핵심!!!!!
		// --> 패턴 찾기
		// *****
		for (int j = 5; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}

//		for(int i =1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
//		

//		for(int j = 1; j <=5; j++){
//			for (int i = 5; i >= j; i--)
//			System.out.print("*");
//		System.out.println();}

//		for (int i = 0; i < 4; i++)
//			System.out.print("*");
//		System.out.println();
//
//		for (int i = 0; i < 3; i++)
//			System.out.print("*");
//		System.out.println();
//
//		for (int i = 0; i < 2; i++)
//			System.out.print("*");
//		System.out.println();
//
//		for (int i = 0; i < 1; i++)
//			System.out.print("*");
//		System.out.println();

	}

}
