package javaBasic6.ch09.sec04;

public class AnyEx1 {

	public static void main(String[] args) {

		//B��� Ŭ�󽺸� ����Ϸ��� ��üȭ�� ���� ���־���Ѵ�
		B b = new B();
		b.bM();
		
		//BŬ������ �ڽ�Ŭ������ �ʿ���. �ֳ��ϸ� bM()�������ؼ� ����Ϸ���
		B bb = new B() { //����Ŭ����
						//�͸� �ڽ� Ŭ����
						int b = 20;
						
						@Override
						void bM() {
							System.out.println("�ڽĸ޼ҵ�"+ b);
						}
					};
					
		// �θ�Ŭ������ new�ϰ� �ٷ� �ڿ� { }�� �Ἥ �ڽ��� Ŭ������ ������ �� �ִ°�
		bb.bM();
				
		
		
	}

}


class B{ // �θ�ü
	void bM() {
		System.out.println("�θ�޼ҵ�");
	}
}