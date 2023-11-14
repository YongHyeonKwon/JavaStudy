package Music;

import java.util.ArrayList;

import Music.MusicClass;
import javazoom.jl.player.MP3Player;

public class MusicController {

	
	// Controller : 데이터의 흐름 제어
	   // (음악 재생, 다음곡 넘기기, 이전곡 넘기기, 음악정지)

	   // 1. 필드
	   private MP3Player mp3 = new MP3Player();
	   private String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\MiniProject\\src\\player\\";
	   private ArrayList<MusicClass> musicList = new ArrayList<MusicClass>();
	   private int index = 0;

	   // 2. 메소드
	   // 객체를 생성하는 순간에 뮤직플레이리스트를 추가하기
	   // --> 기본 생성자 사용 --> 생성자 특징)1. 리턴타입 지정x, 2. 메소드명 == 클래스명
	
	
	   public MusicController() {
		   musicList.add(new MusicClass(comPath+"gta경성.mp3")); // 0
		   musicList.add(new MusicClass(comPath+"걷는소리.mp3")); // 1
		   musicList.add(new MusicClass(comPath+"공사장소음.mp3")); // 2
		   musicList.add(new MusicClass(comPath+"급브레이크.mp3")); // 3
		   musicList.add(new MusicClass(comPath+"깜빡이.mp3")); // 4
		   musicList.add(new MusicClass(comPath+"뛰는소리.mp3")); // 5
		   musicList.add(new MusicClass(comPath+"버스멈추는소리.mp3")); // 6
		   musicList.add(new MusicClass(comPath+"비행기소리.mp3")); // 7
		   musicList.add(new MusicClass(comPath+"빵빵소리.mp3")); // 8
		   musicList.add(new MusicClass(comPath+"성공브금.mp3")); // 9
		   musicList.add(new MusicClass(comPath+"실패브금.mp3")); // 10
		   musicList.add(new MusicClass(comPath+"자동차시동소리.mp3")); // 11
		   musicList.add(new MusicClass(comPath+"쿵효과음.mp3")); // 12
	   }
	   
	   // 재생하기
	   public MusicClass play(int a) {
	      stop();
	      mp3.play(musicList.get(a).getPath());

	      return musicList.get(a);
	   }

	   // 정지하기
	   // 리턴타입 x, 메소드명 stop
	   public void stop() {
	      if (mp3.isPlaying()) {
	         mp3.stop();
	      }

	   }


}
