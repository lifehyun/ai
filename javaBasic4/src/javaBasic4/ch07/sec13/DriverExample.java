package javaBasic4.ch07.sec13;

public class DriverExample {

	public static void main(String[] args) {
	Driver driver = new Driver();
	
	Bus bus = new Bus();
	driver.drive(bus);
	
	Taxi taxi = new Taxi();
	driver.drive(taxi);
	

	System.out.println( bus instanceof Bus);	// bus 주소가 들어가있는 참조변수 , BUS는 클래스 
	System.out.println(taxi instanceof Taxi);	// taxi라는 참조변수에 Taxi라는 객체를 참조(연결)가능
	System.out.println(bus instanceof Vehicle);	
	
		
	}

}
