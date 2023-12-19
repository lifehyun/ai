package javaBasic7.ch12.sec01;

// 최상위 클래스 모든클래스는  상속을 받는다
public class ObjectEX extends Object{

	public static void main(String[] args) {
		//Object의 메소드는 모든 클래스들이 다 사용가능하다 . 재정의 할수있다. 
		
	Member obj1	= new Member("blue");
	Member obj2 = new Member("blue");
	Member obj3 = new Member("red");
	if (obj1 == obj2) { // obj1의 주소와 obj2 주소가 같니? false
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}
	
	if (obj1.equals(obj2)) { // obj1의 주소와 obj2 주소가 같니? false // .equals의 뜻은 : 해당하는주소로 찾아가서 값이 같니라고 물어보는것?
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}
	
	if (obj1.equals(obj3)) {
		System.out.println("같다");
	}else {
		System.out.println("다르다");
	}
		
	
	}//main 메소드 end

}//public class end

class Member {
	public String id;
	public String pw;
	public String name;
	
	//id가 같고 pw 같으면 같은 사람으로 할것이다.
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



