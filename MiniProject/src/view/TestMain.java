package view;

import java.util.Scanner;

import javax.xml.crypto.Data;


import car.CarSituation;
import car.CarStory;
import model.Function;

public class TestMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Function fc = new Function();
		CarSituation ct = new CarSituation() {
		};
		int num = 0;
		String nickname =null;
		CarStory cs= new CarStory();
//		fc.spendTime(20);
//		fc.currentTime();
//		
//		fc.currentStress();
//		fc.getStress(-30);
//		fc.currentStress();
		
//		// 로그인
//
//		String id = null;
//		String pw = null;
//		String nickname = null;
//
//		while (true) {
//			System.out.println("[1] 회원가입 [2] 로그인");
//			String input = sc.next();
//
//			if (input.equals("1")) {
//				System.out.println("====== 회원가입 ======");
//
//				System.out.print("ID 입력 : ");
//				id = sc.next();
//				System.out.println();
//				System.out.print("PW 입력 : ");
//				pw = sc.next();
//
//				System.out.print("이름 입력 : ");
//				nickname = sc.next();
//				System.out.println();
//				System.out.println();
//				Join mc = new Join();
//				int row = mc.join(id, pw, nickname);
//
//				if (row > 0) {
//					System.out.println("회원가입 성공!");
//				} else {
//					System.out.println("회원가입 실패 ㅠㅠ");
//				}
//			} else if (input.equals("2")) {
//
//				System.out.println("====== 로그인 ======");
//
//				System.out.print("ID 입력 : ");
//				id = sc.next();
//
//				System.out.print("PW 입력 : ");
//				pw = sc.next();
//
//				
//			
//				Join mc = new Join();
//				String uName = mc.login(id, pw);
//
//				if (uName != null) {
//					System.out.println(uName + "님 환영합니다.");
//					nickname = uName;
//					System.out.println("Enter키를 눌러 진행하세요.");
//					ct.timeAndStress();
//					break;
//
//				} else {
//					System.out.println("로그인에 실패했습니다. 다시 입력해주세요");
//				}
//
//			} else
//				fc.infoNum();
//
//		}

		// 게임 설명
		System.out.println("매일같이 스마트인재개발원에 등원하는" + nickname + "!");
		ct.timeAndStress();
		System.out.println("오늘따라 운수가 좋지 않은데...");
		ct.timeAndStress();
		System.out.println("등원길에 벌어지는 역경과 온갖 hater들의 억까를 이겨내고 시간 안에 입실하라!");
		ct.timeAndStress();
		System.out.println("**주의** 스트레스 수치가 100에 도달하면 개발자를 관두게 됩니다");
		System.out.println("스트레스 수치에 유의해주세요");
		ct.timeAndStress();
		System.out.println("현재 남은 시간은 t를 눌러서, 현재 스트레스 수치는 s를 눌러서 확인할 수 있습니다.");
		ct.timeAndStress();
		System.out.println("시스템 알림은[] 안의 내용을 참조하세요");

		ct.timeAndStress();
		System.out.println();
		
		int stlist [] = new int [2];
		
		int stressDegree=0;
		int restTime=180;
		// 난이도 설정하기
		System.out.println("난이도를 설정해주세요.");
		while (true) {

			System.out.print("1. Easy / 2. Hard (숫자만 입력해주세요) >> ");
			int level = sc.nextInt();
			if (level == 1) {ct.setStress(0);
			ct.setTime(180);
				
				System.out.println("Easy 모드로 게임을 시작합니다.");
				
				

				ct.timeAndStress();
				System.out.println("‘익숙한 우리집 천장이 보인다.’");
				ct.timeAndStress();
				System.out.println("‘늘 같은 시간에 눈을 떠서 힘들지는 않다.’");
				ct.timeAndStress();
				System.out.println("살짝 허기진 것 같기도..?");
				ct.timeAndStress();
				System.out.println("1. 아침밥은 꼭 챙겨먹어야지 2. 공복 절대 지켜..");
				int breakfast = sc.nextInt();
				
				while (true) {
					if (breakfast == 1) {
						System.out.println("역시 든든하구만");
						ct.timeAndStress();
						ct.infoSystem(-20, 10);
						break;
					} else if (breakfast == 2) {
						System.out.println("그래 오늘 일찍 학원가보자");
						ct.timeAndStress();
						ct.spendTime4();
						ct.timeAndStress();
						break;
					} else
						fc.infoNum();
				}
				//////// 식사 선택
			}else if (level == 2) {
				System.out.println("Hard 모드로 게임을 시작합니다.");

				
				break;

				////////////////// hard 모드
			} else {
				fc.infoNum();

			}
				// 교통수단 선택
				ct.timeAndStress();
				System.out.println("‘학원까지는 어떻게 갈까?’");
				ct.timeAndStress();
				int transport = 0;
				while (true) {
					System.out.println("1. 도보 2. 자차 3. 택시 4. 버스 5. 경비행기");
					transport = sc.nextInt();

					System.out.println("나갈 채비를 하고 집을 나선다.");
					ct.timeAndStress();
					ct.spendTime4();
					System.out.println(ct.getTime());
					
					

					// 3 택시
					if (transport == 3) {
						// 택시

						System.out.println();
						System.out.println("'역시 택시가 최고지~ 버스는 생각만 해도 끔찍해.'");
						ct.timeAndStress();
						System.out.println("'휴대폰을 켜서 칵가오 택시를 호출했다.'");
						ct.timeAndStress();
						System.out.println("'어라라..? 아침시간이라 택시가 잡히질 않는다...'");
						ct.timeAndStress();
						System.out.println("'줸장~!! 다른 이동 수단을 골라야겠어!'");
						ct.spendTime4();
						ct.timeAndStress();
					}

					// 5 경비행기
					else if (transport == 5) {
						// 경비행기

						System.out.println();
						System.out.println("'사실 나는 내 전용 비행기를 소유 중이였어! 나머지 이동수단은 볼 필요가 없지. 후훗'");
						ct.timeAndStress();
						System.out.println("(비행기 소리 (두두두두두))");
						ct.timeAndStress();
						System.out.println(".");
						ct.timeAndStress();
						System.out.println(".");
						ct.timeAndStress();
						System.out.println(".");
						ct.timeAndStress();
						System.out.println(".");
						ct.timeAndStress();
						System.out.println("'어라라..?'");
						ct.timeAndStress();
						System.out.println("'맞다. 난 비행기가 없다'");
						ct.timeAndStress();
						System.out.println("'모두 꿈이였던 것 같다' ");
						ct.timeAndStress();
						System.out.println("'하... 어제 봤던 탑건이 꿈에 나왔나보네.. 현실로 돌아가자'");
						ct.timeAndStress();
					}

					// 1도보
					else if (transport == 1) {
						// 도보
						System.out.println();
						System.out.println("'그래! 걸어서 가는 것이 돈도 아끼고, 건강에도 좋고 최고야! 당장 나가자!!'");
						ct.timeAndStress();
						System.out.println("(밖에 나왔더니 엄청난 열기가 몸을 감쌌다.)");
						ct.timeAndStress();
						System.out.println("'어..어라라..? 조졌네 이거..!' (현재 밖의 날씨는 폭염이였다.)");
						ct.timeAndStress();
						System.out.println("'그래도 이미 나왔으니 물러설 수 없지! 가보자구~'");
						ct.timeAndStress();
						System.out.println("(5분 뒤)");
						ct.timeAndStress();
						System.out.println("(뚜벅뚜벅) '하 덥다.. 온몸이 땀으로 젖었어.'");
						System.out.println("[스트레스 지수 20↑ , 시간 5분 소요]");
						fc.setStress(fc.getStress() - 20);
						fc.setTime(fc.getTime() - 5);
						ct.timeAndStress();
						System.out.println("(5분 뒤)");
						ct.timeAndStress();
						System.out.println("(터벅터벅) '머리가 어지러운건 기분 탓이겠지?'");
						System.out.println("[스트레스 지수 20↑ , 시간 5분 소요]");
						fc.setStress(fc.getStress() - 20);
						fc.setTime(fc.getTime() - 5);
						ct.timeAndStress();
						System.out.println("(5분 뒤)");
						fc.setTime(fc.getTime() - 5);
						ct.timeAndStress();
						System.out.println("(또각 또각) '오! 몸이 아주 쌩쌩해졌어 역시 난 강철인간~' ");
						ct.timeAndStress();
						System.out.println("(10분 뒤) ");
						fc.setTime(fc.getTime() - 10);
						ct.timeAndStress();
						System.out.println("'어? 갑자기 내 몸이 왜이러지? 으아아아아악!!' (퍽!)");
						ct.timeAndStress();
						System.out.println("[스트레스 지수 100↑ , 시간 10분 소요]");
						fc.setStress(fc.getStress() - 100);
						fc.setTime(fc.getTime() - 10);
						fc.getStress(100);
						System.out.println("'" + nickname + "은(는) 폭염의 날씨에 걸어서 학원에 가다가 열사병으로 사망했다.' (열사병 엔딩)");
						ct.timeAndStress();

						break;
					} else
						break;
				}
//				if (ct.GameOver())
//					break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				if (transport == 2) {
					// 2자차
					// 상황1 : 동생 태워다주기
					System.out.println("(동생) : “잠깐만!!”");
					ct.timeAndStress();
					System.out.println("(동생) : “나 좀 학교 태워다 줘”");
					ct.timeAndStress();
					System.out.println("(" + nickname + ") : “방향도 다른데 버스타고 가”");
					ct.timeAndStress();
					System.out.println("(동생) : “ 버스 방금 지나갔어 오늘만 동생 한번 살려줘 이거 아니면 지각이야.”");
					ct.timeAndStress();
					stressDegree=ct.getStress();
					restTime=ct.getTime();
					System.out.println("1. 나는 착한 형. 동생을 태워다 준다. / 2. 인생은 실전이다. 나는 내 갈길 간다.");
					stlist= cs.sumList(stressDegree, restTime);
					System.out.println(stlist[0]);
					System.out.println(stlist[1]);
					
					
					int[] list = cs.pickUp();
					
					
					System.out.println(list[0]);
					System.out.println(list[1]);
					
					System.out.println(stlist[0]);
					System.out.println(stlist[1]);
					System.out.println(stlist[0]+list[0]);
					System.out.println(stlist[1]+list[1]);
					stlist[0]+=list[0];
					
					if (ct.GameOver())
						break;
	}
		}
		
		
}
	
	
//	public static void timeAndStress() {
//		//현재 남은 시간 알려주기
//			String t= sc.nextLine();
//			
//			if(t.equals("t")) {
//				System.out.println();
//				System.out.println("현재"++"분 남았습니다.");
//				System.out.println();
//				sc.nextLine();
//			}
//			
//				if(t.equals("s")) {
//					System.out.println();
//					System.out.println("현재 스트레스 수치 : "+getStress());
//					System.out.println();
//					sc.nextLine();
//				}
//		}
}
