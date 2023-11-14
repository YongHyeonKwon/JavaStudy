package ex01월급계산프로그램;

public class RegularEmployee extends Employee{

	// 사번

	// 보너스
	private int bonus;
	
	
	
	// 메소드
    public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	    }
		
	    
		public int getMoneyPay() {
			
			return (pay+bonus)/12;
		}
		
		
		
		
	

	}
	


