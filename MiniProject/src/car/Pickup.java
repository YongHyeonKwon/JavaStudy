package car;

import java.util.Scanner;

import Controller.Join;
import model.Function;

public class Pickup {
	Scanner sc = new Scanner(System.in);
	String id ;
	String pw ;
	String uName;
	Join mc = new Join();
	
	CarSituation ct = new CarSituation() {
	};
	
	
	
	
	Function fc = new Function();
	public Pickup() {
		
	}

	
	
	public void situation() {
		
		
		
		// 상황1 : 동생 태워다주기
		System.out.println("(동생) : “잠깐만!!”");
		ct.timeAndStress();
		System.out.println("(동생) : “나 좀 학교 태워다 줘”");
		ct.timeAndStress();
		System.out.println("(" + uName + ") : “방향도 다른데 버스타고 가”");
		ct.timeAndStress();
		System.out.println("(동생) : “ 버스 방금 지나갔어 오늘만 동생 한번 살려줘 이거 아니면 지각이야.”");
		ct.timeAndStress();
		System.out.println("1. 나는 착한 형. 동생을 태워다 준다. / 2. 인생은 실전이다. 나는 내 갈길 간다.");
		int pickUp = sc.nextInt();
		while (true) {
			if (pickUp == 1) {
				System.out.println("“아휴 그럼 얼른 나와.”");
				ct.timeAndStress();
				System.out.println("동생을 태워주며 15여분이 소요되었다.");
				
				ct.infoSystem(0, 15);
				ct.timeAndStress();
				break;
			} else if (pickUp == 2) {
				System.out.println("그러게 미리미리 준비를 했어야지. 나도 시간 없어서 먼저 간다~");
				ct.timeAndStress();
				System.out.println("[동생과 갈등이 생겼습니다.]");
				ct.timeAndStress();
				ct.infoSystem(20, 5);
				ct.timeAndStress();
				break;
			} else
				fc.infoNum();}
		
		
		
	}
	
}
