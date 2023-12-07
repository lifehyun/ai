package javaBasic3;

public class 클래스개념정의 {

	public static void main(String[] args) {
	//객체생성하자 마자 값을 넣어주기
	Student s1 = new Student("20231201","홍길동","AI",100,"010-123-1234");	
	
	Teacher t1 = new Teacher("A32","정현희","컴공","전임",10000000,20);
		
	//출력하기
	System.out.println(s1.get학번());// "학번"
	System.out.println(s1.get학과());// "ai"
	System.out.println(t1.get이름());// "정현희"
	System.out.println(t1.get전공());// "전임"
	System.out.println(s1.get점수());// "100"
	System.out.println(t1.get시수());// "20"
	System.out.println(s1.get전화번호()); //"전화번호"
	System.out.println(t1.get코드());//"코드"
	
	
	//필요할때 마다 넣기
	// 빈 객체 생성하기
	Student s2 = new Student();
	Teacher t2 = new Teacher();
	
	// 값 넣기
	s2.set학번("2201");
	s2.set이름("이순신");
	s2.set학과("경영학과");
	s2.set점수(85);
	s2.set전화번호("010-234-2345");
	
	t2.set코드("B101");
	t2.set이름("박희연");
	t2.set전공("피아노");
	t2.set급여(2000000);
	t2.set구분("시간강사");
	t2.set시수(30);
	
	System.out.println(s2.get학번()+" "+ s2.get이름()+"  "+ s2.get학과()+"  "+s2.get점수()+"  "+s2.get전화번호());	
	System.out.println(t2.get코드()+" "+ t2.get이름()+"  "+ t2.get전공()+"  "+t2.get급여()+"  "+t2.get구분()+"  "+t2.get시수());	
	
	//생성자로 값을 넣기
	자동차판매현황 car1 = new 자동차판매현황("싼타페",35000000,15000000,20000000,36,55555556);
	
	//빈 객체를 생성하기
	자동차판매현황 car2 = new 자동차판매현황();
	
	// 빈객체에 값을 넣어주기 *.set ;
	car2.set차량명("코란도");
	car2.set차량총액(24000000);
	car2.set인도금(5000000);
	car2.set할부원금(19000000);
	car2.set상환기간월(24);
	car2.set월남입금(791666);
	
	//출력하기 
	System.out.println("       자동차 판매 현황 ");
	System.out.println();
	System.out.println("차량명 차량총액 인도금 할부원금 상환기간월 월납입금");
	System.out.println(car1.get차량명()+"  "+car1.get차량총액()+"  "+car1.get인도금()+"  "+car1.get할부원금()+"  "+car1.get상환기간월()+"  "+car1.get월남입금());
	System.out.println(car2.get차량명()+"  "+car2.get차량총액()+"  "+car2.get인도금()+"  "+car2.get할부원금()+"  "+car2.get상환기간월()+"  "+car2.get월남입금());	
	System.out.println("차량 총액의 합계 " + (car1.get차량총액()+car2.get차량총액() ));	
	System.out.println("월 납임금의 총액은"+ ( car1.get월남입금()+car2.get월남입금() ));	
	
	// 싼타페가 차량총액이 4000000000으로 수정이 됐다면 ? *.set입력 ,수정 가능하다.
	car1.set차량총액(40000000);
	System.out.println(car1.get차량명()+"  "+car1.get차량총액()+"  "+car1.get인도금()+"  "+car1.get할부원금()+"  "+car1.get상환기간월()+"  "+car1.get월남입금());

	
	
	
	
	
	
	
	
	
	
	
	}

}
