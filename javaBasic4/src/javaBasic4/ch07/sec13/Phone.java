package javaBasic4.ch07.sec13_;
//�߻�޼ҵ�
public abstract class Phone {

	String owner;
	
	public Phone() {
		
	}
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// {} : ������ ���� �޼ҵ� = �߻�޼ҵ��� �Ѵ�.
	public abstract void turnOn(); 
	public abstract void turnOff();
	
	
}
