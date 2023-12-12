package javaBasic4.ch07.sec01;
//자식필드
public class SmartPhone extends Phone {//extends 명령어 사용:변환시키다
	
	public boolean wifi;

	//아무것도 없는 "기본생성자"
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SmartPhone(String model,String color) {
		this.model = model;		//부모 필드안에 넣는다
		this.color = color;
	}
		
	
		
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	
	public void interNet() {
		System.out.println("인터넷 연결을 합니다.");
	}
	
	
	
	
	
	
	
	
}	

