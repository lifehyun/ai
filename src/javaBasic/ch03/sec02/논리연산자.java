package javaBasic.ch03.sec02;

public class 논리연산자 {

	public static void main(String[] args) {
		// p.91
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2); 	//&& 그리고
		System.out.println(b1 || b2); 	//|| 또는 
		System.out.println(b1  ^ b2); 	// ^ 참 , 거짓이면 참이 되는것 
		System.out.println(!b1); 		// 부정 반대
		
		//비트연산자
		byte b3 = 10;
		byte b4 = 7;
		
		System.out.println(b3 & b4); 	//&& 그리고 0거짓 1참
		
		
	}

}
