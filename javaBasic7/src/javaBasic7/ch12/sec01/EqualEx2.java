package javaBasic7.ch12.sec01;

public class EqualEx2 {

	public static void main(String[] args) {

	Netplex n1 = new Netplex("100", "a123", "p123");
	Netplex n2 = new Netplex("100", "a124", "p1234");	
	Netplex n3 = new Netplex("100", "a125", "p1235");
	Netplex n4 = new Netplex("100", "a126", "p1236");
	
	Netplex n5 = new Netplex("200", "a125", "p1235");
	Netplex n6 = new Netplex("300", "a126", "p1236");
	
	//키가같으면 동등객체
	if(n1.equals(n2)) {
		System.out.println("같은객체");
	}else {
		System.out.println("다른객체");
	}
	System.out.println("----------key가 다르면");
	//키가 다르면 다른객체
	if(n5.equals(n6)) {
		System.out.println("각은객체");
	}else {
		System.out.println("다른객체");
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
	
	//동등객체는 key가 같으면 같은사람 
	//"컨트롤 스페이스바로 hashcode , equals @Override 생성하기"
	
	@Override
	public int hashCode() {
		return key.hashCode(); //키가같으면 동등객체
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Netplex) {
			Netplex np = (Netplex) obj;
			if(this.key.equals(np.key) ) { // 비교할 대상의 키
				return true;
			}
		}
		return false;
	}
}