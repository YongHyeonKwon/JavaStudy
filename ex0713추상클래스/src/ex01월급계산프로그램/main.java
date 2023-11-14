package ex01월급계산프로그램;

public class main {

	public static void main(String[] args) {

		Employee[] employees = new Employee[3];
		
		// 정규직 생성
		employees[0] = new RegularEmployee("SMHRD001", "홍O동", 4000, 400);
		// 비정규직 생성
		employees[1] = new TempEmployee("SMHRD002", "박O수", 3000);
	    // 파트타임 생성
		employees[2] = new PartTimeEmployee("SMHR001", "김O독", 10, 10);
		
		// 모든 인원들의 월급, 정보를 출력해주세요
		// 객체배열 for문 돌리는 작업할 때 조금 더 for문을 쉽게쓰는 방법!
		// for-each문
		// for(자료구조에서 하나씩 꺼내오는 데이터 타입 변수명 : 순서가 있는 자료구조
		for(Employee e:employees) {
		System.out.println(e.print());
		System.out.println(e.getMoneyPay()+"만원");
		
	}

}
}