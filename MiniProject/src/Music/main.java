package Music;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javazoom.jl.player.MP3Player;



public class main {
public static void main(String[] args) {
	
MusicController musicC = new MusicController();
	
	// 노래들의 공통경로

			// jar(클래스파일들의 집합) 추가하는 방법
			// 프로젝트 선택 --> 마우스 우클릭 --> build path
			// --> configure build path --> 탭중에 libraries
			// --> class path 옵션 선택 --> add jars

			// 1. MP3Player 사용해보기!!!!!!!
			// --> 다른 사람이 만든 자료형(클래스)
			MP3Player mp3 = new MP3Player();
			
			
			musicC.play(10);
			
			
				BufferedReader reader;
				
				
				try {
					reader = new BufferedReader(
							new FileReader("C:\\Users\\smhrd\\Desktop\\괴짜.txt")
					);
					
					String str;
			        while ((str = reader.readLine()) != null) {
			            System.out.println(str);
			        }
				} catch (Exception e) {
					e.printStackTrace();
					
			}
				
			
}
}
