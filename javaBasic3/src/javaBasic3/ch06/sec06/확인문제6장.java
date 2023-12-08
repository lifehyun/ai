package javaBasic3.ch06.sec06;

public class 확인문제6장 {

	public static void main(String[] args) {
	//3 4 4 3 1 4 2 2  2 4 3 
	생성자연습 s1 = new 생성자연습("홍길동"); //객체화
	생성자연습 s2 = new 생성자연습();	
	생성자연습 s3 = new 생성자연습(100,true);
	생성자연습 s4 = new 생성자연습("이순신");
	생성자연습 s5 = new 생성자연습(true,100);
	
	메소드 m1 = new 메소드();
	m1.m3(1,2);
	m1.m3(1,2,3,4);
	
	메소드.a = 100;
	메소드.sm1();
	
	System.out.println(메소드.PI);
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class 확인{
		public 확인() {
			
		}
	}
	
	
	
}
