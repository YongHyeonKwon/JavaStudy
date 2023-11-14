package ex01OOP기초;

public class MemberMain {

	public static void main(String[] args) {
		// JVM(java virtual machine) : ctrl f11 실행
		// --> 제일 먼저 찾아서 실행하는 메소드  >>>> main method
		// 모든 코드들은 main method 안쪽에 작성되어야만 실행 가능하다.
		
		// 1. Member 설계도면을 기반으로 m1 객체 생성
		// 자료형 객체명 = new 자료형()
		Member m1 = new Member();
		// new --> 레퍼런스 변수 생성하는 키워드
	
//		System.out.println(m1);
//		System.out.println(m1.name);
		// 레퍼런스 변수 (객체)의 기본 값은 null이다.
//		System.out.println(m1.age);
//		System.out.println(m1.alarm);
		
		// . --> 접근을 의미하는 기호, 객체가 가지고있는~
		m1.sendMessage();
		
		// 이름: 짝꿍 이름 넣어주기
		
		
		// 전화번호 : 010 1234 5678
		
		// 나이 : 20
		
		// 이름, 전화번호, 나이 콘솔 출력하기
		
		
		m1.name = "남현웅";
//		System.out.println(m1.name);
		
		m1.age = 20;
//		System.out.println(m1.age);
		
		m1.phone = "010 1234 5678";
//		System.out.println(m1.phone);
		
		// 클래스 설계도면으로 객체를 여러개 만들 수 있다.
		// 1. Member 클래스를 기반으로 m2 객체를 생성
		
		Member m2 = new Member();
		
		// 2. m2 이름, 나이, 이메일, 전화번호, 알람 등등을 본인 정보
		m2.name = "권용현";
		m2.age = 24;
		m2.email = "dydrkfl6719@naver.com";
		m2.phone = "010 9677 2654";
		m2.alarm = true;
		
		
		// 3. 출력하기
//		System.out.println(m2.name);
//		System.out.println(m2.age);
//		System.out.println(m2.email);
//		System.out.println(m2.phone);
//		System.out.println(m2.alarm);
		
		System.out.println("m1의 주소값 : "+m1);
		System.out.println("m2의 주소값 : "+m2);
		
		m2 = m1;
		
		System.out.println("m1의 주소값 : "+m1);
		System.out.println("m2의 주소값 : "+m2);
		
		m2.name = "문진환";
		
		System.out.println(m1.name);
		
		
		
	}

}
