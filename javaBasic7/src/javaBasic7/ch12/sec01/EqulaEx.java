package javaBasic7.ch12.sec01;

public class EqulaEx {

	public static void main(String[] args) {
		//������ü �� �˰���
		//1�ܰ� hashCode�� ������    //2�ܰ� equals()�� ������?
		//�ּҰ����� �������� Ȯ���� ŭ. // equals�� ������ ��  
		//hashCode�� �ֱ����ġ�� ����ɶ� �ּҸ� ����� �ִ� �ڵ���
		
		Student s1 = new Student("a123", "p1234");
		System.out.println(s1.hashCode() );
		Student s2 = new Student("a123","p1235");
		System.out.println(s2.hashCode() );
		//������ �䱸�����ִµ� id�� pw�� ������ ���ü�Դϴ�
		if(s1.equals(s2)) {
			System.out.println("�������");
		}else {
			System.out.println("�ٸ����");
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
				//this.id ù��° ��ü�� "a123" ���� st.id�� �ι�° ��ü�� "a123"
				//this.pw ù��° ��ü�� "p1234"�̰� st.id�� �ι�° ��ü�� "p1235"
				return true;
			}
		}
		return false;
	}
}

//String name = "ȫ�浿";
//System.out.println(name.hashCode() );
//String name2 = "�̼���";
//System.out.println(name2.hashCode() );
//String name3 = "ȫ�浿";
//System.out.println(name3.hashCode() ); // name, name3 ������ �����ϸ� �Ȱ��� �ּҸ� ������ (������ �����ʾƵ��ȴ�.)
//
//String name4 = new String("�����");
//System.out.println(name4.hashCode() );
//String name5 = new String("�����");
//System.out.println(name5.hashCode() );