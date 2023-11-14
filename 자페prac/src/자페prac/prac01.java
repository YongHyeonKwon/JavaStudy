package 자페prac;

public class prac01 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		String[] score2 = score.split(",");
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		
		for(int i = 0; i<score2.length; i++) {
		if(score2[i].equals("A")) {
			a++;
		}else if (score2[i].equals("B")) {
			b++;
		}else if (score2[i].equals("C")) {
			c++;
		}else if (score2[i].equals("D")) {
			d++;
		}else if (score2[i].equals("F")) {
			f++;
		}
		}
		
		System.out.println("A : "+ a + "명");
		System.out.println("B : "+ b + "명");
		System.out.println("C : "+ c + "명");
		System.out.println("D : "+ d + "명");
		System.out.println("F : "+ f + "명");
		
		
	}

}
