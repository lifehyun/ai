package javaBasic.ch03.sec02;

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[]args) {
	
			Scanner sc = new Scanner(System.in); //키보드로 글자 입력하는 클래스

			//이름은
			//국어점수는?
			//영어점수는?
			//수학점수는?
			
			
			
			//출력
			//홍길동 100 80 90
			
		System.out.print("이름은?");
		String name = sc.next();
		System.out.println();//한줄을 내려줘라
		
		System.out.print("국어점수는?");
		int kor = sc.nextInt();
		System.out.println();
		
		System.out.print("영어점수는?");
		int eng = sc.nextInt();
		System.out.println();
		
		System.out.print("수학점수는?");
		int mat = sc.nextInt();
		System.out.println();
		
		System.out.println(name +"  "+ kor + "  "+ eng + "  " + mat);
		  
		
		//합계 구하기
		int sum = kor + eng + mat ;
		
		//국어합계차 = 합계에서 국어점수 빼기
		int dsum = sum - kor;
		
		//평균 = 합계나누기 / 3 실수형으로 만들기 [나누기할때 double합수]
		double avg = sum / 3.0;
		
		//수학점수가 홀수입니까? 짝수입니까? 2의 배수이면 짝수
		// % 나머지를 구함
		int matmod = mat % 2;
		System.out.println(sum +"  "+ dsum + "  "+ avg + "  "+ matmod);
		
		
		
		
	
	
		
			
			
			
			
			
			
			
			
			
			//			int kor = sc.nextInt();
//			System.out.println(kor);
//			
//			
//			double rate =sc.nextDouble();
//			System.out.println(rate);
//			
//			//true입력하여 출력하고 싶을시
//			boolean ox = sc.nextBoolean();
//			System.out.println(ox);
//			
//			//홍길동이라고 이름을 입력하고 싶을때
//			String name =sc.toString();
//			System.out.println(name);
//			
	}
}
