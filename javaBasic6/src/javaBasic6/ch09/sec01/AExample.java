package javaBasic6.ch09.sec01;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		a.aM();
		A.sa = 2000;
		A.saM(); //클래스명.
		
		
		A.B ab = a.new B(); //A.B A에있는 주소를 가져와서 B를 객체화한다.
		ab.b = 300;
		ab.bM();
	}
	
}

// 내부클래스는 밖에 클래스를 사용할수 있고, 외부클래스는 내부클래스를 사용할수 없다.
// 상속클래스에서는 자식이 올라갈때 부모도 올라가지만
// 내부와 외부클래스에서는 각자만 올라가니 new로 객체화(인스턴스)를 해줘야 올라간다. 
class A{
	
	int a = 10;
	void aM() {
		System.out.println(a);
	// b = b + 100; 내부클래스의 변수를 사용할수 없다.
	// bM(); 내부클래스의 메소드를 사용할수 없다.
	}
	
	//static변수 "정적멤버"이고 변역할때 미리 스택메모리에 올린다. new라는 객체생성을 하지않아도 올라간다
	//static 변수가 선언되있어서  힙메모리에 올라간다.
	
	static int sa = 200; 
	static void saM() {
		System.out.println(sa);
		// 늦게 변수가 선언되어서 "new 인스턴스화"를 하는애들은 못쓴다.
		// System.out.println(b); 
		// System.out.println(a);
		// aM(); 
		// bM();
	}
	
	class B{
	//에러 > 메소드 안에 더해라라고 명령해야 하는데 클래스에다가 명령을 주어서 안됨
	//	a = a + 100; 
	//	aM();		 
	//에러 > 메소드 안에 메소드 호출라고 명령해야 하는데 클래스에다가 명령을 주어서 안됨
	int b = 20;
	void bM() {
	//내부클래스에서 외부클래스 필드를 사용할수 있다.
	a = a + 100;
	//내부클래스에서 외부클래스의 메소드를 호출할수 있다.
	aM();	
	System.out.println(b);
	}
	

	//A클래스가 new가 되기전이니까 에러가 나는것.
	//static int sb=200;	
	//static void sbM() {}
	
	}
}