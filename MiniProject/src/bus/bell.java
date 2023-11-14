package bus;

public class bell extends BusSituation {

	public void situation() {
		// 시련6 벨 잘못누름 
		
        System.out.println("엄청난 시련들을 모두 이겨낸 나는 엄청난 행복감에 취했다.");
        fc.timeAndStress();
        System.out.println("너무 일이 잘 풀리는데?");
        fc.timeAndStress();
        System.out.println("그러던 중 창 밖을 보니 익숙한 환경이 보인다!");
        fc.timeAndStress();
        System.out.println("'도착한건가?!' 나는 설레이는 맘으로 벨을 눌렀다");
        fc.timeAndStress();
        System.out.println("그런데 이런 젠장!!! 아직 3정거장이나 남았다!");
        fc.timeAndStress();
        System.out.println("혹시나 해서 주변을 둘러보니 아무도 내리지 않을 것 같다... ");
        fc.timeAndStress();
        System.out.println("극 I인 나는 이런 상황에서 항상 내렸었다.. 어떡하지?! 내려야하나? ");
        fc.timeAndStress();
        System.out.println("1.부끄러움을 참을 수 없다! 내린다. / 2. 지각을 면하기 위해라면 이정도 부끄러움은 이겨낸다!");
        
        int down = sc.nextInt();
        while(true) {
        if(down == 1) {
           System.out.println("기사님이 문을 열어주셨지만 아무도 내리지 않았기 때문에 나는 내리는걸 선택했다..");
           fc.timeAndStress();
           System.out.println("남은 정거장은 3정거장! 뛰어가기에 충분한 거리다! 아 도전~~~");
           fc.timeAndStress();
           System.out.println("(잠시 뒤)");
           fc.timeAndStress();
           System.out.println("헉헉...! 아니 왜 이렇게 멀어. 이거 안되겠는데? 다시 버스를 기다렸다가 타야겠어! ");
           fc.timeAndStress();
           System.out.println("(뚜루루) 지영쌤에게 전화가 왔다.");
           fc.timeAndStress();
           System.out.println("지영쌤 : 지각!!!!!!!!!!!! (지각 엔딩)");
           System.out.println("GAME OVER");
           break;
        }
        
        if(down == 2) {
           System.out.println("기사님이 정류장에 멈춰 문을 열었다.");
           fc.timeAndStress();
           System.out.println("아무도 내리지 않을 것 같아서 눈을 꼭 감았다!");
           fc.timeAndStress();
           System.out.println("(정적)");
           fc.timeAndStress();
           System.out.println("어라라.. 왜 이렇게 조용하지? 나는 조금씩 눈을 떴다. ");
           fc.timeAndStress();
           System.out.println("눈을 떠보니 기사님이 짜증난다는 눈빛으로 나를 노려보고있었다!!");
           fc.timeAndStress();
           System.out.println("으아악 안돼! 죄송합니다!!! ");
           fc.timeAndStress();
           System.out.println("기사님께 큰소리로 죄송하다고 했다. 흑 눈물이 난다...");
           System.out.println("[스트레스 20↑]");
           fc.getStress(20);
           break;
        }
        }
	}
}
