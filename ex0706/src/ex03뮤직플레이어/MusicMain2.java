package ex03뮤직플레이어;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain2 {

	public static void main(String[] args) {
		
		  // 유지보수 쉽게 코드 리팩토링

		      Scanner sc = new Scanner(System.in);
		      MusicController con = new MusicController();

		      while (true) {
		         System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");
		         int input = sc.nextInt();
		         if (input == 1) {
		            // 노래재생
		            MusicClass m = con.play();
		            // (2) 노래에 대한 정보를 출력
		            System.out.println("===== 재생중인 노래 =====");
		            System.out.print("노래 제목 \t 가수");
		            System.out.println(m.getTitle() + "\t");
		            System.out.println(m.getSinger());

		         } else if (input == 2) {
		            // 다음곡
		            MusicClass m = con.next();
		            if (m != null) {
		               // (2) musicList 두번째 방에 있는 노래 정보 출력
		               System.out.println("===== 재생중인 노래 =====");
		               System.out.print("노래 제목 \t 가수");
		               System.out.println(m.getTitle() + "\t");
		               System.out.println(m.getSinger());
		            } else {
		               System.out.println("다음 곡이 없습니다.");

		            }

		         } else if (input == 3) {
		            // 이전곡
		            MusicClass m = con.pre();

		            if (m != null) {
		               System.out.println("===== 재생중인 노래 =====");
		               System.out.print("노래 제목 \t 가수");
		               System.out.println(m.getTitle() + "\t");
		               System.out.println(m.getSinger());
		            } else {
		               System.out.println("이전곡이 없습니다.");
		            }
		         
		         } else if (input == 4) {
		            con.stop();
		            System.out.println("노래를 정지합니다.");

		         } else if (input == 5) {
		            con.stop();
		            System.out.println("프로그램을 종료합니다.");
		            break;
		         }

		      }

}
}
