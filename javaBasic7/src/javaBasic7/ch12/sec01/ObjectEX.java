package javaBasic7.ch12.sec01;

// �ֻ��� Ŭ���� ���Ŭ������  ����� �޴´�
public class ObjectEX extends Object{

	public static void main(String[] args) {
		//Object�� �޼ҵ�� ��� Ŭ�������� �� ��밡���ϴ� . ������ �Ҽ��ִ�. 
		
	Member obj1	= new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	if (obj1 == obj2) { // obj1�� �ּҿ� obj2 �ּҰ� ����? false
		System.out.println("����");
	}else {
		System.out.println("�ٸ���");
	}
	
	if (obj1.equals(obj2)) { // obj1�� �ּҿ� obj2 �ּҰ� ����? false // .equals�� ���� : �ش��ϴ��ּҷ� ã�ư��� ���� ���϶�� ����°�?
		System.out.println("����");
	}else {
		System.out.println("�ٸ���");
	}
	
	if (obj1.equals(obj3)) {
		System.out.println("����");
	}else {
		System.out.println("�ٸ���");
	}
		
	
	}//main �޼ҵ� end

}//public class end

class Member {
	public String id;
	public String pw;
	public String name;
	
	//id�� ���� pw ������ ���� ������� �Ұ��̴�.
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
		Member m = (Member) obj;
		if(this.id.equals(m.id)) {
			return true;
		  }
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}  
	
	
}



