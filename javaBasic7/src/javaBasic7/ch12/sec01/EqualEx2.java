package javaBasic7.ch12.sec01;

public class EqualEx2 {

	public static void main(String[] args) {

	Netplex n1 = new Netplex("100", "a123", "p123");
	Netplex n2 = new Netplex("100", "a124", "p1234");	
	Netplex n3 = new Netplex("100", "a125", "p1235");
	Netplex n4 = new Netplex("100", "a126", "p1236");
	
	Netplex n5 = new Netplex("200", "a125", "p1235");
	Netplex n6 = new Netplex("300", "a126", "p1236");
	
	//Ű�������� ���ü
	if(n1.equals(n2)) {
		System.out.println("������ü");
	}else {
		System.out.println("�ٸ���ü");
	}
	System.out.println("----------key�� �ٸ���");
	//Ű�� �ٸ��� �ٸ���ü
	if(n5.equals(n6)) {
		System.out.println("������ü");
	}else {
		System.out.println("�ٸ���ü");
	}
	
 }

}


class Netplex{
	
	String key;
	String id;
	String pw;
	
	
	public Netplex(String key, String id, String pw) {
		this.key = key;
		this.id = id;
		this.pw = pw;
	}
	
	//���ü�� key�� ������ ������� 
	//"��Ʈ�� �����̽��ٷ� hashcode , equals @Override �����ϱ�"
	
	@Override
	public int hashCode() {
		return key.hashCode(); //Ű�������� ���ü
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Netplex) {
			Netplex np = (Netplex) obj;
			if(this.key.equals(np.key) ) { // ���� ����� Ű
				return true;
			}
		}
		return false;
	}
}