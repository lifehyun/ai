package javaBasic5.ch08.sec02;

//역할을 추상메소드로 구현한다.
public interface RemoteControl {

	//상수  = 변하지 않는수 , 내용을 바꾸지 못하는 수 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드 선언 abstract 생략할수있다.
	void turnOn();
	void turnOff();
	void setVolum(int volum);
	
	// 자바가 버전업 되면서 추가된 메소드들
	// 정적 메소드 p.357
	 static void  StaticM() {
		System.out.println("QR코드 입력 받기");
	}
	// 정적메소드 p.352
	default void defalutM() {
		System.out.println("카카오톡 인증받기");
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum+=privateM(i);
		}
		System.out.println(sum);
		
	}
	// private 메소드 p.359
	// private 메소드 인터페이스에서만 사용할 수 있는 메소드
	private int privateM(int i) {
		return i+10;
	}
	
	// private 메소드
	
	
	
	
	
}


