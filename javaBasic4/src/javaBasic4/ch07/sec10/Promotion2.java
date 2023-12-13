package javaBasic4.ch07.sec10;

public class Promotion2 {

	public static void main(String[] args) {
	// E라는 객체를 생성합니다
	A e2 = new E();
	B e1 = new E();
	E e = new E();
	// G라는 객체를 생성합니다
	A g = new G();
	C g1 = new G();
	G g2 = new G();
	// H라는 객체를 생성합니다
	A h = new H();
	D h1 = new H();
	H h2 = new H();
}
	
	}	
	class A{}	// 부모타입
	
	class B extends A {}
		
	class C extends A {}
		
	class D	extends A {}
	
	class E extends B {}
	
	class F extends B {}
	
	class G extends C {}
	
	class H extends D {}
	
	class I extends E {}
	
	
	


