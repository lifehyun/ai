package javaBasic3.ch06.sec02;

public class 변수의생명주기 {

	
	int c = 10; //전역 변수 : 메소드 밖에 있어서			// c변수의 메소드 : class 변수의생명주기
	public static void main(String[] args) {
		
		int a = 10; 	   		//변수선언하기 , 생성하기 . main () 안에서만 쓸수 있다. 
						   		// 생성된 곳의  {} 안에서만 가능함.
	//System.out.println(c);
		
		for(int i=0; i<10; i++) { //for변수의 메소드 : for에서만 사용할수있다.
			int j
			System.out.println(i);
		}
	//System.out.println(i); //for변수의 메소드 밖이라 사용불가
 	}
	
	void method01() { // b변수는 {}안에서만 사용이 가능하다.
		int b = 20;
		System.out.println(a); 	// 변수가 선언되지 않았다 에러.
	}
		
	void method02() {
		System.out.println(b);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
	
	
	
}
