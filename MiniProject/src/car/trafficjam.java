package car;

public class trafficjam extends CarSituation{

	public trafficjam(String id, String pw, String uName) {
		super(id, pw, uName);
		// TODO Auto-generated constructor stub
	}

	public void situation() {
		System.out.println("-집에서 가까운 어느 대로 위-");
		fc.timeAndStress();
		System.out.println("“차가 너무 막혀서 엉금엉금 기어가고 있다.”");
		fc.timeAndStress();
		while (true) {
			System.out.println("교통체증이 심하다 1. 샛길 선택 2. 원래 가던 길 선택 3. 내비게이션 안내 따름");
			int traffic = sc.nextInt();
			if (traffic == 1) {
				System.out.println("(빵빵!!)‘더 좁은 길에 답 없이 갇혀버렸다.’");
				fc.timeAndStress();
				System.out.println("시간이 속절없이 흘러만 간다.");
				fc.timeAndStress();
				fc.getStress(30);
				fc.spendTime(10);
				System.out.println("[스트레스 지수 30↑ , 시간 10분 소요]");
				break;
				
			} else if (traffic == 2) {
				System.out.println("10분째 앞으로 가질 않는다. 점점 답답해진다.");
				fc.getStress(30);
				fc.spendTime(10);
				System.out.println("[스트레스 지수 30↑ , 시간 10분 소요]");
				fc.timeAndStress();
				break;
				
			} else if (traffic == 3) {
				System.out.println("(내비) : “실시간 교통정보를 반영하여 경로를 수정합니다.”");
				fc.timeAndStress();
				System.out.println("‘갓비게이션을 따라가니까 길이 트인다’");
				fc.spendTime4();
				break;
			}else {
				fc.infoNum();
			}
		
		}
	}
	
}
