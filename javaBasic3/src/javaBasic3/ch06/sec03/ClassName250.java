package javaBasic3.ch06.sec03;
//P250
public class ClassName250 {
	
	//��� const �Ϲ������� �빮�ڸ� ����Ѵ�.
	static final int A = 100;	//A��°��� ���������� ���°� 100�̴�
	static final double PI = 3.141592;
	static final double RATE = 0.025;
	
	//���� = ���ϴ� ��
	int a = 10;
	
	
	
	
	//static�� �̸��ö󰣴�. 
	//�ν��Ͻ� �����
	int field;
	public void method() {	
		a =a+100;
		System.out.println(A + 20);
	//	A = 1000; �������� ����̱� ������ �ٲ��� ����.
		
	};
	
	
	//���� �����(Ŭ���������)
	static int field2;
	static void method2() {
		
	};
	
	static { //����Ҽ��ִ��� 
//		field = 10 ;  //�޸𸮿� �ö� ������ �ٸ��⶧���� ����Ҽ� ����.
//		method(); 	  // ����
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