package ex03뮤직플레이어;

public class MusicClass {

	// 자료형
	
	// 필드
	
	private String title; // 노래제목
	
	private String singer; // 가수
	
	private String path; // 노래 저장 경로

	
	
	// 메소드 (로직, 행위)
	
	//(1) 생성자

	public MusicClass(String title, String singer, String path) {
		this.title = title;
		this.singer = singer;
		this.path = path;
	}

	
	//  (2) getter 메소드
	
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}


	public String getPath() {
		return path;
	}


	
	
	
	
}
