package javaBasic3.ch06.sec07;

import java.util.Scanner;

public class Ȯ�ι���6��12�� {

public static void main(String[ ]args) {	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("id>");
	String id = sc.next();
	
	System.out.println("password>");
	String password = sc.next();
	

	
	MemberServices  MemberServices = new MemberServices();
	boolean result = MemberServices.login(id,password);
	
	if(result) {
		System.out.println("�α��� �Ǿ����ϴ�");
		MemberServices.logout(id);
	}else {
		System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
	}
}


}
