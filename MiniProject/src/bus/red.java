package bus;

public class red extends BusSituation{

	public void situation() {
		System.out.println("[뒤에서 빨간버스가 온다.]");
		fc.timeAndStress();
		System.out.println("[이걸 타면 더 빠르다. 환승할 것인가?]");
		while (true) {
			System.out.println("1. 환승한다 / 2. 환승하지 않는다");
			int bus = sc.nextInt();
			if (bus == 1) {
				System.out.println(uName + ": 급행버스가 무조건 더 빠르다 환승하자!");
				fc.timeAndStress();

				System.out.println("[환승에 성공했다]");
				fc.timeAndStress();
				System.out.println("[아차!");
				fc.timeAndStress();
				System.out.println("이 버스는 우리집 쪽으로 돌아가는 버스였다.]");
				fc.getStress(100);
				fc.spendTime(80);
				
				System.out.println("[스트레스 100↑ 시간 80분 소요]");
				break;

			} else if (bus == 2) {
				System.out.println(uName + ": 이 버스에 모든 것을 걸겠어. 그냥 가자");
				fc.spendTime4();
				break;
			} else
				fc.infoNum();

		}
	}
}
