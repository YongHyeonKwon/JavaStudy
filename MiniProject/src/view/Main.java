package view;

import java.util.Scanner;

import Music.MusicController;
import controller.Join;
import javazoom.jl.player.MP3Player;
import model.Function;

public class Main {

	public static void main(String[] args) {
		Function fc = new Function();
//		fc.spendTime(20);
//		fc.currentTime();
//		
//		fc.currentStress();
//		fc.getStress(-30);
//		fc.currentStress();
		int num=0;
		Scanner sc = new Scanner(System.in);
		MusicController musicC = new MusicController();
		MP3Player mp3 = new MP3Player();
		

		// 로그인

		String id = null;
		String pw = null;
		String nickname = null;

		while (true) {
			System.out.println("[1] 회원가입 [2] 로그인");
			String input = sc.next();

			if (input.equals("1")) {
				System.out.println("====== 회원가입 ======");

				System.out.print("ID 입력 : ");
				id = sc.next();
				System.out.println();
				System.out.print("PW 입력 : ");
				pw = sc.next();

				System.out.print("이름 입력 : ");
				nickname = sc.next();
				System.out.println();
				System.out.println();
				Join mc = new Join();
				int row = mc.join(id, pw, nickname);

				if (row > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패 ㅠㅠ");
				}
			} else if (input.equals("2")) {

				System.out.println("====== 로그인 ======");

				System.out.print("ID 입력 : ");
				id = sc.next();

				System.out.print("PW 입력 : ");
				pw = sc.next();

				Join mc = new Join();
				String uName = mc.login(id, pw);

				if (uName != null) {
					musicC.play(0);
					System.out.println(uName + "님 환영합니다.");
					nickname = uName;
					System.out.println("Enter키를 눌러 진행하세요.");
					fc.timeAndStress();
					break;

				} else {
					System.out.println("로그인에 실패했습니다. 다시 입력해주세요");
				}

			} else
				fc.infoNum();

		}

		// 게임 설명
		System.out.println("매일같이 스마트인재개발원에 등원하는" + nickname + "!");
		fc.timeAndStress();
		System.out.println("오늘따라 운수가 좋지 않은데...");
		fc.timeAndStress();
		System.out.println("등원길에 벌어지는 역경과 온갖 hater들의 억까를 이겨내고 시간 안에 입실하라!");
		fc.timeAndStress();
		System.out.println("**주의** 스트레스 수치가 100에 도달하면 개발자를 관두게 됩니다");
		System.out.println("스트레스 수치에 유의해주세요");
		fc.timeAndStress();
		System.out.println("현재 남은 시간은 t를 눌러서, 현재 스트레스 수치는 s를 눌러서 확인할 수 있습니다.");
		fc.timeAndStress();
		System.out.println("시스템 알림은[] 안의 내용을 참조하세요");

		fc.timeAndStress();
		System.out.println();
		
		
		// 난이도 설정하기
		System.out.println("난이도를 설정해주세요.");
		while (true) {
			
			System.out.print("1. Easy / 2. Hard (숫자만 입력해주세요) >> ");
			int level = sc.nextInt();
			if (level == 1) {
				
				System.out.println("Easy 모드로 게임을 시작합니다.");
				fc.setStress(0);
				fc.setTime(180);
				
				fc.timeAndStress();
				System.out.println("‘익숙한 우리집 천장이 보인다.’");
				fc.timeAndStress();
				System.out.println("‘늘 같은 시간에 눈을 떠서 힘들지는 않다.’");
				fc.timeAndStress();
				System.out.println("살짝 허기진 것 같기도..?");
				fc.timeAndStress();
				System.out.println("1. 아침밥은 꼭 챙겨먹어야지 2. 공복 절대 지켜..");
				int breakfast = sc.nextInt();
				
				while(true) {
				if(breakfast==1) {
					System.out.println("역시 든든하구만");
					fc.timeAndStress();
					System.out.println("[스트레스 지수 20↓ , 시간 10분 소요]");
					fc.getStress(-20);
					break;
				}
				else if(breakfast==2) {
					System.out.println("그래 오늘 일찍 학원가보자");
					fc.timeAndStress();
					fc.spendTime4();
					fc.timeAndStress();
					break;
				}
				else
					fc.infoNum();
				}
				////////식사 선택
				
				//교통수단 선택
				fc.timeAndStress();
				System.out.println("‘학원까지는 어떻게 갈까?’");
				fc.timeAndStress();
				int transport=0;
				while(true) {
				System.out.println("1. 도보 2. 자차 3. 택시 4. 버스 5. 경비행기");
				transport = sc.nextInt();
				
				System.out.println("나갈 채비를 하고 집을 나선다.");
				fc.timeAndStress();
				fc.spendTime4();
				
				//3 택시
				if(transport == 3) {
	                  // 택시 
	                  
	                  System.out.println();
	                  System.out.println("'역시 택시가 최고지~ 버스는 생각만 해도 끔찍해.'");
	                  fc.timeAndStress();
	                  System.out.println("'휴대폰을 켜서 칵가오 택시를 호출했다.'");
	                  fc.timeAndStress();
	                  System.out.println("'어라라..? 아침시간이라 택시가 잡히질 않는다...'");
	                  fc.timeAndStress();
	                  System.out.println("'줸장~!! 다른 이동 수단을 골라야겠어!'");
	                  fc.spendTime4();
	                  fc.timeAndStress();
	               }
				
				//5 경비행기
				else if(transport == 5) {
	                  // 경비행기
	                  
	                  System.out.println();
	                  System.out.println("'사실 나는 내 전용 비행기를 소유 중이였어! 나머지 이동수단은 볼 필요가 없지. 후훗'");
	                  fc.timeAndStress();
	                  System.out.println("(비행기 소리 (두두두두두))");
	                  fc.timeAndStress();
	                  System.out.println(".");
	                  fc.timeAndStress();
	                  System.out.println(".");
	                  fc.timeAndStress();
	                  System.out.println(".");
	                  fc.timeAndStress();
	                  System.out.println(".");
	                  fc.timeAndStress();
	                  System.out.println("'어라라..?'");
	                  fc.timeAndStress();
	                  System.out.println("'맞다. 난 비행기가 없다'");
	                  fc.timeAndStress();
	                  System.out.println("'모두 꿈이였던 것 같다' ");
	                  fc.timeAndStress();
	                  System.out.println("'하... 어제 봤던 탑건이 꿈에 나왔나보네.. 현실로 돌아가자'");
	                  fc.timeAndStress();
	               }
				
				
				
				// 1도보
				else if(transport == 1) {
	                  // 도보
	               System.out.println();
	               System.out.println("'그래! 걸어서 가는 것이 돈도 아끼고, 건강에도 좋고 최고야! 당장 나가자!!'");
	               fc.timeAndStress();
	               System.out.println("(밖에 나왔더니 엄청난 열기가 몸을 감쌌다.)");
	               fc.timeAndStress();
	               System.out.println("'어..어라라..? 조졌네 이거..!' (현재 밖의 날씨는 폭염이였다.)");
	               fc.timeAndStress();
	               System.out.println("'그래도 이미 나왔으니 물러설 수 없지! 가보자구~'");
	               fc.timeAndStress();
	               System.out.println("(5분 뒤)");
	               fc.timeAndStress();
	               System.out.println("(뚜벅뚜벅) '하 덥다.. 온몸이 땀으로 젖었어.'");
	               System.out.println("[스트레스 지수 20↑ , 시간 5분 소요]");
	               fc.setStress(fc.getStress()-20);
	               fc.setTime(fc.getTime()-5);
	               fc.timeAndStress();
	               System.out.println("(5분 뒤)");
	               fc.timeAndStress();
	               System.out.println("(터벅터벅) '머리가 어지러운건 기분 탓이겠지?'");
	               System.out.println("[스트레스 지수 20↑ , 시간 5분 소요]");
	               fc.setStress(fc.getStress()-20);
	               fc.setTime(fc.getTime()-5);
	               fc.timeAndStress();
	               System.out.println("(5분 뒤)");
	               fc.setTime(fc.getTime()-5);
	               fc.timeAndStress();
	               System.out.println("(또각 또각) '오! 몸이 아주 쌩쌩해졌어 역시 난 강철인간~' ");
	               fc.timeAndStress();
	               System.out.println("(10분 뒤) ");
	               fc.setTime(fc.getTime()-10);
	               fc.timeAndStress();
	               System.out.println("'어? 갑자기 내 몸이 왜이러지? 으아아아아악!!' (퍽!)");
	               fc.timeAndStress();
	               System.out.println("[스트레스 지수 100↑ , 시간 10분 소요]");
	               fc.setStress(fc.getStress()-100);
	               fc.setTime(fc.getTime()-10);
	               fc.getStress(100);
	               System.out.println("'"+nickname + "은(는) 폭염의 날씨에 걸어서 학원에 가다가 열사병으로 사망했다.' (열사병 엔딩)");
	               fc.timeAndStress();
	              
	               break;
	               }
					else 
	            	break;   
				}
				 if(fc.GameOver()) 
						break;
				
				
				
				if (transport == 2) {
					// 2자차
					// 상황1 : 동생 태워다주기
					System.out.println("(동생) : “잠깐만!!”");
					fc.timeAndStress();
					System.out.println("(동생) : “나 좀 학교 태워다 줘”");
					fc.timeAndStress();
					System.out.println("(" + nickname + ") : “방향도 다른데 버스타고 가”");
					fc.timeAndStress();
					System.out.println("(동생) : “ 버스 방금 지나갔어 오늘만 동생 한번 살려줘 이거 아니면 지각이야.”");
					fc.timeAndStress();
					System.out.println("1. 나는 착한 형. 동생을 태워다 준다. / 2. 인생은 실전이다. 나는 내 갈길 간다.");
					int pickUp = sc.nextInt();
					while (true) {
						if (pickUp == 1) {
							System.out.println("“아휴 그럼 얼른 나와.”");
							fc.timeAndStress();
							fc.spendTime(15);
							System.out.println("동생을 태워주며 15여분이 소요되었다.");
							fc.timeAndStress();
							System.out.println("[스트레스 지수 0↑ , 시간 15분 소요]");
							fc.timeAndStress();
							break;
						} else if (pickUp == 2) {
							System.out.println("그러게 미리미리 준비를 했어야지. 나도 시간 없어서 먼저 간다~");
							fc.timeAndStress();
							System.out.println("[동생과 갈등이 생겼습니다.]");
							fc.timeAndStress();
							fc.getStress(20);
							fc.spendTime(5);
							System.out.println("[스트레스 지수 20↑ , 시간 5분 소요]");
							fc.timeAndStress();
							
							break;
						} else
							fc.infoNum();
					}if(fc.GameOver())
						break;

					// 상황 2 : 교통체증
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
					}if(fc.GameOver())
						break;
				

				// 3번 도로공사
				fc.timeAndStress();
				System.out.println("(똑똑)");
				// 창문 내리는 소리
				fc.timeAndStress();
				System.out.println("인부 : 이 앞에 공사때문에 통행이 안됩니다. 이쪽 방향이시면 저기 옆에 교차로쪽으로 가시면 될거에요");
				fc.timeAndStress();
				System.out.println("1.인부가 추천한 길을 따른다 / 2. 추천 경로가 구리다. 내 감을 믿는다");
				System.out.print(":");
				int construct = sc.nextInt();
				
				while(true) {
					if (construct == 1) {
						System.out.println("[알려준 교차로 쪽으로 갔지만 그 앞도 공사중이다]");
						fc.timeAndStress();
						fc.spendTime(10);
						fc.getStress(20);
						System.out.println("[스트레스 지수 20↑ , 시간 10분 소요]");
						// 스트레스 20+ 시간 10+6888
						fc.timeAndStress();
						break;
					} else if (construct == 2) {
						System.out.println("주인공 : 역시 내 감은 틀린적이 없지 ~ ");
						// 스트레스 10-
						fc.timeAndStress();
						System.out.println("[별 문제 없이 구간을 통과했다]");
						fc.timeAndStress();
						fc.spendTime4();
						break;
					}else
						System.out.println("숫자를 정확히 입력해주세요.");
				}if(fc.GameOver())
					break;
				// 달리는 소리
				
				
				
				
				// 4번 주유소
				
				System.out.println("[잘 달리던 중 연료표시에 빨간불이 들어온다]");
				fc.timeAndStress();
				while(true) {
					System.out.println("1.주유소에 간다 / 2. 기름은 충분하다. 이정보면 학원까지 쌉가능!");
						num = sc.nextInt();
					if (num == 1) {
						// 자동차 소리
						System.out.print("[주유소에 들어갔는데 차들이 줄을 서있다]");
	
						fc.timeAndStress();
	
						System.out.println(".");
						fc.timeAndStress();
						System.out.println(".");
						fc.timeAndStress();
						System.out.println(".");
						fc.timeAndStress();
						System.out.println("[주유성공]");
						fc.timeAndStress();
						fc.spendTime(10);
						System.out.println("[스트레스 지수 0↓ , 시간 10분 소요]");
						fc.timeAndStress();
						break;
						// 시간 10+

					} else if (num == 2) {
						// 자동차 소리
						System.out.println("[도로 중간에 차가 멈췄다.]");
						fc.timeAndStress();
						// 시간 50+
						System.out.println("오늘 학원 가기는 글렀다.");
						fc.spendTime(50);
						fc.getStress(100);
						System.out.println("[스트레스 지수 100↑ , 시간 50분 소요]");
						fc.timeAndStress();
						
						//게임오버인 부분 시간을 다 소모하거나 스트레스가 100넘게 해서 끝내는 식으로
						break;
					}else
						fc.infoNum();
				}if(fc.GameOver())
					break;
//				fc.GameOver();
//				if(fc.GameOver())
//					break;
				
				
				  // 상황 5번 정비소
                System.out.println("보닛에서 연기가 난다. 학원 근처에 정비소가 하나 있는데 들렀다 가야하나?");
                fc.timeAndStress();
                System.out.println("1. 정비소에 간다. 2. ‘별 일 아니겠지~’ 무시하고 간다.");
                while(true) {
	                num = sc.nextInt();
	                if (num == 1) {
	                   System.out.println("정비소에 도착했습니다. 차량에서 결함을 발견해 정비합니다.");
	                   fc.timeAndStress();
	                   System.out.println("‘닦고 조이고 기름칠하고’");
	                   fc.timeAndStress();
	                   System.out.println("휴 1년 넘게 검차를 안 해봤는데 오길 잘했다.");
	                   fc.spendTime(20);
	                   fc.timeAndStress();
	                   System.out.println("[스트레스 지수 0↑ , 시간 20분 소요]");
	                   fc.timeAndStress();
	                   break;
	                } else if (num == 2) {
	                   System.out.println("엔진 소리가 커지더니 브레이크가 말을 안 듣는다.");
	                   fc.timeAndStress();
	                   System.out.println("(꽝!)차량이 가로수에 박았습니다.");
	                   fc.timeAndStress();
	                   System.out.println("player" + nickname + "이 기억상실 상태에 빠졌습니다.");
	                   fc.spendTime(120);
	                   fc.getStress(100);
	                   System.out.println("[스트레스 지수 100↑ , 시간 120분 소요]");
	                   fc.timeAndStress();
	                   break;
	                }else
	                	fc.infoNum();
                }if(fc.GameOver())
					break;
//                fc.GameOver();
//                if(fc.GameOver())
//					break;
                // 상황 6번 택시
                
                System.out.println("아 저 택시 너무 저돌적인데..");
                fc.timeAndStress();
                System.out.println("택시가 왼쪽 깜빡이를 켜고 끼어들려고 한다.");
                fc.timeAndStress();
                while(true) {
	                System.out.println("1. 어림도 없다. 절대 안 비켜주지 / 2. 네 얼른 지나가세요.");
	                num = sc.nextInt();
	                if (num == 1) {
	                   System.out.println("(끼이이익 ~ 쾅)");
	                   fc.timeAndStress();
	                   System.out.println("접촉사고가 발생했다... 일단 뒷목잡고 내려본다.");
	                   fc.timeAndStress();
	                   System.out.println("합의하고 보험처리 해야하는데..");
	                   fc.spendTime(60);
	                   fc.getStress(50);
	                   System.out.println("[스트레스 지수 50↑ , 시간 60분 소요]");
	                   fc.timeAndStress();
	                   
	                   break;
	                   
	                } else if (num == 2) {
	                   System.out.println("휴~ 사고 하나 막았다.");
	                   fc.timeAndStress();
	                   System.out.println("방어운전 안전 운전의 시작은 양보입니다.");
	                   fc.spendTime4();
	                   fc.timeAndStress();
	                   break;
	                }else
	                	fc.infoNum();
                }if(fc.GameOver())
					break;
//                fc.GameOver();
//                if(fc.GameOver())
//					break;
                // 상황 7번  주차
                
                System.out.println("와 오늘 아침 쉽지 않다. 주차할 데도 없네");
                fc.timeAndStress();
                while(true) {
	                System.out.println("1. 그냥 대로변에 주차한다. 2. 주차 자리를 찾아다닌다.");
	                num = sc.nextInt();
	                if (num == 1) {
	                	System.out.println("(요즘엔 카메라가 깔려 있답니다..)[주차단속에 걸렸습니다.]");
	                   fc.getStress(+40);
	                   fc.spendTime(5);
	                   fc.timeAndStress();
	                   System.out.println("[스트레스 지수 40↑ , 시간 5분 소요]");
	                   fc.timeAndStress();
	                   break;
	                } else if (num == 2) {
	                	System.out.println("주위를 빙빙 돌다가 겨우 찾아냈다.");
	                	fc.spendTime(10);
	                	fc.getStress(5);
	                	fc.timeAndStress();
	                	System.out.println("[스트레스 지수 5↑ , 시간 10분 소요]");
	                   break;
	                }else
	                	fc.infoNum();
                }if(fc.GameOver())
					break;
//                fc.GameOver();
//                if(fc.GameOver())
//					break;
				
                System.out.println("휴~ 스마트인재개발원에 무사히 도착했다.");
                fc.timeAndStress();
                System.out.println("입실했는지 한번 확인해주시구요. 짝꿍도 물어봐주세요~");
                fc.timeAndStress();
				break;
				}
				else if(transport==4) {
					//버스 탑승

					System.out.println("[버스정류장으로 가는 길 스타볶스가 보인다]");
					
					
					while(true) {
						
						System.out.println(nickname+" : 아침이라 몸도 피곤한데 이럴 때는 몸을 깨워줘야해! 카페인 충전에는 커피가 최고지!");
						System.out.println("[커피를 구입하시겠습니까?]");
						System.out.println("1. 커피 한잔 산다 2. 그냥 간다");
						System.out.print(": " );
						 num = sc.nextInt();
						
					if(num ==1) {
						System.out.println(nickname+" : 나는 커피로 하루를 시작하는 뉴요커~ 요걸 마시면 기분이 조크든요~");
						fc.timeAndStress();
											
						System.out.println("[스트레스 10 ↓ 시간 10분 소요]");
						fc.getStress(-10);
						fc.spendTime(10);
						fc.timeAndStress();
						break;
						
					}else if(num ==2) {
						
						System.out.println("아니! 난 커피 없이는 오늘 하루를 버틸 수 없을 것 같아");
						fc.timeAndStress();
						System.out.println("커피 마시러 가자(엄근진)");
						fc.timeAndStress();
						
					}else
						fc.infoNum();
					}
					//시련1//////////////////////////////////////////////////////////
					System.out.println("[커피를 사고 나니 버스가 2정거장 남아있다. 뛰어갈 것인가?]");
					System.out.println("1. 늦으면 지영쌤이 혼낸다. 어서 뛰자! / 2. 아직 여유 있으니 느긋하게 걸어간다.");
					int run = sc.nextInt();
					while(true) {
					if(run ==1) {
						System.out.println("(탁탁탁탁)");
						System.out.print("[엄청난 속도로 커피를 들고 뛰었다.");
						fc.timeAndStress();
						
						System.out.println("잠시 우사인볼트가 된 느낌에 개발자의 꿈을 접고 육상이나 시작해볼까 생각했다.]");
					
						sc.nextLine();
					System.out.println("달리고 나니 땀이나서 찝찝하다");
					System.out.print("[스트레스 10↑ 시간 4분 소요]");
					fc.getStress(10);
					fc.spendTime(4);
					break;
					}else if(run ==2) {
						System.out.println("[버스가 옆을 지나간다]");
						//버스 지나가는 소리
						
						System.out.print("[배차간격 30분인 버스를 놓쳤다]");
						fc.timeAndStress();
						System.out.print("[지각이다^^]");
						fc.getStress(100);
						System.out.println("[스트레스 100↑ 시간 30분 소요]");
						fc.timeAndStress();
						break;
					}else
						fc.infoNum();
					}
					if(fc.GameOver()) {
					break;
					}
					
				}
						

					fc.timeAndStress();
					//시련2///////////////////////////////////////////
					System.out.print("[잠시 뒤 버스가 도착했다]");
					
					fc.timeAndStress();
					
					System.out.print("버스기사 : 학생 음료 들고 버스 못타. 버리든지 마시든지 해");
					
					fc.timeAndStress();
					
					System.out.println("[버릴지 마셔버릴지 어떡할 것인가]");
					while(true) {
					System.out.println("1. 그 자리에서 마셔버린다 2. 버스를 포기한다");
					int coffee = sc.nextInt();
					if(coffee ==1) {
					System.out.println("에라 모르겠다 원샷!");
					fc.timeAndStress();
					System.out.println("[나는 1L커피를 원샷했다]");
					fc.spendTime4();
					break;
					}
					else if(coffee == 2) {
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
						}
					else
						fc.infoNum();
					}
					if(fc.GameOver())
						break;
					
//					fc.GameOver();
//					if(fc.GameOver())
//						break;
					//// 여기까지 수정했음
					fc.timeAndStress();
					//시련3///////////////////////////////////////////////
					System.out.print("[순조롭게 학원으로 등원하던 길]");
					//꼬르륵 소리
					fc.timeAndStress();
					
					System.out.println("[큰일났다 아까 차가운 음료를 원샷한게 신호가 온다]");
					fc.timeAndStress();
					System.out.print("[엄청난 고통이 찾아온다. 내려야하나?]");
					fc.timeAndStress();
					while(true) {
					System.out.println("1. 강인한 정신력으로 참는다 / 2. 못참겠다 이걸 참다간 큰일난다");
					int toilet = sc.nextInt();
					if( toilet ==1) {
						System.out.println("주인공 : 이정도 시련은 자바 테스트에 비하면 아무것도 아니다 참겠어!");
						fc.timeAndStress();
						fc.getStress(20);
						System.out.println("[스트레스 20↑ 시간 0분 소요]");
						break;
						
					}else if(toilet ==2){
					System.out.println("주인공 : 이걸 참다가 바지에 싼다면 어차피 학원에 못가");
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
					}else
						fc.infoNum();
						
					}if(fc.GameOver())
						break;
//					fc.GameOver();
//					if(fc.GameOver())
//						break;
					
					fc.timeAndStress();
					//시련4////////////////////////////////////////////
					System.out.println("[뒤에서 빨간버스가 온다.]");
					fc.timeAndStress();
					System.out.println("[이걸 타면 더 빠르다. 환승할 것인가?]");
					while(true) {
					System.out.println("1. 환승한다 / 2. 환승하지 않는다");
					int bus = sc.nextInt();
					if(bus ==1) {
						System.out.println("주인공 : 급행버스가 무조건 더 빠르다 환승하자!");
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
					
					}else if(bus ==2) {
					System.out.println("주인공 : 이 버스에 모든 것을 걸겠어. 그냥 가자");
					fc.spendTime4();
					break;
					}else
						fc.infoNum();
						
					}if(fc.GameOver())
						break;
					
					//시련 5 방귀
					// 시련 5 (방귀)
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
		               
		               while(true) {
		               if(gas == 1) {
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
		                  
		               }else if (gas == 2){
		                  System.out.println("아니야.. 이게 밖으로 나가면 안돼! 만약 밖으로 나갔다간 버스가 마비되고 말거야!!");
		                  fc.timeAndStress();
		                  System.out.println("나같은 신사가 사람들에게 원망의 눈초리를 받을순 없지. 견뎌~~~");
		                  fc.timeAndStress();
		                  System.out.println("가스를 배출하지 못한 나의 배는 엄청나게 요동쳤고 큰 고통을 견뎌야했다...");
		                  System.out.println("[스트레스 30↑ 시간 5분 소요]");
		                  fc.getStress(30);
		                  break;
		               }
		               else
		            	   fc.infoNum();
		               }if(fc.GameOver())
							break;
					
		               // 버스 시련 7, 교통체증
		               System.out.println("[드디어 두정거장 남았다");
		               fc.timeAndStress();
		               System.out.println("교통체증으로 차가 가질 않는다]");
		               fc.timeAndStress();
		               
		               
		               System.out.println("[뛰어가면 15분이다");
		               fc.timeAndStress();
		               System.out.println("내려서 뛰어갈 것인가?]");
		               System.out.println();
		               while(true) {
		               System.out.println("1.기사님을 믿는다 / 2. 버스에서 내려서 뛰어간다");
		               int run2 = sc.nextInt();
		               
		               if(run2 ==1) {
		                  
		                  System.out.print("주인공 : 날도 더운데 뛰어가기 싫다. 버스 기사님을 믿고 가자");
		                  fc.timeAndStress();
		                  System.out.print("(20분 후) ");
		                  fc.spendTime(20);
		                  fc.timeAndStress();
		                  System.out.print("아직도 그자리다.");
		                  fc.spendTime(50);
		                  fc.timeAndStress();
		                  break;
		               }else if(run2 ==2) {
		                  System.out.println("주인공 : 여기까지 와서 지각할 순 없지 나를 믿어보자!");
		                  fc.timeAndStress();
		                  System.out.println("[내가 아는 골목길을 통해 쉬지 않고 뛰었다]");
		                  fc.timeAndStress();
		                  fc.spendTime(15);
		                  System.out.println("[늦지않고 학원까지 무사히 도착했다]");
		                  break;
		               }else
		               fc.infoNum();
		               }if(fc.GameOver())
							break;
		               
		               
//					fc.GameOver();
//					if(fc.GameOver())
//						break;
					
				}
				/////////////////// easy모드
				
			 else if (level == 2) {
				System.out.println("Hard 모드로 게임을 시작합니다.");
				
				
				break;
				
				////////////////// hard 모드
			} else {
				fc.infoNum();
				
			}
			
		}///////////////난이도 설정 이후 while문
		
	}

}
