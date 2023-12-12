package javaBasic4.ch07.sec03;
//조상클래스
public class ComputerExample {

	
	public static void main(String[] args) {
	//부모클래스 객체생성하기
	Calculator ca1 = new Calculator();		
	System.out.println(ca1.areaCircle(10));	
	
	//자식클래스 객체생성하기
	Computer com =new Computer();
	System.out.println(com.areaCircle(10));
	
	
	}

}
