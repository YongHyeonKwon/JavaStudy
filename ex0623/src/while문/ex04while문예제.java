package while문;

import java.util.Scanner;

public class ex04while문예제 {

	public static void main(String[] args) {

		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		int even = 0; // 짝수
		int odd = 0; // 홀수
		
		// 2. 정수 입력 출력하기
		
		while(true) {System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		int num = sc.nextInt();
		// 4. 입력받은 정수가 짝수라면 짝수의 개수를 +1
		if (num % 2 ==0) {
			even++;
		}else if(num %2 ==1) {
			// 5. 입력받은 정수가 홀수라면 홀수의 개수를 +1
			// --> 짝수, 홀수의 개수를 저장할 변수가 하나씩 필요
			odd++;
		}else if(num == -1) {
			System.out.println("종료되었습니다.");
			break;
		}
		// 6. 짝수와 홀수의 개수를 출력
		System.out.println("짝수 개수 : "+even);
		System.out.println("홀수 개수 : "+odd);}
		// 7. 2~6까지 반복! -을 입력하면 프로그램 종료!
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
		
//		int jjacksum = 0;
//		int holesum = 0;
//		
//		while (true) {
//			System.out.print("숫자 입력 : ");
//			int num = sc.nextInt();
//			
//			if (num%2==0) {
//				jjacksum += 1;
//				System.out.println("짝수개수 : "+jjacksum);
//				System.out.println("홀수개수 : "+holesum);
//			}else if (num%2==1) {
//				holesum += 1;
//				System.out.println("짝수개수 : "+jjacksum);
//				System.out.println("홀수개수 : "+holesum);
//			}else if (num == -1) {
//				System.out.println("종료되었습니다.");
//				break;
//			}
//			
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
