package javaBasic3.ch06.sec06;

public class �޼ҵ� {

	static int a = 10;
	
	static void sm1() {
		//�����޼ҵ�
	}
	
	int b=10; 	//�ν��Ͻ� �ʵ� "�ν��Ͻ� �ʽ� ���� new�� �÷��ش�."
	
	//������
	public �޼ҵ�() {
		b=20;   //�ν��Ͻ������� ���� �ʱⰪ���� ���� �� �ִ�.
//		PI=4.5;
	}
	
	static { 
		//���� ���
		//b=200;	�����߻���.
	}
	
	
	static final double PI = 3.14; //��� =�빮�ڷ� ǥ��
	
	
	void m1() {
		
	}
	
	int m2() { // ���� �ִ°�쿡�� return �� �Է��ؾ��Ѵ�.
		return 0;
	}
	
	double m3(int...values) { // 2���� 4���� �� �ް������ 
		return 0.0;
	}
	
	double sum(double ... values) {
		//�Ǽ��� �հ踦 ���ϴ� �ڵ�
			return 0.0;
	}	
	
	double sum(int ... values) {
		return 0.0;
	}
		
	String sum(String ... values) {
		return null;
	}
	
}
