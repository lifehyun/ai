package javaBasic3.ch06.sec02;

//p247
public class calculator {

	//빌드단계(클래스 로더단계)에서 자동으로 스택영역에 올라가서 계속 있는다.
	
	static double pi = 3.141159;
	
	static int plus(int x, int y) { //정수형객체
		return x + y;
	}
	
	static int minus(int x , int y) {
		return x - y;
	}
	
	static int multply(int x , int y) {
		return x * y;
	}
	
	static int divide(int x , int y) {
		return x / y;
	}
	
	
	
}
