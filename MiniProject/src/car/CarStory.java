package car;

import java.lang.reflect.Array;
import java.util.Scanner;

import Controller.Join;
import model.Function;

public class CarStory {
	Scanner sc = new Scanner(System.in);
	String id ;
	String pw ;
	String uName;
	Join mc = new Join();
	
	CarSituation ct = new CarSituation() {
	};
	
	
	
	
	Function fc = new Function();
	
	
		
	
		
		
		
		// 상황1 : 동생 태워다주기
		public int[] pickUp() {
//			ct.setStress(ct.stMemory.get(0).getStress());
//			ct.setTime(ct.stMemory.get(0).getTime());
		ct.getStress();
		ct.getTime();
		
		int pickUp = sc.nextInt();
		
			int stressSum=0;
			int timeSum=0;
			if (pickUp == 1) {
				System.out.println("“아휴 그럼 얼른 나와.”");
				ct.timeAndStress();
				System.out.println("동생을 태워주며 15여분이 소요되었다.");
				
				ct.infoSystem(0, 15);
				ct.timeAndStress();
				
				
				
				stressSum+=0;
				timeSum-=15;
				
				int array[]= new int [2];
				array[0]=stressSum;
				array[1]=timeSum;
				
				
				
				return array;
			} else if (pickUp == 2) {
				System.out.println("그러게 미리미리 준비를 했어야지. 나도 시간 없어서 먼저 간다~");
				ct.timeAndStress();
				System.out.println("[동생과 갈등이 생겼습니다.]");
				ct.timeAndStress();
				ct.infoSystem(20, 5);
				ct.timeAndStress();
				
				int array[]= new int [2];
				stressSum+=20;
				timeSum-=5;
				array[0]=stressSum;
				array[1]=timeSum;
				
				return array;
			} else
				fc.infoNum();
			return null;
		
		
	}

		public int[] sumList (int s, int t) {
			int sumlist[]=new int [2];
			sumlist[0]=s;
			sumlist[1]=t;
			return sumlist;
		}





		private void Function(int stressSum, int timeSum) {
			// TODO Auto-generated method stub
			
		}
	
}
