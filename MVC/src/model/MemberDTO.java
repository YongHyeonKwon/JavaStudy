package model;

public class MemberDTO {

	// DTO : Data Transfer Object 데이터를 이동할 수 있게 하는 나만의 자료형
	// Table 마다 한 개씩 필요
	// Table의 컬럼들을 필드값으로 가짐.
	
	
	
	// 1. 필드
	
	// 아이디 
	private String id;
	// 패스워드
	private String pw;
	// 이름
	private String name;
	// 나이
	private int age ;
	
	
	// 2. 메소드
	
	// 모든 필드 값을 채우는 생성자 메소드, setter, getter
	
	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
