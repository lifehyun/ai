package javaBasic6.ch09.sec04;

public class Any2Ex {

	public static void main(String[] args) {
	CImpl ci = new CImpl();
	ci.cM();	
	
	C ci2 = new CImpl(); //������
	ci2.cM();
	
	//�͸�����ü
	//�������̽��� new�� �Ҽ�����. �׷��� 
	//�͸�����ü�̴� :new ��ü() {������ ���� } ;
	C ci3 = new C() {

						@Override
						public void cM() {//�������̽����� new��ü����
						System.out.println("�͸���Ŭ������ �޼ҵ�");
						}
						
					};	
	
	ci3.cM();	
	}

}


interface C{ 
	abstract void cM();  //�߻�޼ҵ�
	
}

class CImpl implements C{ //�����޼ҵ�

	@Override
	public void cM() { 
		System.out.println("����Ŭ���� (�ڽ�) �޼ҵ�");
	}
	
}