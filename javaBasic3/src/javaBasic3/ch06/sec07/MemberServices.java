package javaBasic3.ch06.sec07;

public class MemberServices {

	boolean login(String id,String password) { 
		if(id.equals("hong") && password.equals("12345")) return true;
		if(id.equals("kim")&& password.equals("3456")) return true;
		else return false;
	};
	
	void logout(String id) { 
		System.out.println(id + "���� �α׾ƿ� �Ǿ����ϴ�.");
		
	}
	
	
	
	
	
	
}



