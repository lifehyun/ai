package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class 학생점수분석 {
	//p198.9번문제
	public static void main(String[] args) {
	//키보드 학생 수 입력, 학생들 점수 입력 받는다.
	Scanner sc	= new Scanner(System.in); 
	
	
	int menu = 1; 			//선택변수
	int studentCount = 0; 	//학생수
	int[] score = null; 	//배열선언
	int max = 0;			//최고점수
	int sum = 0; 			//합계점수
	double avg = 0.0; 		//평균점수
	
	
	while(menu !=5) {	//menu 가 5가 아니면 멈춰주세요
		System.out.println("--------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("--------------------------------------------------");
		System.out.print("선택>");
		menu = sc.nextInt();
		switch(menu) {
		case 1: System.out.println("학생수>");
				studentCount = sc.nextInt();
				score = new int[studentCount];
				break;		
		case 2: for(int i=0; i<score.length; i++) {
				System.out.println("score["+ i +"]>");
				score[i] = sc.nextInt();
		}
				break;
		case 3:	for(int i=0; i < score.length; i++) {
				System.out.println("score[" + i + "]:"+ score[i]);
		}
				break;
		case 4: //최고점수, 평균구하기 
				for(int i=0; i<score.length; i++) {
					sum = sum + score[i];
				if(max < score[i])  				//처리할문장이 하나밖에없으면 {}생량가능
					max = score[i];
				}
				avg = sum / (double) score.length;
				
				System.out.println("최고점수"+max);
				System.out.println("평균은"+avg);
			
		case 5:	System.out.println("프로그램 종료");
		default:System.out.println("선택수는 1~5중에 입력해 주세요.");
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
