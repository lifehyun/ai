package javaBasic.ch03.sec02;

public class 확인문제3장 {
 // 교제 107쪽
	public static void main(String[] args) {	
	//1번 
	int x = 10;
	int y = 20;
	int z = (++x) +(y--);
	System.out.println(z);
	
	//2번
	int score = 85;
	String result = (! (score>90) )? "가":"나";
	System.out.println(result);
	
	//3번
	
	int pencils = 534;
	int students = 30;
	
	//학생 한명이 가지는 연필수
	int pencilsperStudent =(pencils / students);
	System.out.println(pencilsperStudent);
	
	//남은 연필수
	int pencilsLeft = (pencils % students);
	System.out.println(pencilsLeft);
	
	//4번
	
	int value = 356;
	//3.56
	double r1 = value / 100.0;
//	System.out.println(r1); // 300
//	
//	int r2 = (int)r1; // 3
//	System.out.println(r2);
//	
//	int r3 = (int)r1; * 100;
//	System.out.println(r3); */

	System.out.println(    (int)(value/100.3)*100        );
	
	//5번 
	int lengthTop = 5;
	int lengthBottom = 10;
	int height = 7;
	double area =(double)((lengthTop+lengthBottom)*height /2);
	System.out.println(area);
	
	//6번
	int x1 = 10;
	int y1 = 5;
	
	System.out.println(( x1 > 7 && y1 <= 5) ); // 참 그리고 참
	System.out.println((x1 % 3 == 2)||(y1 %2 != 1) ); // 거짓 또는 거짓
	
	//변수 선언할때 첫글자는 영문자 소문자,
	//변수를 선언할때는 의미있는 글자로 단어로
	
	//7번
	// NaN NOT a Number 숫자가 아니다 문자 논리 값이다 
	//nan 이면 참 nan 아니면 거짓
	
	
	double x2 = 5.0;
	double y2 = 0.0;
	double z2 = 5 % y2 ;
	System.out.println(z2);
	if ( Double.isNaN(z2) ) {
		System.out.println("0.0으로 나눌 수 없습니다");
	} else {
	 double result2 = z +10;
	 System.out.println("결과: "+ result);
	};

	
	}
	
	}
	
