package 자바페스티벌최종;

public class 보너스2번_어려움 {

	public static void main(String[] args) {

		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}

	public static String getMiddle(String word) {

		int len = word.length();

		if (len % 2 == 1)
			return Character.toString(word.charAt(len / 2));
		else
			return word.substring(len / 2 - 1, len / 2 + 1);

	}
}