package javaBasic4.ch07.sec02;

//�θ�Ŭ���� = ����Ŭ���� = ����Ŭ����
public class Person {
//����ʵ� ����� ���� �⺻���ΰ͵�
	String name;
	int age;
	
	public Person() {
		System.out.println("���� �ҸӴ� �θ� Ŭ���� �Դϴ�");
	}
	
	public void eat() {
		System.out.println("�Դ´�");
	}
	
	public void sleep() {
		System.out.println("�ܴ�");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
