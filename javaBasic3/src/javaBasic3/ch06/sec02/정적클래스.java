package javaBasic3.ch06.sec02;

import javaBasic3.ch06.sec03.ClassName250;

public class 정적클래스 {

	static  int st=10; 	//static이 붙어있는 변수
	int it = 100;		// 아직 주소가 없어서 
	
	public static void main(String[] args) {
		//m1();
		정적클래스 il = new 정적클래스();		//static이 안붙어있는 멤버들이 힘메모리 올라간다.
		il.m2();	//주소를 통해서 m2로 들어가면된다.	
		System.out.println(st);
		System.out.println(il.it);
		m1(il);
		
		ClassName250 c =new ClassName250();
		System.out.println("=========");
		c.method();
		
	}

	
	static void m1(정적클래스 il) { //m1이라는 메소드를 사용하려면 main에 호출해야한다.
		//자바가 빌드단계에서 자동으로 스택메모리에 올려둠."static이 있어서"
		System.out.println("정적 메소드 입니다");
		System.out.println(st);
		System.out.println(il.it);
	}
	
	void m2() { //m2를 호출할려면 new 객체화가 필요하다.
		System.out.println("인스턴스 메소드입니다");
		System.out.println(st);
		//System.out.println(il.it);
	}
	
	
	
	
			
			

}






