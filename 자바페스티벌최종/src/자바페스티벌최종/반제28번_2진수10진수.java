package 자바페스티벌최종;

public class 반제28번_2진수10진수 {

	public static void main(String[] args) {

		String str = "01001101";
		// 01001101(2) =77(10)
		System.out.print(str + "(2) = ");

		// 문자열을 하나씩 끊어서 배열형태로 돌려주는 메서드
		// 매개변수-> 어떤 기준으로 문자열을 나눠줄건지
		String[] arr = str.split("");

		int multi = 1;
		int result = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			// Integer.parseInt(String)-->문자열을 숫자로 형 변환
			result += Integer.parseInt(arr[i]) * multi;
			multi *= 2;
		}
		System.out.print(result + "(10)");

	}

}
