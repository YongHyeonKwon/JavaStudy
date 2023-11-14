package ex01학생관리프로그램;

public class Student {

	// 학생정보를 저장할 수 있는 자료형
	
	// 이름
	private String name;
	
	// 학번
	private String number;
	
	// 나이
	private int age;
	
    // Java점수
	private int scoreJava;
	
	// web 점수
	private int scoreWeb;
	
	// Android 점수
	private int scoreAndroid;

	
	
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}

	
	
	
	
	
	
	
	
	public Student() {
		
	}

	// 생성자 단축키 : alt shift s
	
	







	// 2. 메소드
	// getter메소드 
	// --> private 키워드로 함부로 접근할 수 없게끔 막아져있는 field값을 
	//     가져갈 수 있게끔 만들어주는 메소드
	public String getName() {
		return name;
	}

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

// 메소드 단축키 
	// " shift + alt + s 누른후  generate constructor using field 선택
	







	// setter메소드
	// --> private 키워드로 접근할 수 없게끔 막아져있는 field값을 
	//     설정(수정)할 수 있게끔 만들어주는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	
	// getter, setter --> eclipse 자동완성 단축키
    // alt shift s 
	
	
	
	
	
}
