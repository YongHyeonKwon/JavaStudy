package ex02닌텐도게임기;

public class main {
	// 실행하는 공간, 닌텐도 게임기
	public static void main(String[] args) {

		
		
		Mario ma = new Mario();
		playGame(new Mario());
		
		Dongmul dong = new Dongmul();
		playGame(dong);

		Zelda zel = new Zelda();
		playGame(zel);
		
		
		
	}
	
	
	// 게임 실행시키기
	private static void playGame(GameChip ma) {
		ma.start();
	}
	
	// 메소드 오버로딩방식으로 문제해결 방법
	// --> 게임칩을 추가할 때마다 메소드 하나씩 다시 생성
	
//	// 게임 실행시키기
//	private static void playGame(Mario mario) {
//		
//		mario.start();
//	}
//	
//	private static void playGame(Dongmul dong) {
//		
//		dong.start();
//	}
//	
//    private static void playGame(Zelda zel) {
//		
//		zel.start();
//	}
    
 

}
