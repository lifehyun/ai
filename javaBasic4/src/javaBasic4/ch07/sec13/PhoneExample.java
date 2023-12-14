package javaBasic4.ch07.sec13;

public class PhoneExample {

	private static Phone iphone;

	public static void main(String[] args) {

	Play play = new Play();
	
	SmartPhone s = new SmartPhone();
	play.playing(s);
	play.stop(s);
	
	Iphone ipone = new Iphone();
	play.playing(iphone);
	play.stop(iphone);
		
		
	}

}
