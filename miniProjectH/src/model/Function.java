package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	private int time;//
	private int stress;
	
	
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}

	public void spendTime4() {
		
		time-=4;
		System.out.println("[스트레스 지수 0↑ , 시간 4분 소요]");
		timeAndStress();
	}
	
	
	
	public void spendTime(int t) {
		//시간 빼기
		time-=t; 
	}

	public void getStress(int t) {
			//스트레스 증감 계산
			stress+=t;
			if (stress<0)
				stress=0;
		}
	
	public void timeAndStress() {
	//현재 남은 시간 알려주기
		String t= sc.nextLine();
		if(t.equals("t")) {
			System.out.println();
			System.out.println("현재"+time+"분 남았습니다.");
			System.out.println();
			sc.nextLine();
		}
		
			if(t.equals("s")) {
				System.out.println();
				System.out.println("현재 스트레스 수치 : "+stress);
				System.out.println();
				sc.nextLine();
			}
	}
	
	public void infoNum () {
		System.out.println("정확한 숫자를 입력해주세요.");
	}
	
	public boolean GameOver() {
		BufferedReader reader;
		
		if(stress>=100||time<=0) {
		
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\smhrd\\Desktop\\자바수업\\miniproject\\GAME OVER.txt")
			);
			
			String str;
	        while ((str = reader.readLine()) != null) {
	            System.out.println(str);
	        }
		} catch (Exception e) {
			e.printStackTrace();
	}
		return true;
	}
		else
			return false;
	}
	
	
}
