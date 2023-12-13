package javaBasic4.ch07.sec11;

import java.util.Scanner;

public class Promotion4Ex {

	// static�� �ִ� �ֵ��� �����ö󰣴�
	// void�� �ִ� �ֵ��� ȣ��������Ѵ�.
	public static void main(String[] args) {
		Promotion4Ex p = new Promotion4Ex();
		p.MenuDisplay();
		int choice = 0;
		while (choice != 5) {
			choice = p.MenuChoice();
			p.output(choice);
		}

	}

	public void MenuDisplay() {
		// �޴��� �޼ҵ�
		System.out.println("----------------------------------");
		System.out.println("1. �� | 2. ������ | 3. �ܹ��� | 4. ���� ");
		System.out.println("----------------------------------");

	}

	public int MenuChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �ֹ��ϼ��� >");
		int choice;
		choice = sc.nextInt();
		return choice;
	}

	public void output(int choice) {
		// �ֹ��� �޴��� ������
		if (choice == 5) {
			System.out.println("��糡 �غ�� ��ᰡ �����Ǿ����ϴ�!!");
			return;
		}

		A a = null;
		switch (choice) {
		case 1:
			a = new A();
			break;
		case 2:
			a = new B();
			break;
		case 3:
			a = new BB();
			break;
		case 4:
			a = new C();
			break;
		default:
		}

		a.eat();// ������ �޼ҵ��ε� �پ��ϰ� ������ ����: ������
		System.out.println("���ְ� �弼��");

	}

}	
	class A {
		void eat() {
			System.out.println("��");
		}
	}

	class B extends A {
		@Override
		void eat() {
			System.out.println("������");
		}
	}

	class BB extends A {
		@Override
		void eat() {
			System.out.println("�ܹ���");
		}
	}

class C extends B {
	@Override
	void eat() {
	System.out.println("����");
	}
}
