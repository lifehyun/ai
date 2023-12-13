package javaBasic4.ch07.sec07;
//부모클래스
public class Person {

	String name;
	int age;
	final static int MAX = 100;	//상수처리
	
	public final void eat() {
		System.out.println("일반 밥을 먹는다");
//		max = max - 50;
	}
	
	
	public Person() {	//기본생성자 생성
		// TODO Auto-generated constructor stub
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
