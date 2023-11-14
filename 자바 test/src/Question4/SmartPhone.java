package Question4;

public class SmartPhone extends CameraPhone{


	public String phoneNumber;
	public String usimID;
	
	public SmartPhone() {
		
		super.call();
		super.message();
		super.picture();
		super.music();
		
	}
	
	public void kakaoTalk(){ System.out.println("카톡보내기"); }
	public void wifi(){ System.out.println("무료 인터넷접속하기"); }
	
	
	
	
	
}
