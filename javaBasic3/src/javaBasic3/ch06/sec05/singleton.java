package javaBasic3.ch06.sec05;

public class singleton {

	private static singleton singleton = new singleton();	//�ڱ�ӿ��� ��ü�� ������. 

	private singleton() {
		// �������̰� new�ϸ� ����Ǵµ� �տ� private�� �־
		// �ܺ�Ŭ������ new ������ ���´�.
	}
	
	public static singleton getInstance() { //��New�� ����
		return singleton; 
				
	}
	
	
	
	
	
}



