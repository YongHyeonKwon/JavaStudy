package car;

import java.util.Scanner;

public class oil extends CarSituation {

	public oil(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
	
		
		System.out.println("[잘 달리던 중 연료표시에 빨간불이 들어온다]");
		fc.timeAndStress();
		while (true) {
			System.out.println("1.주유소에 간다 / 2. 기름은 충분하다. 이정보면 학원까지 쌉가능!");
			int num = sc.nextInt();
			if (num == 1) {
				// 자동차 소리
				System.out.print("[주유소에 들어갔는데 차들이 줄을 서있다]");

				fc.timeAndStress();

				System.out.println(".");
				fc.timeAndStress();
				System.out.println(".");
				fc.timeAndStress();
				System.out.println(".");
				fc.timeAndStress();
				System.out.println("[주유성공]");
				fc.timeAndStress();
				fc.spendTime(10);
				System.out.println("[스트레스 지수 0↓ , 시간 10분 소요]");
				fc.timeAndStress();
				break;
				// 시간 10+

			} else if (num == 2) {
				// 자동차 소리
				System.out.println("[도로 중간에 차가 멈췄다.]");
				fc.timeAndStress();
				// 시간 50+
				System.out.println("오늘 학원 가기는 글렀다.");
				fc.spendTime(50);
				fc.getStress(100);
				System.out.println("[스트레스 지수 100↑ , 시간 50분 소요]");
				fc.timeAndStress();

				// 게임오버인 부분 시간을 다 소모하거나 스트레스가 100넘게 해서 끝내는 식으로
				break;
			} else
				fc.infoNum();
		}
	}
	
}
