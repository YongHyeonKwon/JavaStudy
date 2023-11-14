package bus;

public class star extends BusSituation{

	public void situation() {
		System.out.println("[버스정류장으로 가는 길 스타볶스가 보인다]");

		while (true) {

			System.out.println(uName + " : 아침이라 몸도 피곤한데 이럴 때는 몸을 깨워줘야해! 카페인 충전에는 커피가 최고지!");
			System.out.println("[커피를 구입하시겠습니까?]");
			System.out.println("1. 커피 한잔 산다 2. 그냥 간다");
			System.out.print(": ");
			int num = sc.nextInt();

			if (num == 1) {
				System.out.println(uName + " : 나는 커피로 하루를 시작하는 뉴요커~ 요걸 마시면 기분이 조크든요~");
				fc.timeAndStress();

				System.out.println("[스트레스 10 ↓ 시간 10분 소요]");
				fc.getStress(-10);
				fc.spendTime(10);
				fc.timeAndStress();
				break;

			} else if (num == 2) {

				System.out.println("아니! 난 커피 없이는 오늘 하루를 버틸 수 없을 것 같아");
				fc.timeAndStress();
				System.out.println("커피 마시러 가자(엄근진)");
				fc.timeAndStress();
				break;
			} else
				fc.infoNum();
		}
	}
}
