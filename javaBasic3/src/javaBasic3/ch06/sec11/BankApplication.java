package javaBasic3.ch06.sec11;

import java.util.Scanner;

//Account 클래스 관리
public class BankApplication {
	
	Scanner sc = new Scanner(System.in);
	Account[] accounts = new Account[100];
	//int[] 숫자 = new int[100];
	
	int count = 0; 		//계좌 생성하는 카운트
	public void 계좌생성() {
		accounts[count] = new Account();
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		System.out.print("계좌번호:");
		accounts[count].계좌번호 = sc.next();
		System.out.println("계좌주:");
		accounts[count].계좌주 = sc.next();
		System.out.println("초기입금액");
		accounts[count].초기입금액 = sc.nextInt();
		accounts[count].set잔고(accounts[count].초기입금액);
		System.out.println("결과 : 계좌가 생성되었습니다.");
		count = count + 1;
 		
		
	}

	
	public void 계좌목록() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		for(int i=0; i<count; i++){
			System.out.println(accounts[i].get계좌번호()+"  "+accounts[i].get계좌주()+"  "+accounts[i].get잔고());
		}
		
	}

	
	
	
	
	public void 예금() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		System.out.println("계좌번호");
		String 예금할계좌번호 = sc.next();
		//홍길동 강자바 계좌인지 확인하기 : 반복문 사용
		System.out.println("예금액");
		int 예금금액 = sc.nextInt();
		boolean	flag=true;
		
		int i;
		for(i=0; i < count ; i++) {
			if(예금할계좌번호.equals(accounts[i].get계좌번호() ))//반복문 그만두고 i변수값을 기억해 주어야한다.
			accounts[i].잔고	= accounts[i].get잔고()+예금금액;
			break;	
		}	
		
		if(!flag) {
			System.out.println("계좌번호가 틀렸습니다.확인하세요.");
		}
		}
		
		


	public void 출금() {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
	
	
	
	
	
}
