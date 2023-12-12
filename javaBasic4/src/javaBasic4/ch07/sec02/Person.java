package javaBasic4.ch07.sec02;

//부모클래스 = 슈퍼클래스 = 상위클래스
public class Person {
//멤버필드 사람에 가장 기본적인것들
	String name;
	int age;
	
	public Person() {
		System.out.println("조상 할머니 부모 클래스 입니다");
	}
	
	public void eat() {
		System.out.println("먹는다");
	}
	
	public void sleep() {
		System.out.println("잔다");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
