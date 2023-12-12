package javaBasic4.ch07.sec04;
//자식클래스
public class Child extends Parent {

	public String name;
	
	public Child() { // 4번 자식출력
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) { //3번 자식생성자출력
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	
	
}