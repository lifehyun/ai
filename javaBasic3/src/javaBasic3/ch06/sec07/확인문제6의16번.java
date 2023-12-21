package javaBasic3.ch06.sec07;

public class 확인문제6의16번 {

	public static void main(String[] args) {
		
		
		Printer printer = new Printer();	//Printer 클래스를 객체에 생성한다.
		printer1 printer1 = new printer1();
		
		printer.println(10); 	//메소드호출 void 창조변수명.메소드
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

		printer1.println(10);	//클래스명 . static 메소드
		printer1.println(true);	// 클래스 로더 단계에서 스택메모리 메소드 영역에 자동으로 올라간다.
		printer1.println(5.7);
		Printer1.println("홍길동");
		
	
	
}
