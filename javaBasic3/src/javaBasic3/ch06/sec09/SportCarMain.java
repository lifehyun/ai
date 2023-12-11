package javaBasic3.ch06.sec09;

public class SportCarMain {

	public static void main(String[] args) {
	
	//new SportCar생성자로 입력시 힙메모리에 스포츠카라는 주소가 생김
	// 힙메모리에 출력값은 자동으로 값을 초기화해준다. 
	
	SportCar sportCar = new SportCar();			
	sportCar.aPrinter();
	
	// 스택메모리 출력값은 자동으로 초기화가 되지않는다.
	// int b; 
	//	System.out.println(b); 에러나옴.

	}

}
