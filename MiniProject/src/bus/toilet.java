package bus;

public class toilet extends BusSituation {

	public void situation() {
		System.out.print("[순조롭게 학원으로 등원하던 길]");
		// 꼬르륵 소리
		fc.timeAndStress();

		System.out.println("[큰일났다 아까 차가운 음료를 원샷한게 신호가 온다]");
		fc.timeAndStress();
		System.out.print("[엄청난 고통이 찾아온다. 내려야하나?]");
		fc.timeAndStress();
		while (true) {
			System.out.println("1. 강인한 정신력으로 참는다 / 2. 못참겠다 이걸 참다간 큰일난다");
			int toilet = sc.nextInt();
			if (toilet == 1) {
				System.out.println(uName + ": 이정도 시련은 자바 테스트에 비하면 아무것도 아니다 참겠어!");
				fc.timeAndStress();
				fc.getStress(20);
				System.out.println("[스트레스 20↑ 시간 0분 소요]");
				break;

			} else if (toilet == 2) {
				System.out.println(uName + ": 이걸 참다가 바지에 싼다면 어차피 학원에 못가");
				fc.timeAndStress();
				System.out.println("[버스에서 내려 화장실을 다녀왔다]");
				System.out.print("[그런데 잠깐.");
				fc.timeAndStress();
				System.out.println("버스 배차가 30분이다]");
				System.out.print("[지각이다^^]");
				fc.getStress(60);
				fc.spendTime(50);
				System.out.println("[스트레스 60↑ 시간 50분 소요]");
				fc.timeAndStress();
				break;
			} else
				fc.infoNum();

		}
	}
}
