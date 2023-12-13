package javaBasic4.ch07.sec08;

import javaBasic4.ch07.sec07.A;

public class D extends A {

	public D() {
		super();
	}
	
	public void method() {
		this.field = "value";	//다른 패키지에 있는 A클래스 부모의 필드 쓸수 있다.
		this.method();
	}
	
	
	// 직접 부모생성자를 객체화할수없다.
//	public void method() {
//	A a = new A();
//	a.field = "value";
//	a.method();
//	}
//	
}
