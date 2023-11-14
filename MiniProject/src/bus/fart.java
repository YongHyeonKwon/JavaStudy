package bus;

public class fart extends BusSituation{

	public void situation() {
		System.out.println("교통체증은 원활해졌고 내 마음에도 평화가 찾아왔다.");
		fc.timeAndStress();
		System.out.println("역시 사람은 우직하게 밀고 나가야해~");
		fc.timeAndStress();
		System.out.println("그런데 갑자기 배에 다른 신호가 왔다!!!");
		fc.timeAndStress();
		System.out.println("배 : 가스가스~");
		fc.timeAndStress();
		System.out.println("하.. 방귀가 마렵다. 이거 상당히 위험한데? ");
		fc.timeAndStress();
		System.out.println("만약 이게 밖으로 나온다면 사람들이 질식사 하고 말거야...");
		fc.timeAndStress();
		System.out.println("근데 이거 참았다간 내 배가 큰일나겠는데? 어떻게 해야하지?");
		fc.timeAndStress();
		System.out.println("어떻게 해야하지?");
		fc.timeAndStress();
		System.out.println("1.참을 수 없다! 이 자리에서 배출하겠다! / 2.아니다.. 이게 밖으로 나온다면 대참사가 일어난다!");

		int gas = sc.nextInt();

		while (true) {
			if (gas == 1) {
				System.out.println("도저히 못참겠다! 으아아아!");
				fc.timeAndStress();
				System.out.println("가스를 배출하려고 한 순간! 앞에 사람이 먼저 방귀를 뀌기 시작했다.");
				fc.timeAndStress();
				System.out.println("이건 기회야! 앞 사람의 타이밍에 맞춰 나도 함께 배출해야겠어!");
				fc.timeAndStress();
				System.out.println("완벽한 타이밍에 가스가 배출됐고 사람들은 코를 막으며 방귀를 뀐 앞사람을 쳐다봤다.");
				fc.timeAndStress();
				System.out.println("휴~ 역시 사람은 착하게 살아야해! 그러니까 이렇게 운이 좋은거지~~ 암 그렇고말고");
				fc.spendTime4();
				break;

			} else if (gas == 2) {
				System.out.println("아니야.. 이게 밖으로 나가면 안돼! 만약 밖으로 나갔다간 버스가 마비되고 말거야!!");
				fc.timeAndStress();
				System.out.println("나같은 신사가 사람들에게 원망의 눈초리를 받을순 없지. 견뎌~~~");
				fc.timeAndStress();
				System.out.println("가스를 배출하지 못한 나의 배는 엄청나게 요동쳤고 큰 고통을 견뎌야했다...");
				System.out.println("[스트레스 30↑ 시간 5분 소요]");
				fc.getStress(30);
				break;
			} else
				fc.infoNum();
		}
	}
}
