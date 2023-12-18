package javaBasic6.ch09.sec04;

public class AnyEx1 {

	public static void main(String[] args) {

		//B라는 클라스를 사용하려면 객체화를 생성 해주어야한다
		B b = new B();
		b.bM();
		
		//B클래스의 자식클래스가 필요함. 왜냐하면 bM()재정의해서 사용하려고
		B bb = new B() { //역할클래스
						//익명 자식 클래스
						int b = 20;
						
						@Override
						void bM() {
							System.out.println("자식메소드"+ b);
						}
					};
					
		// 부모클래스를 new하고 바로 뒤에 { }를 써서 자식의 클래스의 내용을 써 주는것
		bb.bM();
				
		
		
	}

}


class B{ // 부모객체
	void bM() {
		System.out.println("부모메소드");
	}
}