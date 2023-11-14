package ex01월급계산프로그램;

public class PartTimeEmployee extends Employee{
	

	// 일수 
	private int workDay;

	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		
		return pay*workDay;
	}

		
		
	}


