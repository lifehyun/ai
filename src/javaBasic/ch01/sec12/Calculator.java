package javaBasic.ch01.sec12;

public class Calculator {

	public static void main(String[]args) {
		//5명 아르바이트생 급여 계산하는 프로그램 작성하기
		// 1명일 경우 급여 계산하기
		//형식 변수형태 변수명 = 값;ㅣ
		String name;
        name= "홍길동"; //이름

		int basicPay=50000; //급여
		String phoneNumber = "010-1234-5678"; //전화번호
	    String accountNumner = "국민 123-12-1234"; //계좌번호
	    String dept="알바생"; //직금
	    boolean sex = true; //성별 남자
	    double tex = 0.03; // 세금 비율
	    
	    //출력하기
	    System.out.println("1번 알바정보:" + name+ "  "+ basicPay + " "+phoneNumber);
	    System.out.println(accountNumner + "  " +dept + " "+sex + " "+tex);
	    
	    String name2;
        name2= "이순신"; //이름

		int basicPay2=50000; //급여
		String phoneNumber2 = "010-1111-5678"; //전화번호
	    String accountNumner2 = "농협 124-12-1234"; //계좌번호
	    String dept2="알바생"; //직금
	    boolean sex2 = true; //성별 남자
	    double tex2 = 0.03; // 세금 비율
	    
	    //출력하기
	    System.out.println("2번 알바정보" + name2 + "  "+ basicPay2 + " "+ phoneNumber2);
	    System.out.println(accountNumner2 + "  " +dept2 + " "+sex2 + " "+tex2);
	    
	    String name3;
        name3= "이경미"; //이름

		int basicPay3=15000; //급여
		String phoneNumber3 = "010-987-7456"; //전화번호
	    String accountNumner3 = "신한 123-555-7456"; //계좌번호
	    String dept3="팀장"; //직금
	    boolean sex3 = false; //성별 여자
	    double tex3 = 0.015; // 세금 비율
	    
	    //출력하기
	    System.out.println("3번 알바정보" +name3 + "  "+ basicPay3+ " "+ phoneNumber3);
	    System.out.println(accountNumner3 + "  " +dept3 + " "+sex3 + " "+tex3);
	    
	    String name4;
        name4= "정현희"; //이름

		int basicPay4=15000; //급여
		String phoneNumber4 = "010-987-7456"; //전화번호
	    String accountNumner4 = "신한 123-555-7456"; //계좌번호
	    String dept4="사장"; //직금
	    boolean sex4 = false; //성별 여자
	    double tex4 = 0.015; // 세금 비율
	    
	    //출력하기
	    System.out.println("4번 알바정보" +name4 + "  "+ basicPay4+ " "+ phoneNumber4);
	    System.out.println(accountNumner4 + "  " +dept4 + " "+sex4 + " "+tex4);
	    
	    String name5;
        name5= "최수연"; //이름

		int basicPay5=9800; //급여
		String phoneNumber5 = "010-333-7777"; //전화번호
	    String accountNumner5 = "카카오 777-454-1231"; //계좌번호
	    String dept5="비정규직"; //직금
	    boolean sex5 = false; //성별 여자
	    double tex5 = 0.005; // 세금 비율
	    
	    //출력하기
	    System.out.println("5번 알바정보" +name5 + "  "+ basicPay5+ " "+ phoneNumber5);
	    System.out.println(accountNumner5 + "  " +dept5 + " "+sex5 + " "+tex5);
	    
	    
	    
	    // 실지급액 
	    // 1번 10시간 2번 15시간 3번 20 4번 25시간 5번 30시간
	    // 1번 10시간 일해서 10 X 	5000 = 50000 세금 50000 X 0.03 실수령액 = 50000 - 세금
	  
	    //50만원 변수에 담는다
	    int sum1 = 10 * basicPay;
	   // int sum2 = 15 * basicpay2;
	    
	   
	    //세금을 계산한다.
	    //int texCal    = sum1 * tex; // 50000*0.03
	    double texCal = sum1 * tex;
	    
	    //실수력액을 계산한다.
	    double salary = sum1 - texCal; //정수형 - 실수형
	    
	    System.out.println( sum1 + " " +texCal + " " + salary );
	   // System.out.println(sum2 + "  "+ texcal2 + "  "+ salary);
	    
	    
	}
}
