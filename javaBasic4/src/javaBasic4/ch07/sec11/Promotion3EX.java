//package javaBasic4.ch07.sec11;
//
//public class Promotion3EX {
//
//
//	public static void main(String[] args) {
//	
//	A a = new A();
//	a.eat();
//	System.out.println("----------------");
//	A b = new B();	//�θ�Ÿ��
//	B b1 = new B(); //����Ÿ��
//	b.eat();		// ������ �ڽ��ڷ�
//	b1.eat();		
//	//�� ������ �ڽ��ڷ� �θ�Ÿ�� ������ �����ص� �ڽİ��� ���´� �߿��
//	
//	System.out.println("----------------");
//	A bb = new BB();
//	BB bb1 = new BB();
//	bb.eat();
//	bb1.eat();
//	
//	System.out.println("----------------");
//	A c = new C();
//	B c1 = new C();
//	C c2 = new C();
//	c.eat();
//	c1.eat();
//	c2.eat();
//
//	}	
//		
//}	
//		
//	class A {
//		void eat() {
//			System.out.println("��");
//		}
//	}
//
//	class B extends A {
//		@Override
//		void eat() {
//			System.out.println("������");
//		}
//	}
//	
//	class BB extends A{
//		@Override
//		void eat() {
//			System.out.println("�ܹ���");
//		}
//	}
//	
//	class C extends B {
//		@Override
//		void eat() {
//		System.out.println("����");
//		}
//	}	
//		
//		
//		
//	
//		
//		
//		
//		
//		
//
