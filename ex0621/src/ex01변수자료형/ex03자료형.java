package ex01변수자료형;

public class ex03자료형 {

	public static void main(String[] args) {
		
		// java 기본 자료형 (8가지)
		// 1. 논리 자료형 : boolean
		// --> 참 혹은 거짓을 저장하는 데이터(1byte)
		// 참을 저장할 수 있는 bool 변수 선언
		boolean bool =  true; // false
		System.out.println(bool);
		
		// 2. 문자 자료형
		// --> 문자데이터를 저장할 수 있는 자료형(2byte)
		// 손을 저장할 수 있는 변수 name을 선언
		char name2 = '손';
		// --> char는 문자 하나만 저장 가능! ''(따옴표)를 사용해서 값을 부여
		System.out.println(name2);
		
		// 3. 문자열 자료형 : String
		// --> 문자데이터를 자정할 수 있는 자료형(기본 자료형이 아님!!!!!!) 
		String name = "손지영";
		System.out.println(name);
		
		// 4. 정수 자료형
		// byte(1), short(2), int(4), long(8)
		// --> 각각의 크기는 표현할 수 있는 숫자의 범위를 의미한다.
		// ex) byte : -128 ~ 127까지만 표현 가능
		// 자바에서는 정수 데이터를 입력하면 int(default) 인식
		
		// byte 자료형 변수 num을 선언해서 128 숫자 데이터를 담아주세요.
		byte num = (byte) 130;
		// casting(형변환)
		// (1) 강제 형변환(명시적 형변환)
		// --> 큰 용량의 저장공간에서 작은 용량으로 데이터 옮기는 작업
		//     데이터 손실 발생 가능성이 있다.
		// --> 데이터 손실이 일어나도 괜찮으니 강제로 자료형을 바꿀 때 사용
		System.out.println(num);
		// 128 --> int 자료형으로 인식 (4byte) --> 1byte 공간 담아주기
		
		// 5. 실수 자료형(소수점)
		// : float(4) , double(8 / default)
		double num2 = 4;
		// (2) 자동 형변환 (묵시적 형변환)
		//: 작은 용량을 담은 공간에서 큰 용량을 담을 수 있는 공간으로 
		//  데이터를 옮겨줄 때 자동으로 자료형 변환이 일어난다.
		System.out.println(num2);
		
		//3.14라는 데이터를 저장할 수있는 float 자료형 num3 변수 선언
		float num3 = (float) 3.14;
		
		float num4 = 3.14f;
		
		// 소수점 값을 기입하면 double형태로 인식한다!!!!
		
		
		
		
		
		
		
		
		
		
		
		// + 보너스 단축키 +
		// 원하는 단락 이동 : alt 화살표(위,아래)
		// 원하는 단락 복사 : ctrl alt 화살표(위,아래)
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
