package javaBasic4.ch07.sec01;
//p.284 �θ�Ŭ���� 
public class SmartPhoneExample {

	public static void main(String[] args) {
		
	//���� �ø��ϴ�
	Phone p = new Phone();
	p.bell();
	
	//�ڱ�� �����
	p.sendVoice("�� ���!");
	//���� ����� �ʵ� �����	
	p.receiveVoice("����� �ʵ� �����?");	
		
	SmartPhone sp = new SmartPhone();		
	sp.sendVoice("���� ���Ұž�?");
	sp.receiveVoice("������ ���� �Ұž�");
	sp.hangUp(" ");	
	
	
	SmartPhone sp2 =new SmartPhone("������","���");
	System.out.println(sp.model);	
	sp.setWifi(false);	
	if(sp2.wifi){
		System.out.println("�������̰� �˴ϴ�");
	}else {
		System.out.println("�������̰� �ȵ˴ϴ�");
	}
	
	if(sp2.wifi) {
		System.out.println(sp2.model+"�������̰� �˴ϴ�.");
	}else{
		System.out.println(sp2.color+"�ڵ����� �������̰� �ȵ˴ϴ�.");
	}
	
	//�������� ����̰� ���� �︳�ϴ�
	System.out.println(sp2.model +"��"+sp2.color+"�̰�");
	sp2.bell();
	
	//�������� �޼����� �Խ��ϴ� "�ڱ�: �ڵ��� ���?"
	System.out.println(sp2.model+"�� �޼����� �Խ��ϴ�");
	sp.sendVoice("�ڵ��� ���?");
	
	
	//�θ�Ŭ�������� �ڽ��� wifi �ʵ�,�޼ҵ� ����ϱ� 
	//�θ�Ŭ������ �ڽ��ʵ�� ������� ���Ѵ�.
	//�ڽ�Ŭ������ �θ� ����Ҽ��ִ�.
//	p.wifi = true;  
//	p.setwifi(true);
//	p.internet();
	
	
	

}
	
	
}