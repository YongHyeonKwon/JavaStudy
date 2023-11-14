package bus;

public class drink extends BusSituation {

	public void situation() {
		System.out.print("[잠시 뒤 버스가 도착했다]");

		fc.timeAndStress();

		System.out.print("버스기사 : 학생 음료 들고 버스 못타. 버리든지 마시든지 해");

		fc.timeAndStress();
		sc.nextLine();
		System.out.println("[버릴지 마셔버릴지 어떡할 것인가]");
		while (true) {
			System.out.println("1. 그 자리에서 마셔버린다 2. 버스를 포기한다");
			int coffee = sc.nextInt();
			if (coffee == 1) {
				System.out.println("에라 모르겠다 원샷!");
				fc.timeAndStress();
				System.out.println("[나는 1L커피를 원샷했다]");
				fc.spendTime4();
				break;
			} else if (coffee == 2) {
				System.out.println("버스보다 커피가 먼저다 ! 절대 포기 못해!");
				fc.timeAndStress();
				System.out.println("[배차간격 30분인 버스를 놓쳤다]");
				fc.timeAndStress();
				System.out.print("[지각이다^^]");
				fc.getStress(100);
				fc.spendTime(30);
				fc.timeAndStress();
				System.out.println("[스트레스 100↑ 시간 30분 소요]");
				break;
			} else
				fc.infoNum();
		}
	}
}
