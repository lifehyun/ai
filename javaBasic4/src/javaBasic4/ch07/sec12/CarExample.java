package javaBasic4.ch07.sec12;

public class CarExample {

	public static void main(String[] args) {

	Car myCar = new Car();  	// ���޸𸮿� �ּ� �����
	
	myCar.tire = new Tire(); 	// ���޸𸮿� Ÿ�̾���͸� �־��ش� 
	
	myCar.run();				//run�̶�°� ����ϴµ� > run�� roll�̶�� ����.
	
	myCar.tire = new HankookTire();
	
	myCar.run();
	
	
	
	myCar.tire	= new KumhoTire();
	myCar.run();
	
	
	
	
	}

}
