package javaBasic4.ch07.sec12;

public class CarExample {

	public static void main(String[] args) {

	Car myCar = new Car();  	// 힙메모리에 주소 생기고
	
	myCar.tire = new Tire(); 	// 힙메모리에 타이어데이터를 넣어준다 
	
	myCar.run();				//run이라는걸 출력하는데 > run이 roll이라는 변수.
	
	myCar.tire = new HankookTire();
	
	myCar.run();
	
	
	
	myCar.tire	= new KumhoTire();
	myCar.run();
	
	
	
	
	}

}
