package javaBasic3.ch06.sec06;

public class 메소드 {

	static int a = 10;
	
	static void sm1() {
		//정적메소드
	}
	
	int b=10; 	//인스턴스 필드 "인스턴스 필스 값은 new가 올려준다."
	
	//생성자
	public 메소드() {
		b=20;   //인스턴스변수의 값을 초기값으로 넣을 수 있다.
//		PI=4.5;
	}
	
	static { 
		//정적 블록
		//b=200;	오류발생함.
	}
	
	
	static final double PI = 3.14; //상수 =대문자로 표기
	
	
	void m1() {
		
	}
	
	int m2() { // 값이 있는경우에는 return 을 입력해야한다.
		return 0;
	}
	
	double m3(int...values) { // 2개든 4개든 다 받고싶을때 
		return 0.0;
	}
	
	double sum(double ... values) {
		//실수의 합계를 구하는 코드
			return 0.0;
	}	
	
	double sum(int ... values) {
		return 0.0;
	}
		
	String sum(String ... values) {
		return null;
	}
	
}
