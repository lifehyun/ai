package javaBasic5.ch08.sec03;

public class Example {

	public static void action(A a) {
		a.method1();
		if(a instanceof C) {//����: �Ű����� C�� ��ü�� ���
			//���� ����ȯ�̶� ? �θ�԰� ���� ��ٸ� �θ���� ������ Ÿ���̾��µ� 
			//�ڵ� ����ȯ�� �Ǿ �ڽ��� ������ �θ�Ÿ���� �Ǵ°�.
			C c = (C) a; // ��������ȯ
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

class C implements A{ //��������ȯŸ��

	@Override
	public void method1() {
		System.out.println("C-method1()");
	}
	
	public void method2() {
		System.out.println("C-method2()");
	}
	
}
