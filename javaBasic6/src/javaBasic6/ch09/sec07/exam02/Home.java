package javaBasic6.ch09.sec07.exam02;

public class Home {

	// �ʵ忡 �͸� ���� ��ü ����
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turtOff() {
			System.out.println("Tv�� �մϴ�.");
		}
		
		@Override
		public void turnOn() {
			System.out.println("Tv�� ���ϴ�.");
		}
	};
	
	//�޼ҵ�(���� ���� �̿�)
	
	public void use1() { // ȣ����
		rc.turnOn();
		rc.turtOff();
	}
	
	public void use2() { 
		//���ú����� �͸� ���� ��ü ����.
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turtOff() {
				System.out.println("�������� �մϴ�.");
			}
			
			@Override
			public void turnOn() {
				System.out.println("�������� ���ϴ�.");
			}
		};
		rc.turnOn();
		rc.turtOff();
		
	}
	//�޼ҵ�(�Ű������̿�)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turtOff();
	}
	
	
}
