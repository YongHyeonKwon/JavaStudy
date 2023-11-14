package ex02포켓몬게임;

import java.util.Scanner;

public class pokemonTeacher {

	public static void main(String[] args) {

		 // 0. 입력하는 도구 생성
		Scanner sc = new Scanner(System.in);
		
		// 1. 게임에서 사용할 포켓몬 두 마리 생성
		Pokemon pairi = new Pokemon("파이리", "불", 300, 1000, "불꽃세례!!");
		Pokemon kkobuk = new Pokemon("꼬부기", "물", 350, 2000, "물대포!!");
		
		do { 
		// 2. 사용자에게 포켓몬 선택지 보여주기
		System.out.print("포켓몬을 선택하세요 >> 1. 파이리 2. 꼬부기 ");
		// 3. 포켓몬 선택 입력받기
		int input = sc.nextInt();
		if(input == 1) {
			// 3. 파이리를 선택했다면 
			System.out.print("공격을 선택하세요. >> 1. 일반공격 2. 스킬공격 ");
			int input2 = sc.nextInt();
			if(input2== 1) {
				// 4. 일반공격 선택
				// 꼬부기hp = 꼬부기hp - 파이리atk
			int hp = kkobuk.getHp() - pairi.getAtk();
			kkobuk.setHp(hp);
			System.out.println(pairi.getName() + "가 공격을 한다~!");
		}else {
			// 5. 스킬공격 선택
			// 꼬부기hp = 꼬부기hp - 파이리atk *1.5
			kkobuk.setHp((int) (kkobuk.getHp() - pairi.getAtk()*1.5));
			System.out.println(pairi.getName() + "가 "+pairi.getSkill()+"사용한다.");
		}
		}else {
			System.out.print("공격을 선택하세요. >> 1. 일반공격 2. 스킬공격 ");
			int input2 = sc.nextInt();
			if(input2== 1) {
			int hp = pairi.getHp() - kkobuk.getAtk();
			pairi.setHp(hp);
			System.out.println(kkobuk.getName() + "가 공격을 한다~!");
		}else {
			pairi.setHp((int) (pairi.getHp() - kkobuk.getAtk()*1.5));
			System.out.println(kkobuk.getName() + "가 "+kkobuk.getSkill()+"사용한다.");
		}
		}
		
		
		
		
		}while(kkobuk.getHp()>0 && (pairi.getHp()>0));
		
		System.out.println("꼬부기 체력 : " + kkobuk.getHp());
		System.out.println("파이리 체력 : " + pairi.getHp());
		
		}

}
