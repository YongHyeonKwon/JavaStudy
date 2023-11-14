package 자페prac;

public class prac04 {

	public static void main(String[] args) {

		int [] [] arr = new int [5][5];
		int num = 1;
		
		for(int j = 0; j<5; j++) {
		for(int i = 4; i>=0; i--) {
			arr[j][i] = num++;
		}
		System.out.println();
		}
		
		
		for(int j = 0; j<5; j++) {
		for(int i = 0; i<5; i++) {
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
		}
		
	}

}
