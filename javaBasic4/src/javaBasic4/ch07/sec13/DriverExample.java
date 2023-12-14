package javaBasic4.ch07.sec13;

public class DriverExample {

	public static void main(String[] args) {
	Driver driver = new Driver();
	
	Bus bus = new Bus();
	driver.drive(bus);
	
	Taxi taxi = new Taxi();
	driver.drive(taxi);
	

	System.out.println( bus instanceof Bus);	// bus �ּҰ� ���ִ� �������� , BUS�� Ŭ���� 
	System.out.println(taxi instanceof Taxi);	// taxi��� ���������� Taxi��� ��ü�� ����(����)����
	System.out.println(bus instanceof Vehicle);	
	
		
	}

}
