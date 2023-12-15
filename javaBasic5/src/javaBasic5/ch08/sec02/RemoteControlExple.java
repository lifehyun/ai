package javaBasic5.ch08.sec02;

public class RemoteControlExple {

	public static void main(String[] args) {

		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolum(5);
		rc.turnOff();
		
		rc = new SmartPhone();		
		
		rc.turnOn();
		rc.setVolum(5);
		rc.turnOff();
		
		rc.defalutM();
		RemoteControl.StaticM();
		
		
		
	}

}
