package ex02연산자;

import java.util.Scanner;

public class ex01산술연산자 {

	public static void main(String[] args) {	
		//main없이 클래스 파일이 생성되었다면?!
		//>> main ctrl space --> 내장되어있는 코드블록 자동완성
		
		//산술연산자
		//   / : 몫
		//   % : 나머지
		// --> 정수끼리 연산을 진행하면 정수 자료형
		// --> 정수와 실수 연산을 진행하면 실수 자료형
		// --> 문자열 + 문자열 --> + 연결
		// --> 문자열 + 숫자 --> 결과값이 문자열 형태가 된다.
		//ex) "1" + 5 + 2 --> "152"
		
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 첫 번째 정수 입력: 출력하기 (개행없이)
		System.out.print("첫번째 정수입력 : ");
		// 3. 숫자 데이터 입력받기 --> 변수에 저장
		int num1 = sc.nextInt(); 
		//4. 두 번째 정수 입력: 출력하기(개행없이)
		System.out.print("두번째 정수입력 : ");
		// 5. 숫자 데이어 입력받기 --> 변수에 저장
		int num2 = sc.nextInt();
		// 6. 더한 결과 값 연산 후 출력하기
		System.out.println("더한 결과 값 : " + (num1+num2));
		// 7. 뺀 결과 값 연산 후 출력하기 
		System.out.println("뺀 결과 값 : " + (num1-num2));
		// 8. 곱한 결과 값 연산 후 출력하기 
		System.out.println("곱한 결과 값 : " + (num1*num2));
		// 9. 나눈 결과 값 연산 후 출력하기
		System.out.println("나눈 결과 값 : " + ((double)num1/num2));
		// --> 강제 형변환은 에러 뜰 때만 하는게 아니다!!!
		// --> 내가 결과 값을 산출하기 위해서 형변환이 필요하다면, 언제든지 사용 가능하다!!
          
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수입력 : ");
//		int num1 = sc.nextInt(); 
//		
//		System.out.print("두번째 정수입력 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("더한 결과 값 : " + (num1+num2));
//		
//		System.out.println("뺀 결과 값 : " + (num1-num2));
//		
//		System.out.println("곱한 결과 값 : " + (num1*num2));
//		
//		System.out.println("나눈 결과 값 : " + ((double)num1/num2));
	

			
		}
		

	}


