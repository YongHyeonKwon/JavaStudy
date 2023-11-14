package ex02ArrayList;

import java.util.ArrayList;

import ex01객체배열.Pokemon;

public class ArrayListMain2 {

	public static void main(String[] args) {

		// 1. 포켓몬 자료형들을 저장할 수 있는 가변적인 배열 list 생성
		ArrayList<Pokemon> list = new ArrayList<Pokemon>();
		
		// 2. list 데이터 추가하기
		// --> 뮤츠, 정신, 500, 5000, "스킬1" --> 포켓몬
//		Pokemon m = new Pokemon("뮤츠", "정신", 500, 5000, "스킬1");
//		list.add(m);
		
		list.add(new Pokemon("뮤츠", "정신", 500, 5000, "스킬1"));
		
		// 3. list에 0번째 방에 저장되어 있는 포켓몬의 이름과 타입을 출력해주세요.
		System.out.println(list.get(0).getName());
		
		
		
		
		
		
	}

}
