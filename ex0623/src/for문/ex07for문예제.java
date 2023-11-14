package for문;

public class ex07for문예제 {

	public static void main(String[] args) {
		
		// (77*1)+(76*2)+(75*3)+...+(1*77) 를 계산하여
		// 결과값을 출력하세요
		int num = 1; // 1-77
		int sum = 0; // 곱셈의 결과를 누적시킬 공간
		
		for(int i = 77; i >= 1 ; i--) { // i : 77 -> 1
			sum = sum + i*num;
			num++;
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
