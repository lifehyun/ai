package javaBasic3.ch06.sec02;

import javaBasic3.ch06.sec03.ClassName250;

public class ����Ŭ���� {

	static  int st=10; 	//static�� �پ��ִ� ����
	int it = 100;		// ���� �ּҰ� ��� 
	
	public static void main(String[] args) {
		//m1();
		����Ŭ���� il = new ����Ŭ����();		//static�� �Ⱥپ��ִ� ������� ���޸� �ö󰣴�.
		il.m2();	//�ּҸ� ���ؼ� m2�� ����ȴ�.	
		System.out.println(st);
		System.out.println(il.it);
		m1(il);
		
		ClassName250 c =new ClassName250();
		System.out.println("=========");
		c.method();
		
	}

	
	static void m1(����Ŭ���� il) { //m1�̶�� �޼ҵ带 ����Ϸ��� main�� ȣ���ؾ��Ѵ�.
		//�ڹٰ� ����ܰ迡�� �ڵ����� ���ø޸𸮿� �÷���."static�� �־"
		System.out.println("���� �޼ҵ� �Դϴ�");
		System.out.println(st);
		System.out.println(il.it);
	}
	
	void m2() { //m2�� ȣ���ҷ��� new ��üȭ�� �ʿ��ϴ�.
		System.out.println("�ν��Ͻ� �޼ҵ��Դϴ�");
		System.out.println(st);
		//System.out.println(il.it);
	}
	
	
	
	
			
			

}






