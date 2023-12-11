package javaBasic3.ch06.sec11;

public class ComputerMain {
	
	double avg;
	
	
	
	public static void main(String[] args) {
	Computer 컴퓨터= new Computer();{
	
	컴퓨터.plus(1,2,3);	
	int 계산결과값 = 컴퓨터.plus(1,2,3);
	System.out.println(계산결과값);
	
	컴퓨터.plus(1,2,3,4,5);	
	계산결과값 = 컴퓨터.plus(1,2,3,4,5);
	System.out.println(계산결과값);
	
	컴퓨터.plus(1,2,3,4,5,6,7,8,9);	
	System.out.println(계산결과값);
	

	컴퓨터.평균값(100, 500);
	System.out.println("두개의평균값:"+컴퓨터.평균값(100, 500));
	// 가변길이 매개변수를 이용한 평균값
	System.out.println("여러개평균값:"+컴퓨터.평균값(1.1,5.5,6.6,7.7,8.5));
	
	
	}
	

	}

}
