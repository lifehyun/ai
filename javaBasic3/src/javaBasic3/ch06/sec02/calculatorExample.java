package javaBasic3.ch06.sec02;

public class calculatorExample {

	public static void main(String[] args) {
		double result1 =  10 * 10 * calculator.pi; //.p
		int result2 = calculator.plus(10, 5);	//메소드 호출 : x가 10을 받고 y가 5를 받는다
		int result3 = calculator.minus(10, 5);
		int result4 = calculator.multply(10, 5);
		double result5 = calculator.divide(10, 5);
		
		
	
		System.out.println(result1);
		System.out.println(result2);//더하기
		System.out.println(result3);//빼기
		System.out.println(result4); //곱하기
		System.out.println(result5); //나누기
		
		
		
	}

}
