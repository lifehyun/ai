package javaBasic6.ch09.sec03;

//�͸�Ŭ����
public class AnyEx {

	public static void main(String[] args) {

		AA aa = new AA(); // �̸��ִ� �ڽ� Ŭ���� ��üȭ
		aa.iam();
		
		
		A aaa = new AA(); //������ �ڽ��� ��üȭ�����Ҷ� A��� �θ�Ÿ������ ������ �ִ�.
		
		//�ڽ��̸� ���� �ڽ�Ŭ���� ��üȭ�ϱ�  - �͸� �ڽİ�ü
		A a = new A() {
			@Override
			void iam() {
				System.out.println("�̸����� �ڽ�Ŭ���� ���� �θ�üȭ��{}�ְ� �ٷ� �ڽ�Ŭ���� ����");
			}
		};
		
		a.iam();
	}

}

class A{
	
	void iam() {
		System.out.println("�θ�Ŭ����");
	}
}

class AA extends A{ //���
	@Override
	void iam() {
		System.out.println("�ڽ�Ŭ���� ");
	}
}