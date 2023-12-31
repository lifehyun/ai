package javaBasic.ch04.sec01;

import java.util.Scanner;

public class Swich문 {

	public static void main(String[] args) {
		// 영어 단어 공부 프로그램
		// 'A'라고 입력하면 Apple이라고 출력
		// 'B'라고 입력하면 Bear라고 출력
		// 'C'라고 입력하면 Cat이라고 출력하기
		
		//키보드 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 첫글자 입력하기(A~C)");
		String word = sc.next();
		System.out.println(word);
		
		//조건문
		if(word.equals("A")) {
			System.out.println("Apple");
		}else if(word.equals("B")) {
			System.out.println("Bear");
		}else if(word.equals("C")) {
			System.out.println("Cat");
		}
			
		//switch문
		switch(word) {
		case "A":System.out.println("Apple"); break; ///자기가 속해있는것에서만 나옴
		case "B":System.out.println("Bear");  break;
		case "C":System.out.println("Cat");   break;
		default: System.out.println("입력하신 글자는 A,B,C가 아닙니다."); //A,B,C가 아닌 그외에것이 들어가있을시에는 default
		}
		
		/// break문은 입력된 곳의 {} 밖으로 나가라
		
		// number= 100이 백의자리 10이면 십의자리 1이면 일의자리
		int number =10;
		switch(number) {
		case 100:System.out.println("백의자리");	break;
		case 10:System.out.println("십의자리");	break;
		case 1:System.out.println("일의자리");	break;
		default:System.out.println("입력하신 글자는  100,10,1가 아닙니다"); 	break;
		}
		
		// if문으로 작성하기
		
		if(number == 100) {
		System.out.println("백의자리");
		}else if(number == 10) {
		System.out.println("십의자리");
		}else if(number == 1) {
		System.out.println("일의자리");
		}
			
		
	
		
		
		
		
		
		
	}

}
