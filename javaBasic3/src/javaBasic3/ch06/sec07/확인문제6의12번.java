package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class 확인문제6의12번 {

public static void main(String[ ]args) {	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("id>");
	String id = sc.next();
	
	System.out.println("password>");
	String password = sc.next();
	

	
	MemberServices  MemberServices = new MemberServices();
	boolean result = MemberServices.login(id,password);
	
	if(result) {
		System.out.println("로그인 되었습니다");
		MemberServices.logout(id);
	}else {
		System.out.println("id또는 password가 올바르지 않습니다.");
	}
}


}
