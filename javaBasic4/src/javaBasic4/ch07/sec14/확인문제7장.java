package javaBasic4.ch07.sec14;

public class Ȯ�ι���7�� {
	
	private static void action(A a) {
	a.method1();
	if(a instanceof C) {
	  ((C) a).method2();
	  
		}
	
	} 
	
	
	public static void main(String[] args) {
	// 1 2 1 4 2 2
		
	//10�� �߻�Ŭ������ ��ӹ޾����ϱ� �߻�޼ҵ带 ������ �ؾ� �Ѵ�.
		
	
	MainMainActivity m = new MainMainActivity();
	m.onCreate();	
	
	
	// 11�� super
	
	action(new A());
	action(new B());
	action(new C());
	
	
	
	}

	
	

}
