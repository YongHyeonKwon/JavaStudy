package ex03뮤직플레이어;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {

	
	// Controller : 데이터의 흐름 제어
	   // (음악 재생, 다음곡 넘기기, 이전곡 넘기기, 음악정지)

	   // 1. 필드
	   private MP3Player mp3 = new MP3Player();
	   private String comPath = "C:\\Users\\SMHRD\\OneDrive\\바탕 화면\\javaStudy\\ex0706\\src\\player\\";
	   private ArrayList<MusicClass> musicList = new ArrayList<MusicClass>();
	   private int index = 0;

	   // 2. 메소드
	   // 객체를 생성하는 순간에 뮤직플레이리스트를 추가하기
	   // --> 기본 생성자 사용 --> 생성자 특징)1. 리턴타입 지정x, 2. 메소드명 == 클래스명
	   public MusicController() {
	      musicList.add(new MusicClass("Attention", "뉴진스", comPath + "Attention.mp3"));
	      musicList.add(new MusicClass("Butterfly", "전영호", comPath + "Butterfly.mp3"));
	      musicList.add(new MusicClass("LoveDive", "아이브", comPath + "Lovedive.mp3"));
	      musicList.add(new MusicClass("Nxde", "아이들", comPath + "Nxde.mp3"));
	      musicList.add(new MusicClass("RushHour", "크러쉬", comPath + "Rushhour.mp3"));
	   }

	   // 재생하기
	   public MusicClass play() {
	      stop();
	      mp3.play(musicList.get(index).getPath());

	      return musicList.get(index);
	   }

	   // 정지하기
	   // 리턴타입 x, 메소드명 stop
	   public void stop() {
	      if (mp3.isPlaying()) {
	         mp3.stop();
	      }

	   }

	   // 다음곡 재생하기
	   public MusicClass next() {

	      if (index < musicList.size() - 1) {
	         index++;
	         return play();
	      } else {
	         stop();
	         return null;
	      }
	   }

	   // 이전곡 재생하기
	   public MusicClass pre() {

	      if (index > 0) {
	         index--;
	         return play();
	      } else {
	         stop();
	         return null;
	      }
	
		}			
}
