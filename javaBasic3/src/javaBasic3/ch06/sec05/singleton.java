package javaBasic3.ch06.sec05;

public class singleton {

	private static singleton singleton = new singleton();	//자기속에서 객체를 생성함. 

	private singleton() {
		// 생성자이고 new하면 실행되는데 앞에 private가 있어서
		// 외부클래스에 new 진입을 막는다.
	}
	
	public static singleton getInstance() { //ㄷNew를 못함
		return singleton; 
				
	}
	
	
	
	
	
}



