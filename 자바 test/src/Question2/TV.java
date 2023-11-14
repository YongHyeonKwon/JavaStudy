package Question2;

public class TV {

	int channel ;
	
	String color;
	
	
	public void print() {
		System.out.print("Tv의 현재 채널은 : " + channel + "이고, ");
		System.out.print("Tv의 색깔은 " + color + " 입니다.");
		System.out.println();
		
	}
	
	public int channelUp() {
		
		return (channel += 1);
	}
	
    public int channelDown() {
		
		return (channel -= 1);
	}
	
	
}
