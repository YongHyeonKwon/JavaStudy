package car;

import java.util.Scanner;

import model.Function;

public class taxi extends CarSituation {
	
	
	public taxi(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
		
		
		Function fc = new Function();
		 System.out.println("아 저 택시 너무 저돌적인데..");
         fc.timeAndStress();
         System.out.println("택시가 왼쪽 깜빡이를 켜고 끼어들려고 한다.");
         fc.timeAndStress();
         
         
	while(true) {
        System.out.println("1. 어림도 없다. 절대 안 비켜주지 / 2. 네 얼른 지나가세요.");
        
        int num = sc.nextInt();
        if (num == 1) {
           System.out.println("(끼이이익 ~ 쾅)");
           fc.timeAndStress();
           System.out.println("접촉사고가 발생했다... 일단 뒷목잡고 내려본다.");
           fc.timeAndStress();
           System.out.println("합의하고 보험처리 해야하는데..");
           fc.spendTime(60);
           fc.getStress(50);
           System.out.println("[스트레스 지수 50↑ , 시간 60분 소요]");
           fc.timeAndStress();
           
           break;
           
        } else if (num == 2) {
           System.out.println("휴~ 사고 하나 막았다.");
           fc.timeAndStress();
           System.out.println("방어운전 안전 운전의 시작은 양보입니다.");
           fc.spendTime4();
           fc.timeAndStress();
           break;
        }else
        	fc.infoNum();
    }
}
}