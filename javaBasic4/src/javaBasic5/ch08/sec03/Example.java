package javaBasic5.ch08.sec03;

public class Example {

	public static void action(A a) {
		a.method1();
		if(a instanceof C) {//문제: 매개값이 C의 객체일 경우
			//강제 형변환이란 ? 부모님과 내가 산다면 부모님이 가장인 타입이었는데 
			//자동 형변환이 되어서 자식이 가장이 부모타입이 되는것.
			C c = (C) a; // 강제형변환
			System.out.println("+++");
			c.method2(); 
		}
	}
	
	public static void main (String[] args) {
		action(new B());
		action(new C());
	}
	
}


interface A {
	public void method1();

}

class B implements A{

	@Override
	public void method1() {
		System.out.println("B-method1");
	}
	
}

class C implements A{ //강제형변환타입

	@Override
	public void method1() {
		System.out.println("C-method1()");
	}
	
	public void method2() {
		System.out.println("C-method2()");
	}
	
}
