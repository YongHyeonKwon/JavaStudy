package car;

import java.util.Scanner;

public class parking extends CarSituation {

	public parking(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
	
		
		System.out.println("와 오늘 아침 쉽지 않다. 주차할 데도 없네");
		fc.timeAndStress();
		while (true) {
			System.out.println("1. 그냥 대로변에 주차한다. 2. 주차 자리를 찾아다닌다.");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("(요즘엔 카메라가 깔려 있답니다..)[주차단속에 걸렸습니다.]");
				fc.getStress(+40);
				fc.spendTime(5);
				fc.timeAndStress();
				System.out.println("[스트레스 지수 40↑ , 시간 5분 소요]");
				fc.timeAndStress();
				break;
			} else if (num == 2) {
				System.out.println("주위를 빙빙 돌다가 겨우 찾아냈다.");
				fc.spendTime(10);
				fc.getStress(5);
				fc.timeAndStress();
				System.out.println("[스트레스 지수 5↑ , 시간 10분 소요]");
				break;
			} else
				fc.infoNum();
		}
	}
}
