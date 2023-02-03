package question02;

public class Tv {

	public int channel;
	public String color;
	public void print() {
		
		System.out.printf("Tv의 현재 채널은 : %d이고, Tv색깔은 %s 입니다. %n", channel, color);
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
		
	}

}
