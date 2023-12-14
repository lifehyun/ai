package javaBasic4.ch07.sec14;

public class 확인문제7장 {
	
	private static void action(A a) {
	a.method1();
	if(a instanceof C) {
	  ((C) a).method2();
	  
		}
	
	} 
	
	
	public static void main(String[] args) {
	// 1 2 1 4 2 2
		
	//10번 추상클래스를 상속받았으니까 추상메소드를 재정의 해야 한다.
		
	
	MainMainActivity m = new MainMainActivity();
	m.onCreate();	
	
	
	// 11번 super
	
	action(new A());
	action(new B());
	action(new C());
	
	
	
	}

	
	

}
