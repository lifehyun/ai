package javaBasic4.ch07.sec13_;
//추상메소드
public abstract class Phone {

	String owner;
	
	public Phone() {
		
	}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// {} : 내용이 없는 메소드 = 추상메소드라고 한다.
	public abstract void turnOn(); 
	public abstract void turnOff();
	
	
}
