package javaBasic3.ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
	// Car Ŭ���� ��üȭ
	Car myCar = new Car();

	
	
	
	System.out.println("�𵨸�:"+myCar.model); 
	System.out.println("ȸ���:"+myCar.company);
	System.out.println("����:"+myCar.color);
	System.out.println("�ְ�ӵ�:"+myCar.maxSpeed);
	System.out.println("����ӵ�:"+myCar.speed);
	System.out.println("-----------------------");
	
	// �ʵ尪 ����
	myCar.speed = 60;
	System.out.println("������ �ӵ�:"+myCar.speed);
	
	//�����ڷ� �ʵ忡 ���� �ֱ�
	Car sCar = new Car("�Ｚ�ڵ���", "SM3","���", 370,0);
	
	
	System.out.println("�𵨸�:"+sCar.model); 
	System.out.println("ȸ���:"+sCar.company);
	System.out.println("����:"+sCar.color);
	System.out.println("�ְ�ӵ�:"+sCar.maxSpeed);
	System.out.println("����ӵ�:"+sCar.speed);
	
	
	//�ʵ� ����
	sCar.speed = 100;
	System.out.println("�Ｚ �ڵ��� ������ �ӵ�"+sCar.speed);
	
	
	//getter setter�� ����ϱ�
	Car car3 = new Car();
	car3.setColor("���");
	System.out.println(car3.getColor());
	car3.setCompany("�����ڵ���");
	System.out.println(car3.getCompany());
	
	
	
	
	}

}
