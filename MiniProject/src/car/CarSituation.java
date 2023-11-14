package car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.Join;
import model.Function;

public abstract class CarSituation{
	String id ;
	String pw ;
	int stress;
	int time;
	Function easyUser = new Function();
	Function hardUser = new Function();
	
	
	
	
	public CarSituation() {
		
	}
	
	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public CarSituation(String id, String pw, String uName) {
		super();
		this.id = id;
		this.pw = pw;
		this.uName = uName;
	}
	
	ArrayList<Function> stMemory = new ArrayList<>();
	
	public void stmemory() {
		 
		stMemory.add(new Function(getStress(), getTime()));
		}
	
	
	
	
	Function fc = new Function();
	Scanner sc = new Scanner(System.in);
	Join mc = new Join();
	String uName = mc.login(id, pw);

	
	//게임칩같은 클래스
	public void situation() {
//	ArrayList<Join> list = new ArrayList<>();
//		
//		int index = 0;
//		int stress = 0;
//		int time = 0;
//		
//		list.get(index).login(id, pw);
//		
//		for (int i = 0; i < index; i++) {
//			System.out.println(uName);
//		}
//		
//		ArrayList<Function> func = new ArrayList<>();
//		func.get(index).setStress(stress);
//		func.get(index).setTime(time);

		
	}
	
	public void infoSystem(int s, int t) {
	       if(s>=0) {
	    	   
	    	   setStress(getStress()+s);
	    	   setTime(getTime()-t);
	      System.out.println("[스트레스 지수 "+s+"↑ , 시간 "+t+"분 소요]");
	       }
	       else {
	    	   setStress(getStress()+s);
	    	   setTime(getTime()-t);
	         System.out.println("[스트레스 지수 "+s+"↓ , 시간 "+t+"분 소요]");
	       }
	   }
	
	public void timeAndStress() {
		//현재 남은 시간 알려주기
			String t= sc.nextLine();
			
			if(t.equals("t")) {
				System.out.println();
				System.out.println("현재"+getTime()+"분 남았습니다.");
				System.out.println();
				sc.nextLine();
			}
			
				if(t.equals("s")) {
					System.out.println();
					System.out.println("현재 스트레스 수치 : "+getStress());
					System.out.println();
					sc.nextLine();
				}
		}
	
	public void spendTime4() {
		
		setTime(getTime()-4);
		System.out.println("[스트레스 지수 0↑ , 시간 4분 소요]");
		timeAndStress();
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
