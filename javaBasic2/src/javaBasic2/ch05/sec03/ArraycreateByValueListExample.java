package javaBasic2.ch05.sec03;
//p168
public class ArraycreateByValueListExample {

	public static void main(String[] args) {
	//배열 변수 선언과 배열생성
	String[] season = {"Spring" ,"Summer", "Fall", "Winter"};

	
	//배열의 항목값 읽기
	System.out.println("seson[0]:"+ season[0]);
	System.out.println("seson[1]:"+ season[1]);
	System.out.println("seson[2]:"+ season[2]);
	System.out.println("seson[3]:"+ season[3]);
	
	//인덱스 1번 항목의 값 변경
	season[1] = "여름";
	System.out.println("season[1]"+ season[1]);
	System.out.println();
	
	//배열 변수 선언과 배열 생성
	int [] scores = {83,90,87};
	
	//총합과 평균 구하기 
	int sum1 = 0;
	for(int i=0; i<3; i++ ) {
		sum1 += scores[i];
	}
	
	System.out.println("총합 :"+" "+ sum1);
	double avg1 = (double) sum1 /3;
	System.out.println("평균:"+avg1);
	
	
	
	// name. length =25;
	
	//성정표 만들기
	//	이름 점수
	//	홍길동 100
	//	김수진 90
	//	이경주 85
	
	// 1차원 배열 만들어서 출력해 보세요.
	String[] name2 = {"홍길동","김수진", "이경주"};
	int[] score2 = {100,90,85};
	
	for(int i=0; i < name2.length; i++) {
		System.out.println(name2[i]+"  "+score2[i]);
	}
		

//	//자동차 판매현황을 배열에 넣어서 출력하기
//	String[] carName = {"싼타페","코란도"};
//	int [] totalvehicleAmount = {35000000,24000000};
//	int [] deliveryMoney = {15000000,5000000};
//	int [] installMent = {20000000,19000000};
//	int [] situationPeriod = {36,24};
//	int [] monthlyPayment = {55555556,79166667};
//	
//	for(int i=0; i<carName.length ; i++) {
//		System.out.println("totalvehicleAmount"[i]+"  "+"deliveryMoney"[i]+"  "+"installMent"[i]+"  "+"situationPeriod"[i]+"  "+"monthlyPayment"[i]);
//	}
	
	
	
	
	//대출정보에 대한 것을 배열에 넣어서 출력하기
	
	String[] 성명 = {"이민주","남지철","김춘복","민애라"};
	int[] 대출금액 = { 27000000,15000000,15000000,12000000};
	int[] 기간 = {48,60,60,60};
	int 대출합계 =0;
	int 월상환액합계 = 0;
	
	System.out.println("성명 대출종류 대출금액 기간(월) 월상환액");
	for(int i=0; i<성명.length ; i++) {
		System.out.println(성명[i]+"  "+ "주택자금대출"+"  "+ 대출금액[i] + "  "+ 기간[i]);
		대출합계 = 대출합계 + 대출금액[i];
		월상환액합계 = 월상환액합계 + 대출금액[i]/기간[i];		
		
	}
	//월 상환액 = 대출금액 / 기간 나누면된다
	// 대출금액 합계를 구하시오. 월상환액의 합을 구하시오.
	System.out.println("대출합계는"+대출합계);
	System.out.println("월상환액합계는" + 월상환액합계);
	
	
	// 부서정보에 대한것을 배열에 넣어서 출력하기//0열 , 1열 , 2열,3열
	String[] 사번 = {"J0001","J0003","J0008","J0009"};
	String[] 이름 = {"홍길동","이도현","한미우","박정진"};
	String[] 부서 = {"총무부","영업부","인사부","영업부"};
	boolean[] 성별 = {true,true,true,true,};
	
	System.out.println("이름 사번 부서 성별 ");
	for(int i=0; i<사번.length; i++) {
		System.out.println(사번[i]+"  "+이름[i]+"  "+ 부서[i]+"  "+ (성별[i]? "남" :"여"));
	}
	
	//부서가 총무부인 사람은 누군지 찾아 주세요
	for(int i=0; i<부서.length; i++) {
		if(부서[i].equals("총무부")) {
			System.out.println(이름[i]);
		}
	}
	
	
		
		
	}

}
