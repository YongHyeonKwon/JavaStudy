package bus;

public class traffic extends BusSituation {

	public void situation() {
		System.out.println("[드디어 두정거장 남았다");
		fc.timeAndStress();
		System.out.println("교통체증으로 차가 가질 않는다]");
		fc.timeAndStress();

		System.out.println("[뛰어가면 15분이다");
		fc.timeAndStress();
		System.out.println("내려서 뛰어갈 것인가?]");
		System.out.println();
		while (true) {
			System.out.println("1.기사님을 믿는다 / 2. 버스에서 내려서 뛰어간다");
			int run2 = sc.nextInt();

			if (run2 == 1) {

				System.out.print(uName + ": 날도 더운데 뛰어가기 싫다. 버스 기사님을 믿고 가자");
				fc.timeAndStress();
				System.out.print("(20분 후) ");
				fc.spendTime(20);
				fc.timeAndStress();
				System.out.print("아직도 그자리다.");
				fc.spendTime(50);
				fc.timeAndStress();
				break;
			} else if (run2 == 2) {
				System.out.println(uName + ": 여기까지 와서 지각할 순 없지 나를 믿어보자!");
				fc.timeAndStress();
				System.out.println("[내가 아는 골목길을 통해 쉬지 않고 뛰었다]");
				fc.timeAndStress();
				fc.spendTime(15);
				System.out.println("[늦지않고 학원까지 무사히 도착했다]");
				break;
			} else
				fc.infoNum();
		}
	}
}
