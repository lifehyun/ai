package javaBasic6.ch09.sec07.exam02;

public class Home {

	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turtOff() {
			System.out.println("Tv를 켭니다.");
		}
		
		@Override
		public void turnOn() {
			System.out.println("Tv를 끕니다.");
		}
	};
	
	//메소드(로컬 변수 이용)
	
	public void use1() { // 호출명령
		rc.turnOn();
		rc.turtOff();
	}
	
	public void use2() { 
		//로컬변수에 익명 구현 객체 대입.
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turtOff() {
				System.out.println("에어컨을 켭니다.");
			}
			
			@Override
			public void turnOn() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turtOff();
		
	}
	//메소드(매개변수이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turtOff();
	}
	
	
}
