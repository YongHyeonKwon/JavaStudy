package Question4;

public class CameraPhone extends MobliePhone {

	public String phoneNumber;
	
	public CameraPhone() {
		
		super.call();
		super.message();
		
	}
	public void picture(){ System.out.println("사진찍기"); }
	public void music(){ System.out.println("노래듣기"); }
	
	
	
	
}
