package javaBasic7.ch12.sec01;

public class EqulaEx {

	public static void main(String[] args) {
		//동물객체 비교 알고리즘
		//1단계 hashCode가 같은가    //2단계 equals()가 같은가?
		//주소같으면 같은것일 확률이 큼. // equals로 내용을 비교  
		//hashCode는 주기억장치에 저장될때 주소를 만들어 주는 코드임
		
		Student s1 = new Student("a123", "p1234");
		System.out.println(s1.hashCode() );
		Student s2 = new Student("a123","p1235");
		System.out.println(s2.hashCode() );
		//개발자 요구사항있는데 id와 pw가 같으면 동등객체입니다
		if(s1.equals(s2)) {
			System.out.println("같은사람");
		}else {
			System.out.println("다른사람");
		}
		
		
		
		
	}

}

class Student{
	String id;
	String pw;
	
	public Student(String id, String pw) {
		this.id = id;
		this.pw = pw;	
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st = (Student) obj;
			if(this.id.equals(st.id) && this.pw.equals(st.pw) ) {
				//this.id 첫번째 객체의 "a123" 있음 st.id는 두번째 객체의 "a123"
				//this.pw 첫번째 객체의 "p1234"이고 st.id는 두번째 객체의 "p1235"
				return true;
			}
		}
		return false;
	}
}

//String name = "홍길동";
//System.out.println(name.hashCode() );
//String name2 = "이순신";
//System.out.println(name2.hashCode() );
//String name3 = "홍길동";
//System.out.println(name3.hashCode() ); // name, name3 내용이 동일하면 똑같은 주소를 가진다 (생성을 하지않아도된다.)
//
//String name4 = new String("최재우");
//System.out.println(name4.hashCode() );
//String name5 = new String("최재우");
//System.out.println(name5.hashCode() );