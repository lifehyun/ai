import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx3 {
//p652
	public static void main(String[] args) {

	Member mb1 = new Member("ȫ�浿", 25);
	Member mb2 = new Member("ȫ�浿2", 30);
	Member mb3 = new Member("ȫ�浿3", 25);
	Member mb4 = new Member("ȫ�浿2", 30);
	Member mb5 = new Member("ȫ�浿", 25);
	
	//set �ȿ� MemberŬ���� �ּҸ� �־��
	Set<Member> mbSet = new HashSet<Member>();
	
	mbSet.add(mb1);
	mbSet.add(mb2);
	mbSet.add(mb3);
	mbSet.add(mb4);
	mbSet.add(mb5);
		
	
	//����� ������?
	System.out.println(mbSet.size());
	
	//�̸��� ���̰� ������ ������� hashCode()�� ������ ��������� Ȯ���� ����. / equals()���� ������ ���ü�̴�.
	//��� ����ϱ� �ּҷ�
	Iterator<Member> it = mbSet.iterator();
	while(it.hasNext()) {
		//�ּҸ� ����ϸ� �ڵ����� toString()�� �ٴ´�.
		//toString()�� ObjectŬ������ �޼ҵ��̴�.
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

	//���ü�� �����ڰ� �����Ϸ��� hashCode�� equals()�� �������ؾ��Ѵ�.
	@Override
	public int hashCode() {
		Integer ageI = Integer.valueOf(age);		//�⺻�� int age�� Ŭ������ Integer�� �ٲ�
		return name.hashCode(); 
	}
	
	@Override
	public boolean equals(Object obj) {				//��Ŭ����
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