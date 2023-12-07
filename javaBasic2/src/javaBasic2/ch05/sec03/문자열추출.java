package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class 문자열추출 {

	public static void main(String[] args) {
		
		String title="자바프래로그래밍";	//문자열개체
		String title2= new String("자바프로그래밍");
		//위에 String title1,2 방식은 다르지만 표시되는건 동일하다.
		
		
		System.out.println(title2.length());
		System.out.println(title2.charAt(1));
		//"밍"을 출력하기
		System.out.println(title2.charAt(6));
		title2 =title2.replace("자바","java");
		System.out.println(title2);
		
		System.out.println(title2.substring(4,8) );
		
		//"자바"를 출력하기
		System.out.println(title.substring(0, 2));
		//"밍" 인덱스번호 알기
		System.out.println(title.indexOf("밍")); //6번째
		//"로" 인덱스번호 알기
		System.out.println(title.indexOf("로")); //3번째
		
		System.out.println(title.indexOf("래",0)); //-1이라고 나옴 **
		
		
		String names = "홍길동,이순신,최민영";
		String [] nameArr = names.split(",");
		
		for(int i=0; i<nameArr.length ; i++) {
			System.out.println(nameArr[i]);
		}
		
		String fruits = "사과-배-귤-바나나" ;
		String [] fruit = fruits.split("-");
		
		//향상된 for문
		//형식 for( 타입 변수 : 집합) {반복할 내용}	
		for( String f  : fruit ) {
			System.out.println(f);
		}
		
		// 과일중에서 수박이 있나요? 없어요
		// 사과있나요?네
		
		//키보드 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 과일 사실래요?");
		String order =sc.nextLine();
		boolean flag = false; 				//과일이 있는지 없는지 체크하는 변수
		for(String f: fruit ) {
		if(order.equals(f)) {
			System.out.println("있습니다.");
			flag = true;
			break;
		}
		}
		if(!flag)System.out.println("없습니다"); 		//참일시 true 
	}

}
