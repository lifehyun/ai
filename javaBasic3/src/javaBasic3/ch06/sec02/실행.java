package javaBasic3.ch06.sec02;

public class 실행 {
	//힙메모리 올라가는 순서  1.static블록> 2.{} > 3.생성자 블록

	static{//처음으로 올라가는 블록임
		
		System.out.println("정적 블록임");
	}
	
	{//두번째로 올라가는 블록임
		System.out.println("인스턴스 블록 부분임");	
	
	}
	
	public 실행() {
	//생성자 세번째로 올라가는 블록임
		System.out.println("생성자");
		
	}
	
}
