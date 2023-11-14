package ex01변수자료형;

import java.util.Scanner;

// import java.util.Scanner;
// 도구를 꺼내올 때는 정확하게 위치를 지정해줘야한다!
// 꺼내와야하는 위치를 지정하는 방식 --> import

public class ex01입출력 {

	public static void main(String[] args) {
		// 주석(메모하는 역할)
		// --> 코드에 영향을 끼치지 않는다.
		// java에서 코드를 작성할 때는 반드시 main {} 안쪽에 작성해야한다!!★★★★★
		
		// 1. 코드 확대, 축소 
		// : ctrl +, ctrl - 
		
		// java 출력문
		// --> 암기
		System.out.println("Hello world!");
		// 빨간줄 에러가 뜨면 마우스를 올려서 error 구문을 확인하자! (영어 모르면 papago)
		// 저장: ctrl s
		
		// 2. 실행 단축키
		// : ctrl f11
		
		// 3. 출력문 단축키
		// syso 쓰고 ctrl space
		// --> syso같은 코드 블록 묶음 : snippet
		System.out.println("권용현");
		
		// java 입력문
		// (1) 입력할 수 있는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// (2) 입력받기
		System.out.print("이름을 입력하세요 >> ");
		// 줄바꿈(개행) 안하고 싶다면 println --> print
		sc.next();
		
		// 4.import 단축키
		// ctrl shift o
		
		// 5. 코드 자동완성 보조도구 단축키
		// : ctrl space
		
		
		
		
		
		
	}

}
