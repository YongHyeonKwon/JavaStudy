package ex01변수자료형;

import java.util.Scanner;

public class ex04입력하기 {

	public static void main(String[] args) {

		// name이라는 변수에 이름을 입력받아주세요.
		// name을 출력해주세요.
		
		// 1. 입력받는 도구 꺼내오기
		
		Scanner sc =  new Scanner(System.in);
		
		// 2. 이름을 입력하세요. 개행없이 출력
		System.out.print("이름을 입력하세요 : ");
		
		// 3 이름을 입력하기 --> name이라는 변수에 입력받은 데이터 저장하기
		String name = sc.next();
		
		// 4. 이름을 출력하기
		System.out.print("입력받은 이름 >> ");
		System.out.println(name);
		
		// 5. 숫자를 입력받기
		int num = sc.nextInt();
		System.out.print("입력받은 숫자>> ");
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
