package javaBasic6.ch09.sec04;

public class Any2Ex {

	public static void main(String[] args) {
	CImpl ci = new CImpl();
	ci.cM();	
	
	C ci2 = new CImpl(); //다형성
	ci2.cM();
	
	//익명구현객체
	//인터페이스는 new를 할수없다. 그래서 
	//익명구현객체이다 :new 객체() {내용이 들어갈시 } ;
	C ci3 = new C() {

						@Override
						public void cM() {//인터페이스에서 new객체생성
						System.out.println("익명구현클래스의 메소드");
						}
						
					};	
	
	ci3.cM();	
	}

}


interface C{ 
	abstract void cM();  //추상메소드
	
}

class CImpl implements C{ //구현메소드

	@Override
	public void cM() { 
		System.out.println("구현클래스 (자식) 메소드");
	}
	
}