package javaBasic4.ch07.sec13;

public class Iphone extends Phone {

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 켭니다");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰을 끕니다");
	}
}
