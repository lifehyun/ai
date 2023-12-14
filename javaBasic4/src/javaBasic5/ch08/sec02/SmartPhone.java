package javaBasic5.ch08.sec02;

public class SmartPhone implements RemoteControl {

	private int volume;


	@Override
	public void turnOn() {
		System.out.println("핸드폰을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("핸드폰을 끕니다");
		defalutM();
	}
	

	@Override
	public void setVolum(int volum) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {	
			this.volume = volume;
		}
		System.out.println("현재 Smartphon 볼륨은: "+ volume);
			
		}
		
	}


