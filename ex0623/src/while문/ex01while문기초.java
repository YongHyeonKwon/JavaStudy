package while문;

public class ex01while문기초 {

	public static void main(String[] args) {

		// while문 구조 
        // Hello World 5번 출력하는 코드 작성해보기!
		
		// 반복횟수를 정해주는 정수 num 생성하기
		int num = 0;
//		
//		while(num < 5) {
//			System.out.println("hello world");
//			num++;
//		}
		
		// while문 두번 째 방법
		// 무한반복문
		while(true) {
			System.out.println("두번 째 방법!");
			num++;
			if (num > 4) {
				break; //반복문을 멈추는 키워드
			}
		}
		
		
		
		
		
		
		
	}

}
