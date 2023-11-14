package ex01월급계산프로그램;

public abstract class Employee {

	// 1. 필드
	// 접근제한자의 종류
	// - public : 어디서든 누구나 다 접근 가능
	// - private : 현재 클래스에서만 접근 가능
	// - default(아무 것도 안적는 것 == package) : 동일한 패키지에서만 접근 가능
	// - protected : 동일한 패키지거나 상속관계에 있는 경우 접근 가능
	
	// 사번
	protected String empno;
	// 이름
	protected String name;
	
	protected int pay;

	
	// 2. 메소드
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	
	public abstract int getMoneyPay();
	
	
	public String print() {
		return empno+" : "+name+" : "+pay;
	}
	
	
}
