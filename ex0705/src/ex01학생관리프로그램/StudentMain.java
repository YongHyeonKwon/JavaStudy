package ex01학생관리프로그램;

public class StudentMain {

	public static void main(String[] args) {

		// Student 클래스 설계도면을 기반으로 stu1이라는 객체 생성
		Student stu1 = new Student();
		
		// stu1이 가지고 있는 이름을 손지영으로 변경해주세요.
		stu1.setName("손지영");
		
		// stu1이 가지고 있는 이름을 출력해주세요.
		System.out.println("설정된 이름 : " + stu1.getName());
		
		stu1.setNumber("20220878");
		stu1.setScoreJava(50);
		
		System.out.println(stu1.getNumber());
		System.out.println(stu1.getScoreJava());
		
		// Student 설계도면 기반으로 stu2 객체 생성
		Student stu2 = new Student("김운비", "1234", 20);
		// 이름 -> 김운비, 학번 -> 0000, 나이 -> 20 ...
		// new 클래스명() : 생성자(constructor) 호출
		// 1) 생성자도 메소드(객체를 생성하는 순간에 자동으로 호출되는 메소드)이다.
		// 2) 매개변수로 아무런 값도 받지않는 생성자 --> 기본 생성자
		//    기본 생성자는 설계도면에서 생략가능하다.
		// 3) 생성자는 리턴타입을 지정조차 하지 않는다. --> void xxxxxxx
		// 4) 생성자의 이름은 반드시 클래스명과 동일해야한다. (대소문자까지)
		// 5) 새로운 생성자를 만든다면, 기본 생성자는 덮어씌워진다.
		//    --> 생성자를 오버로딩으로 기본 생성자를 새로 만들 수 있다. 
		
		// () --> 메소드 호출
		
		
		
		
		
		
		
		
		
		
	}

}
