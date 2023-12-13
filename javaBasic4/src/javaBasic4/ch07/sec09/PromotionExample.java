package javaBasic4.ch07.sec09;

public class PromotionExample {

	public static void main(String[] args) {

	//자료형 변수명 (=을) 힙메모리에 올려라	
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
	// A 부모는 큰타입 | 자식은 작은타임	
	// 힙메모리에 부모먼저 올라간다.
	// 자동형변환 :자식의 객체화할때 변수를 부모변수로 받는다 
		A b1 = new B();
		A c1 = new C();
		B d1 = new D();
		C e1 = new E();
		A d2 = new D();
		A e2 = new E();
		
		
//		C d3 = new D();  "A,B,D만 포함하고 있어서 C타입으로 올라가지 못한다."
		
		
	
		
		
		
		
		
	}

}
