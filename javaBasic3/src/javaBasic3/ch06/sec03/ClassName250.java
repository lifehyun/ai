package javaBasic3.ch06.sec03;
//P250
public class ClassName250 {
	
	//상수 const 일반적으로 대문자를 사용한다.
	static final int A = 100;	//A라는곳에 마지막으로 들어가는건 100이다
	static final double PI = 3.141592;
	static final double RATE = 0.025;
	
	//변수 = 변하는 수
	int a = 10;
	
	
	
	
	//static은 미리올라간다. 
	//인스턴스 멤버들
	int field;
	public void method() {	
		a =a+100;
		System.out.println(A + 20);
	//	A = 1000; 에러난다 상수이기 때문에 바꾸지 못함.
		
	};
	
	
	//정적 멤버들(클래스멤버들)
	static int field2;
	static void method2() {
		
	};
	
	static { //사용할수있는지 
//		field = 10 ;  //메모리에 올라간 시점이 다르기때문에 사용할수 없다.
//		method(); 	  // 동일
		field2 = 20;
		method2();
	}
	
	static void method3() {
		
//		field = 10 ; 
//		method();
		field2 = 20;
		method2();
	
	}
	
	{
			field = 10 ; 
			method();
			field2 = 20;
			method2();
			
	}
	
	void method4() { 
		 field = 10 ; 
		 method();
		 field2 = 20;
		 method2();
	
		
	}
	
	
	
}