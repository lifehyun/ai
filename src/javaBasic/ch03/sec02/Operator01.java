package javaBasic.ch03.sec02;

public class Operator01 {

	public static void main(String[] args) {
		int number = 10;
	
		++number; //number++; //number = number + 1;					//넘버라는변수에 더하는것
		System.out.println(number);
		
		--number; //number--; //number = number - 1;					//넘버라는변수에 빼는것
		System.out.println(number);	
		
		int number1 = 100;
		//101 출력되게하기
		number1++;
		System.out.println(number1);

		int number2 = number1;
		System.out.println(number2);
		
		int number3 = 1000;
		number3++;
		int number4 = number3;
		
		System.out.println(number3); // 1001
		System.out.println(number4); // 1001
		
		
		int number5 = 20;
		int number6 = number5++; // 1번 number6 = number 5 > 2번 number5 = number5+1 
					//20 (증감연산자)								//21
		
		System.out.println(number5); //21
		System.out.println(number6); //20
		
		
		int number7 = 200;
		int number8 = ++number7;		//++가 앞에있을시  더하기먼저해주고// 1번) number7 = number7+1 --> 2번) number8 = number 7
									
		System.out.println(number7);
		System.out.println(number8);
		
		
		int number9 = 2000;
		System.out.println(number9++);		//2000
		System.out.println(number9);		//2001
		System.out.println(+number9);		//2001  * +가 한개면 1 ++2개면2
	
		int number10 = 2000;
		System.out.println(++number10);
		System.out.println(number10);
		
		
		
	
		
	}
		
					

}
