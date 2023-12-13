package javaBasic4.ch07.sec11;

import java.util.Scanner;

public class Promotion4Ex {

	// static에 있는 애들은 먼저올라간다
	// void에 있는 애들은 호출해줘야한다.
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
		// 메뉴판 메소드
		System.out.println("----------------------------------");
		System.out.println("1. 밥 | 2. 떡볶이 | 3. 햄버거 | 4. 피자 ");
		System.out.println("----------------------------------");

	}

	public int MenuChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요 >");
		int choice;
		choice = sc.nextInt();
		return choice;
	}

	public void output(int choice) {
		// 주문한 메뉴로 나가기
		if (choice == 5) {
			System.out.println("장사끝 준비된 재료가 소진되었습니다!!");
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

		a.eat();// 동일한 메소드인데 다양하게 나오는 성질: 다형성
		System.out.println("맛있게 드세요");

	}

}	
	class A {
		void eat() {
			System.out.println("밥");
		}
	}

	class B extends A {
		@Override
		void eat() {
			System.out.println("떡볶이");
		}
	}

	class BB extends A {
		@Override
		void eat() {
			System.out.println("햄버거");
		}
	}

class C extends B {
	@Override
	void eat() {
	System.out.println("피자");
	}
}
