package bus;

public class run extends BusSituation {

	public void situation() {
		
		System.out.println("[커피를 사고 나니 버스가 2정거장 남아있다. 뛰어갈 것인가?]");
		System.out.println("1. 늦으면 지영쌤이 혼낸다. 어서 뛰자! / 2. 아직 여유 있으니 느긋하게 걸어간다.");
		int run = sc.nextInt();
		while (true) {
			if (run == 1) {
				System.out.println("(탁탁탁탁)");
				System.out.print("[엄청난 속도로 커피를 들고 뛰었다.");
				fc.timeAndStress();

				System.out.println("잠시 우사인볼트가 된 느낌에 개발자의 꿈을 접고 육상이나 시작해볼까 생각했다.]");
				fc.timeAndStress();
				sc.nextLine();
				System.out.println("달리고 나니 땀이나서 찝찝하다");
				fc.timeAndStress();
				System.out.print("[스트레스 10↑ 시간 4분 소요]");
				fc.getStress(10);
				fc.spendTime(4);
				fc.timeAndStress();
				break;
			} else if (run == 2) {
				System.out.println("[버스가 옆을 지나간다]");
				// 버스 지나가는 소리

				System.out.print("[배차간격 30분인 버스를 놓쳤다]");
				fc.timeAndStress();
				System.out.print("[지각이다^^]");
				fc.getStress(100);
				System.out.println("[스트레스 100↑ 시간 30분 소요]");
				fc.timeAndStress();
				break;
			} else
				fc.infoNum();
		}
	}
}
