package javaBasic7.ch11.sec02.exam01;


public class ExceptionEx2Ex {

	public static void main(String[] args) {

	try {
		A a = new A();
		a.a1();
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage()+"분모가 0 오류");
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e.getMessage()+"배열의 인덱스오류");
	}catch(NullPointerException e) {
		System.out.println((e.getMessage()+"널포인트 오류"));	
	
	
	}finally{
		System.out.println("DB닫기");
		System.out.println("로그오프하기");
	}

}

}

class A {
	void a1()throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException{ 
		a2();
	}
	void a2() throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException{
		a3();
		printlength("java");
		printlength(null);
	}
	
	
	private void printlength(String data) {
		int result = data.length();
		System.out.println("문자수는"+result);
	}
	
	
	
	void a3()throws ArithmeticException,ArrayIndexOutOfBoundsException{
		a4();
		double[] dArr = {1.1 , 2.2 ,  3.3};
		System.out.println(dArr[2]);//예외발생
	}
	void a4() throws ArithmeticException{
		int a = 10;
		a = a / 2; // 정상으로 변경 
		System.out.println(a);
	}
}
