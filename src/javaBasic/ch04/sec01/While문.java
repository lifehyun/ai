package javaBasic.ch04.sec01;

public class While문 {
 
	public static void main(String[] args) {
		// 반복문
		// 형식 while(조건) {참이면 수행할 문장}
		// 1~100 출력하기
		// 숫자변수 만들어 1출력하기 -> 변수 +1 -> 출력
		// 1 2 
		int number = 1; 
		System.out.println( number );
		number++; // = 2
		System.out.println( number );

		while(number < 100 ) // 1~100까지면 참이되게 코드 작성 
	    number++;
		System.out.println(number);
		
		// 10 20 30 40 .. 100  * +10씩 증가하는것
		
		int number2 = 10;
		while(number2 <= 100) {
		System.out.println(number2);
		number2 = number2 + 10; //number2 = number 2+10;
		}
		
		//100 90 80 70 .. - 10 -20 *-10 감소하는것
		
		int number3 = 100;
		while(number3 > -30 ) {
		System.out.println(number3);
		number3 -= 10; //number2 = number 2+10;
		}
		
		//1 2 3 4  6 7 8 9 11 12 13 14 16 17 18 19
		

		
		//1~20까지 출력해 주기
		int number4 = 1;  				// 뒤에 숫자는 출력해줄 숫자;
		while(number4 <= 19) {
			number4++; 					
			System.out.println(number4);
		}
		
		//5의 배수를 빼고 찍기
		int number5 = 1;
		while(number5 <= 20) {
			number5++;
			if(number5 % 5 != 0) { System.out.println( number5 );}
			else {continue;} //continue는 반복문을 계속해라 단, 아래 문장은 건너뛰어라
		}
		// 1~100까지 합계 답은 5050이다.
		int number6 = 1; //출력 
		int sum=0;
		while( number6 <= 100) {
			sum = sum + number6;
			System.out.println(number6 + "   "+ sum);
			number6++;
		}
				
		// 1~100까지 중에서 합계가 3000이 넘으면 하고 숫자와 합계를 찍으세요
		// 결과는 77 3000
		
		int number7 = 1;
		int sum7= 0;
		while(number7 <= 100) {
			sum7 += number7;
			if(sum7 >= 3000) break;
			number7++;
		}
		System.out.println(number7 + "  "+ sum7 );
		
		
		// 1~100까지 중에서 
		// 1 2 3 4 5 6 8 ... 100
		// 1 3 6 10 15 21 28  
		
		
		//출력화면
		//1	1
		//2 3
		//3 6
		//4 10
		
	
		
		
		
		

		} 

		
		
				
				
				

	}
	

