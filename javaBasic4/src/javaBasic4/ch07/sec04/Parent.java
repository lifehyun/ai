package javaBasic4.ch07.sec04;
//�θ�Ŭ����
public class Parent {

	public String nation;
	
	public Parent() { //���2�� �θ� 
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) { //���1�� �θ��� �⺻������
		this.nation = nation;
		System.out.println("Parent(String natin) call");
	}
	
	
	
	
	
	
	
	
}
