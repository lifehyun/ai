package javaBasic3.ch06.sec06;

public class 생성자연습 {

	String name;
	int score;
	
	public 생성자연습(String string) { //s1,s4 문자열 "홍길동,이순신" 들어간거
		// TODO Auto-generated constructor stub
	}

	
	public 생성자연습() { //아무것도 안들어간거 s2
		this(5,false);	//다른생성자 호출시 사용 , 단 "첫줄"에서만 사용가능 
		
	}


	public 생성자연습(int i, boolean b) { //s3
		// TODO Auto-generated constructor stub
	}


	public 생성자연습(boolean b, int i) { //s5
		// TODO Auto-generated constructor stub
	}

	
	
	//생성자가 1개도 없으면 자바 컴파일러가 "생성자연습()" 자동으로 1개 만듦
	//생성자가 1라도 있으면 자동으로 안만든다.
	
	
	
	
	
	
	
	}

