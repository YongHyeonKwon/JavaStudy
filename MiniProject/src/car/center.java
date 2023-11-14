package car;

import java.util.Scanner;

public class center extends CarSituation{

	public center(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
		
		System.out.println("보닛에서 연기가 난다. 학원 근처에 정비소가 하나 있는데 들렀다 가야하나?");
		timeAndStress();
		System.out.println("1. 정비소에 간다. 2. ‘별 일 아니겠지~’ 무시하고 간다.");
		while (true) {
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("정비소에 도착했습니다. 차량에서 결함을 발견해 정비합니다.");
				timeAndStress();
				System.out.println("‘닦고 조이고 기름칠하고’");
				timeAndStress();
				System.out.println("휴 1년 넘게 검차를 안 해봤는데 오길 잘했다.");
				fc.spendTime(20);
				timeAndStress();
				System.out.println("[스트레스 지수 0↑ , 시간 20분 소요]");
				timeAndStress();
				break;
			} else if (num == 2) {
				System.out.println("엔진 소리가 커지더니 브레이크가 말을 안 듣는다.");
				timeAndStress();
				System.out.println("(꽝!)차량이 가로수에 박았습니다.");
				timeAndStress();
				System.out.println("player " + uName + "이 기억상실 상태에 빠졌습니다.");
				fc.spendTime(120);
				fc.getStress(100);
				System.out.println("[스트레스 지수 100↑ , 시간 120분 소요]");
				timeAndStress();
				break;
			} else
				fc.infoNum();
		}
		
	}
	
}
