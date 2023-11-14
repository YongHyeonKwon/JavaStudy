package ex02통장관리프로그램;

public class Bankbook {
	// 내가 설계하는 나만의 자료형
	
	// 1. 필드(데이터, 속성)
	// 정수형 money(잔액)
	private int money;
	// 클래스 설계도면에 존재하는 데이터를 함부로 접근할 수 없게끔 접근제한자 private 추가
	// 캡슐화 --> 정보은닉 지켜주기!
	
	// 2. 메소드(행위, 로직)
	// 리턴타입x 매개변수로 정수형 데이터를 하나 받아오는 deposit(입금하다) 메소드 생성
	// --> 매개변수로 받아온 데이터를, 잔액에 더하면서 누적하기
	public void deposit(int money) {
		this.money += money;
		// this 키워드
		// : 내가 코드를 작성하고 있는 클래스 자체를 의미
		// this -> Bankbook
		// . -> 가지고 있는
		// money -> 필드
	}

	// 리턴타입x 매개변수로 정수형 데이터를 하나 받아오는 withdraw(출금하다) 메소드 생성
	// -->  매개변수로 받아온 데이터를, 잔액에 빼면서 누적하기
	public void withdraw(int money) {
		
		if(this.money<money) {
			System.out.println("잔액이 부족합니다ㅠㅠ");
		}else {
			this.money -= money;
		}
	}
    // 리턴타입x 매개변수로 정수형 데이터를 하나 받아오는 showMoney(잔액조회) 메소드 생성
	// --> 잔액을 결과값으로 반환
	public int showMoney() {
		return money;
	}

}