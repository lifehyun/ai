package javaBasic4.ch07.sec01;
//�ڽ��ʵ�
public class SmartPhone extends Phone {//extends ��ɾ� ���:��ȯ��Ű��
	
	public boolean wifi;

	//�ƹ��͵� ���� "�⺻������"
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SmartPhone(String model,String color) {
		this.model = model;		//�θ� �ʵ�ȿ� �ִ´�
		this.color = color;
	}
		
	
		
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	
	
	public void interNet() {
		System.out.println("���ͳ� ������ �մϴ�.");
	}
	
	
	
	
	
	
	
	
}	

