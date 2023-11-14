package ex01객체배열;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class main {

	public static void main(String[] args) {

		// 1. 객체 배열 
		// 배열이란?
		// --> 동일한 자료형을 하나로 묶어서 관리해주는 자료구조
		// 배열선언방법
		// 자료형[] 변수명 = new 자료형[크기];
		// 포켓몬 데이터를 3개 저장할 수 있는 bag 배열 생성
		
		Pokemon[] bag = new Pokemon[3];
	
		System.out.println(bag[0]);
		
		// 포켓몬 자료형 pika를 생성해주세요.
		// 피카츄, 전기, 5000, 500, 백만볼트
		
//		Pokemon pika = new Pokemon("피카츄", "전기", 500, 5000, "백만볼트");
//		bag[0] = pika;
		
		bag[0] = new Pokemon("피카츄", "전기", 500, 5000, "백만볼트");
		
		System.out.println(bag[0].getSkill());
		
		// bag --> 배열의 이름을 불러줌
		// [0] --> 배열의 0번 인덱스에 접근하겠다.
		// ------> 여기까지 하면 결과 자료형은 Pokemon형태
		// . --> Pokemon객체 안으로 접근하겠다.
		// getskill () --> skill 필드값을 가져오겠다.
		
		// 배열 
		// --> 동일한 자료형만 저장할 수 있다.
		// --> 크기가 고정적이다.
		
		// ******객체배열에서는 --> 참조의 참조 개념
		// ******참조할 때마다 접근하는 방식
		// ------> 배열에 값에 접근 []
		// ------> 객체 안에 있는 데이터 접근 .
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
