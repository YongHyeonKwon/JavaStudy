package 자바페스티벌최종;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 보너스5번_정렬 {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
		System.out.print(i+1+"번째 수 입력 : ");
		arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];  
			}
		}		
		int max2 = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max>arr[i] && max2<arr[i]) {
				max2 = arr[i];
			}
		}
		
		int max3 = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max2>arr[i] && max3<arr[i]) {
				max3 = arr[i];
			}
		}
		
		int max4 = 0;
		for(int i = 0; i<arr.length; i++) {
			if(max3>arr[i] && max4<arr[i]) {
				max4 = arr[i];
				}	
		
		}
		
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				}	
		}
		
		System.out.println("정렬 후");
		System.out.println(min + " " + max4 + " " + max3 + " " + max2 + " " + max);
		
		
//		Scanner sc = new Scanner(System.in);
//
//		int[] arr = new int[5];
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print(i + 1 + "번째 수 입력 : ");
//			arr[i] = sc.nextInt();
//		}
//
//		Arrays.sort(arr);
//		System.out.println("정렬 후 ");
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print(arr[i] + " ");
//		}

	}

}
