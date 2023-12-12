package javaBasic4.ch07.sec04;
//부모클래스
public class Parent {

	public String nation;
	
	public Parent() { //출력2번 부모 
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) { //출력1번 부모의 기본생성자
		this.nation = nation;
		System.out.println("Parent(String natin) call");
	}
	
	
	
	
	
	
	
	
}
