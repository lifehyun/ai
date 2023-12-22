import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx3 {
//p652
	public static void main(String[] args) {

	Member mb1 = new Member("홍길동", 25);
	Member mb2 = new Member("홍길동2", 30);
	Member mb3 = new Member("홍길동3", 25);
	Member mb4 = new Member("홍길동2", 30);
	Member mb5 = new Member("홍길동", 25);
	
	//set 안에 Member클래스 주소를 넣어라
	Set<Member> mbSet = new HashSet<Member>();
	
	mbSet.add(mb1);
	mbSet.add(mb2);
	mbSet.add(mb3);
	mbSet.add(mb4);
	mbSet.add(mb5);
		
	
	//요소의 갯수는?
	System.out.println(mbSet.size());
	
	//이름과 나이가 같으면 같은사람 hashCode()가 같으면 같은사람일 확률이 높다. / equals()까지 같으면 동등객체이다.
	//모두 출력하기 주소로
	Iterator<Member> it = mbSet.iterator();
	while(it.hasNext()) {
		//주소를 출력하면 자동으로 toString()이 붙는다.
		//toString()은 Object클래스의 메소드이다.
		System.out.println(it.next().toString());
		
	}
	
	
	
	
	}

}

class Member{
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	//동등객체를 개발자가 정의하려면 hashCode와 equals()를 재정의해야한다.
	@Override
	public int hashCode() {
		Integer ageI = Integer.valueOf(age);		//기본형 int age를 클래스형 Integer로 바꿈
		return name.hashCode(); 
	}
	
	@Override
	public boolean equals(Object obj) {				//비교클래스
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(name.equals(m.name) && age==m.age) {
				return true;
				
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
}