package java페스티벌;

public class 자페배열 {

	public static void main(String[] args) {

		int [] [] arr = new int [5] [5];
		int num = 1;
		
		for(int j = 0; j<arr.length; j++) {
			for( int i = 0; i<5; i++) {
				arr [j][i] = num++;
			}
		}
		
		
		for(int j = 0; j<arr.length; j++) {
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int sum = 1;
		
		for(int j = 0; j<arr.length; j++) {
			for( int i = 4; i>=0; i--) {
				arr [i][j] = sum++;
			}
		}
		
		
		for(int j = 0; j<arr.length; j++) {
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
