package javaBasic4.ch07.sec04;
//�ڽ�Ŭ����
public class Child extends Parent {

	public String name;
	
	public Child() { // 4�� �ڽ����
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) { //3�� �ڽĻ��������
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	
	
}