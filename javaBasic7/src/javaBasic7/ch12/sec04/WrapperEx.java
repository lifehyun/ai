package javaBasic7.ch12.sec04;
//P524
public class WrapperEx {

	public static void main(String[] args) {
	// 자료형 기본형 byte char int long boolean, float double 참조형 String 클래수의 변수
	// 기본형은 클래스가 아니므로 미리 만들어진 메소드가 없다. 그래서 기본형 자료형을 클래스로 만들어 둔게 있다.
	// 박싱 기본형 : 객체, 언박싱 객체 :기본형
	Integer a = 10 ;
	Integer a1 = new Integer(10);
	String as = a.toString(); // toString이란 함수로 바꿔준다 int인 10을 String"10"으로 변경
	
	double da = a.doubleValue(); //.doubleValue로 실수로 바꿔라
	System.out.println(da);
	System.out.println(a.MAX_VALUE); //Integer클래스에 제일큰수를 상수로 구하라.
	System.out.println(a.MIN_VALUE); //Integer클래스로 제일작은수를 상수로 구하라.
	System.out.println(a.SIZE);
	
	//3.14 를 문자형인 "3.14"로 바꿔라
	Double b = 3.14; 
	//double형의 최대값은?
	System.out.println(b.MAX_VALUE);
	//double형의 사이즈는?
	System.out.println(b.SIZE);
	//10.1 , 5.4 최대값출력하기
	System.out.println(b.max(10.1,5.4));
	
	}

}
