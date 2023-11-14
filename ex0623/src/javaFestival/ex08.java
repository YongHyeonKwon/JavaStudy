package javaFestival;

public class ex08 {

	public static void main(String[] args) {

		int minusSum = 0;
		int plusSum = 0;
		
		for(int i = 1; i<=100; i++) {
			
		if(i%2==1) {
			System.out.print(i+" ");
			plusSum += i;
		}
		else if(i%2==0) {
			System.out.print((i*-1)+" ");
			minusSum += i;
			}
		}
		
		System.out.println();
		System.out.println("결과 : " + (plusSum-minusSum));
		
		
		
		
		
		
		
		
		
		
	}

}
