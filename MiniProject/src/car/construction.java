package car;

public class construction extends CarSituation {

	
	public construction(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
		fc.timeAndStress();
		System.out.println("(똑똑)");
		// 창문 내리는 소리
		fc.timeAndStress();
		System.out.println("인부 : 이 앞에 공사때문에 통행이 안됩니다. 이쪽 방향이시면 저기 옆에 교차로쪽으로 가시면 될거에요");
		fc.timeAndStress();
		System.out.println("1.인부가 추천한 길을 따른다 / 2. 추천 경로가 구리다. 내 감을 믿는다");
		System.out.print(":");
		int construct = sc.nextInt();

		while (true) {
			if (construct == 1) {
				System.out.println("[알려준 교차로 쪽으로 갔지만 그 앞도 공사중이다]");
				fc.timeAndStress();
				fc.spendTime(10);
				fc.getStress(20);
				System.out.println("[스트레스 지수 20↑ , 시간 10분 소요]");
				// 스트레스 20+ 시간 10+6888
				fc.timeAndStress();
				break;
			} else if (construct == 2) {
				System.out.println("주인공 : 역시 내 감은 틀린적이 없지 ~ ");
				// 스트레스 10-
				fc.timeAndStress();
				System.out.println("[별 문제 없이 구간을 통과했다]");
				fc.timeAndStress();
				fc.spendTime4();
				break;
			} else
				System.out.println("숫자를 정확히 입력해주세요.");
		}
	}
}
