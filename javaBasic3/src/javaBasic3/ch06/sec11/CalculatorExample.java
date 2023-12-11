package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {
		
	Calculator 내계산기 = new Calculator();
		
	내계산기.powerOn();
	내계산기.powerOff();		
	int 세번더하기;
	
	내계산기.plus(6, 8);
	System.out.println(내계산기.plus(6, 8));
		
	//문제 -50 , -100 더하기해라	
	int 계산결과 = 내계산기.plus(-50, -100);
	System.out.println(계산결과);
	
	//문제 100,200,300더하기
	세번더하기 = 내계산기.plus(100, 200);
	세번더하기 = 내계산기.plus(세번더하기, 300);
	System.out.println(세번더하기);
	
	
	// B사람 생각 메소드의 매개변수를 3개를 만들어 두고
	세번더하기 = 내계산기.plus(100, 200 ,300);
	System.out.println(세번더하기);
		
	/// 234 int sum(int ...values)	여러개의 변수를 넣어야할때 사용한다
	
	}

}
