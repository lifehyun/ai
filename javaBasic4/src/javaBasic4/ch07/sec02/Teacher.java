package javaBasic4.ch07.sec02;
//�ڽ�Ŭ����
public class Teacher extends Student {
	
	String �а�;
	
	public void teaching() {
		System.out.println("����ģ��");
	}

	public Teacher() {
		super("ȫ�浿",30,"��ǻ�Ͱ���");		//�θ�����ڰ� ȣ�� ù�⿡�� ����Ѵ�.
		System.out.println("�ڽ�Ŭ���� �� me");
	}
	public Teacher(String name, int age , String dept , String �а�) {
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.�а� = �а�;
}
	
	
	
	
	
	
}