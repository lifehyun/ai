package javaBasic5.ch08.sec02;

public class Television implements RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

	@Override
	public void setVolum(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {	
			this.volume = volume;
		}
		System.out.println("���� Audio ����: "+ volume);
		
	}
	
	

	
	
}
