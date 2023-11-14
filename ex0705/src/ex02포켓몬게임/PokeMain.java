package ex02포켓몬게임;

import java.util.Scanner;

public class PokeMain {
    // 실행하는 환경
	public static void main(String[] args) {
		
        // 0. 입력하는 도구 생성
		Scanner sc = new Scanner(System.in);
		
		// 1. 게임에서 사용할 포켓몬 두 마리 생성
		Pokemon pairi = new Pokemon("파이리", "불", 300, 1000, "불꽃세례!!");
		Pokemon kkobuk = new Pokemon("꼬부기", "물", 350, 2000, "물대포!!");
		
		while (true) { 
		// 2. 사용자에게 포켓몬 선택지 보여주기
		System.out.print("포켓몬을 선택하세요 >> 1. 파이리 2. 꼬부기 : ");
		// 3. 포켓몬 선택 입력받기
		int select = sc.nextInt();
		
		// 4. 파이리를 선택했다면, 일반 공격 or 스킬 공격 선택지 보여주기
		if(select == 1) {
			System.out.println("1.일반 공격 or 2.스킬 공격");
			// 5. 공격 선택 입력받기 
		int atk = sc.nextInt();
		// 6. 일반공격이라면 , 파이리가 꼬부기를 공격하게 만들기
		if(atk == 1) {
			int hp = kkobuk.getHp() - pairi.getAtk();
			kkobuk.setHp(hp); 
			// --> 공격을 하면 꼬부기의 hp - 파이리의 atk만큼 까여야겠죠?
			// 7. 스킬공격이라면, 공격력이 1.5배된 상태로 파이리가 꼬부기를 공격하게 만들기
		}else if(atk ==2) {
			int hp = kkobuk.getHp() - (int)(pairi.getAtk()*1.5);
			kkobuk.setHp(hp);
		}
		}
		
		////////////////////////////////////////////////////////////////
		// 4. 꼬부기를 선택했다면, 일반 공격 or 스킬 공격 선택지 보여주기
		if(select ==2) {
			System.out.println("1.일반 공격 or 2.스킬 공격");
			// 5. 공격 선택 입력받기 
	    int atk = sc.nextInt();
	    // 6. 일반공격이라면 , 꼬부기가 파이리를 공격하게 만들기
	    if(atk == 1) {
	    	// --> 공격을 하면 파이리의 hp - 꼬부기의 atk만큼 까여야겠죠?
	    	int hp = pairi.getHp() - kkobuk.getAtk();
	    	pairi.setHp(hp);
	    }else if(atk == 2) {
	    	// 7. 스킬공격이라면, 공격력이 1.5배된 상태로 꼬부기가 파이리를 공격하게 만들기
	    	int hp = pairi.getHp() -(int) (kkobuk.getAtk()*1.5);
	    	pairi.setHp(hp);
	    }
		}
		
		if(kkobuk.getHp() <=0) {
			System.out.println("꼬부기 체력 : " + kkobuk.getHp());
			System.out.println("파이리 체력 : " + pairi.getHp());
			System.out.println("꼬부기가 사망했다.");
			break;
		}
		
		if(pairi.getHp()<=0) {
			System.out.println("파이리 체력 : " + pairi.getHp());
			System.out.println("꼬부기 체력 : " + kkobuk.getHp());
			System.out.println("파이리가 사망했다.");
			break;
		}
		
		
		// 8. 2 ~ 7까지를 한 마리의 포켓몬이 죽을 때까지 반복
		
		// 9. 마지막에 각 포켓몬의 체력 출력해주기~
		}
		
		
		
		
		
	}

}
