package javaBasic4.ch07.sec08;

import javaBasic4.ch07.sec07.A;

public class D extends A {

	public D() {
		super();
	}
	
	public void method() {
		this.field = "value";	//�ٸ� ��Ű���� �ִ� AŬ���� �θ��� �ʵ� ���� �ִ�.
		this.method();
	}
	
	
	// ���� �θ�����ڸ� ��üȭ�Ҽ�����.
//	public void method() {
//	A a = new A();
//	a.field = "value";
//	a.method();
//	}
//	
}
