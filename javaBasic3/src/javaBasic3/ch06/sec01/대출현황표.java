package javaBasic3.ch06.sec01;

import java.util.Date;

public class 대출현황표 {
	
	//멤버필드
	String 대출번호;
	String 성명;
	Date 대출일;				//에러가 날때 java. Date커서 두번째 누르기
	String 대출종류;
	int 대출금액;
	int 기간;
	
	//생성자 만들기 아무것도 없는것 " Deselect all "
	public 대출현황표() {
		super();
	}

	//생성자 만들기 모든것 다 체크해서 "select all"
	public 대출현황표(String 대출번호, String 성명, Date 대출일, String 대출종류, int 대출금액, int 기간) {
		super();
		this.대출번호 = 대출번호;
		this.성명 = 성명;
		this.대출일 = 대출일;
		this.대출종류 = 대출종류;
		this.대출금액 = 대출금액;
		this.기간 = 기간;
	}

	// getter setter 만들기
	
	public String get대출번호() {
		return 대출번호;
	}

	public void set대출번호(String 대출번호) {
		this.대출번호 = 대출번호;
	}

	public String get성명() {
		return 성명;
	}

	public void set성명(String 성명) {
		this.성명 = 성명;
	}

	public Date get대출일() {
		return 대출일;
	}

	public void set대출일(Date 대출일) {
		this.대출일 = 대출일;
	}

	public String get대출종류() {
		return 대출종류;
	}

	public void set대출종류(String 대출종류) {
		this.대출종류 = 대출종류;
	}

	public int get대출금액() {
		return 대출금액;
	}

	public void set대출금액(int 대출금액) {
		this.대출금액 = 대출금액;
	}

	public int get기간() {
		return 기간;
	}

	public void set기간(int 기간) {
		this.기간 = 기간;
	}
	
	
	
	
	
	
	
	
	
	
	
}




