package Question6;

public class MusicVO {

    private String title; // 노래제목
	
	private String singer; // 가수 이름
	
	private int playTime; // 노래 길이 초단위

	
	public MusicVO(String title, String singer, int playTime) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSinger() {
		return singer;
	}


	public void setSinger(String singer) {
		this.singer = singer;
	}


	public int getPlayTime() {
		return playTime;
	}


	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}
	

	
	
	
}
