package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM(); //Ŭ������.
		
		
		A.B ab = a.new B(); //A.B A���ִ� �ּҸ� �����ͼ� B�� ��üȭ�Ѵ�.
		ab.b = 300;
		ab.bM();
	}
	
}

// ����Ŭ������ �ۿ� Ŭ������ ����Ҽ� �ְ�, �ܺ�Ŭ������ ����Ŭ������ ����Ҽ� ����.
// ���Ŭ���������� �ڽ��� �ö󰥶� �θ� �ö�����
// ���ο� �ܺ�Ŭ���������� ���ڸ� �ö󰡴� new�� ��üȭ(�ν��Ͻ�)�� ����� �ö󰣴�. 
class A{
	
	int a = 10;
	void aM() {
		System.out.println(a);
	// b = b + 100; ����Ŭ������ ������ ����Ҽ� ����.
	// bM(); ����Ŭ������ �޼ҵ带 ����Ҽ� ����.
	}
	
	//static���� "�������"�̰� �����Ҷ� �̸� ���ø޸𸮿� �ø���. new��� ��ü������ �����ʾƵ� �ö󰣴�
	//static ������ ������־  ���޸𸮿� �ö󰣴�.
	
	static int sa = 200; 
	static void saM() {
		System.out.println(sa);
		// �ʰ� ������ ����Ǿ "new �ν��Ͻ�ȭ"�� �ϴ¾ֵ��� ������.
		// System.out.println(b); 
		// System.out.println(a);
		// aM(); 
		// bM();
	}
	
	class B{
	//���� > �޼ҵ� �ȿ� ���ض��� �����ؾ� �ϴµ� Ŭ�������ٰ� ������ �־ �ȵ�
	//	a = a + 100; 
	//	aM();		 
	//���� > �޼ҵ� �ȿ� �޼ҵ� ȣ���� �����ؾ� �ϴµ� Ŭ�������ٰ� ������ �־ �ȵ�
	int b = 20;
	void bM() {
	//����Ŭ�������� �ܺ�Ŭ���� �ʵ带 ����Ҽ� �ִ�.
	a = a + 100;
	//����Ŭ�������� �ܺ�Ŭ������ �޼ҵ带 ȣ���Ҽ� �ִ�.
	aM();	
	System.out.println(b);
	}
	

	//AŬ������ new�� �Ǳ����̴ϱ� ������ ���°�.
	//static int sb=200;	
	//static void sbM() {}
	
	}
}