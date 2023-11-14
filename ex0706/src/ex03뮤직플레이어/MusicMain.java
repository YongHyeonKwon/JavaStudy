package ex03뮤직플레이어;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		// 노래들의 공통경로
		String comPath = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\ex0706\\src\\player\\";

		// jar(클래스파일들의 집합) 추가하는 방법
		// 프로젝트 선택 --> 마우스 우클릭 --> build path
		// --> configure build path --> 탭중에 libraries
		// --> class path 옵션 선택 --> add jars

		// 1. MP3Player 사용해보기!!!!!!!
		// --> 다른 사람이 만든 자료형(클래스)
		MP3Player mp3 = new MP3Player();

		// 2. Music 자료형을 저장할 수 있는 가변배열 musicList
		ArrayList<MusicClass> musicList = new ArrayList<MusicClass>();

		musicList.add(new MusicClass("Attention", "뉴진스", comPath + "Attention.mp3"));
		musicList.add(new MusicClass("Butterfly", "전영호", comPath + "Butterfly.mp3"));
		musicList.add(new MusicClass("LoveDive", "아이브", comPath + "Lovedive.mp3"));
		musicList.add(new MusicClass("Nxde", "아이들", comPath + "Nxde.mp3"));
		musicList.add(new MusicClass("RushHour", "크러쉬", comPath + "Rushhour.mp3"));
		musicList.add(new MusicClass("gta경성","gtd",comPath+"gta경성.mp3"));

		Scanner sc = new Scanner(System.in);

		// 현재 재생 중인 노래 인덱스 번호

		int index = 0;

		while (true) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) {
				// 노래재생
				// (0) 현재 재생 중이라면 한 번 멈추기
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				// 노래재생
				// (1) musicList의 첫 번째 노래 재생
				mp3.play(musicList.get(index).getPath());
				// (2) 노래에 대한 정보를 출력
				System.out.println("♬♬♬♬재생중인 노래♬♬♬♬");
				System.out.println("노래 제목 \t 가수");
				System.out.print(musicList.get(index).getTitle() + " \t ");
				System.out.println(musicList.get(index).getSinger());

			} else if (select == 2) {
				// 다음곡
				// 다음곡이 있었을 경우에만 index 1증가시키고 노래를 재생
				if (index < musicList.size() - 1) {
					index++;

					// (0) 노래가 재생 중이라면 재생 중인 노래 멈추기
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					// (1) musicList 두 번째 방에 있는 노래 재생
					mp3.play(musicList.get(index).getPath());

					// (2) misicList 두 번째 방에 있는 노래 정보 출력
					System.out.println("♬♬♬♬재생중인 노래♬♬♬♬");
					System.out.println("노래 제목 \t 가수");
					System.out.print(musicList.get(index).getTitle() + " \t ");
					System.out.println(musicList.get(index).getSinger());
				} else {
					System.out.println("다음곡이 없습니다.");
					if (mp3.isPlaying()) {
						mp3.stop();
					}
				}

			} else if (select == 3) {
				// 이전곡
				if (index > 0) {
					index--;
					if (mp3.isPlaying()) {
						mp3.stop();
					}
					mp3.play(musicList.get(index).getPath());
					System.out.println("♬♬♬♬재생중인 노래♬♬♬♬");
					System.out.println("노래 제목 \t 가수");
					System.out.print(musicList.get(index).getTitle() + " \t ");
					System.out.println(musicList.get(index).getSinger());

				} else {
					System.out.println("이전곡이 없습니다.");
					if (mp3.isPlaying()) {
						mp3.stop();
					}
				}

			} else if (select == 4) {
				// 정지
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				System.out.println("노래를 정지합니다.");
			} else if (select == 5) {
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}

	}

}
