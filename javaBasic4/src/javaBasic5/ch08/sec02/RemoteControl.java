package javaBasic5.ch08.sec02;

//������ �߻�޼ҵ�� �����Ѵ�.
public interface RemoteControl {

	//���  = ������ �ʴ¼� , ������ �ٲ��� ���ϴ� �� 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻�޼ҵ� ���� abstract �����Ҽ��ִ�.
	void turnOn();
	void turnOff();
	void setVolum(int volum);
	
	// �ڹٰ� ������ �Ǹ鼭 �߰��� �޼ҵ��
	// ���� �޼ҵ� p.357
	 static void  StaticM() {
		System.out.println("QR�ڵ� �Է� �ޱ�");
	}
	// �����޼ҵ� p.352
	default void defalutM() {
		System.out.println("īī���� �����ޱ�");
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum+=privateM(i);
		}
		System.out.println(sum);
		
	}
	// private �޼ҵ� p.359
	// private �޼ҵ� �������̽������� ����� �� �ִ� �޼ҵ�
	private int privateM(int i) {
		return i+10;
	}
	
	// private �޼ҵ�
	
	
	
	
	
}


