package javaApp5.ch17.seo02;

import java.util.ArrayList;
import java.util.List;

//p726
public class StringEx02 {

	public static void main(String[] args) {   
		
		//�߰���Ʈ�� ó���ϴ¹�� ������
		//��Ʈ��ó�� ���� : �÷��� �Ǵ� �迭 --> �������� ��Ʈ�� 	
		List<String> list = new ArrayList<String>();
	    list.add("���");
	    list.add("��");
	    list.add("�ٳ���");
	    list.add("���");
	    list.add("���");
	    
	    list.stream()
	    	.filter(t-> t.equals("���"))
	    	.forEach(p-> System.out.println(p));
	    	
	    //�ߺ������ϱ�
	    list.stream().filter(t -> !t.equals("���"))
	    			.forEach(p -> System.out.println(p));
	    		
	    
	    //���� : �ٸ������� �ٲپ��ֱ�
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student("ȫ�浿1", 85, "010-123-1234", 0.5));
		stList.add(new Student("ȫ�浿2", 92, "010-123-1235", 1.2));
		stList.add(new Student("ȫ�浿3", 87, "010-123-1236", -1.2));
		stList.add(new Student("ȫ�浿4", 95, "010-123-1237", -2.0));
		
		//"��ȣ" ��Ʈ�� �����
		stList.stream()
			  .mapToInt(s-> s.getScore())
			  .forEach( p->System.out.println(p));
		
		//��ȭ��ȣ ��Ʈ�� �����
		stList.stream()
			  .map(t -> t.getPhonNo())
			  .forEach(p -> System.out.println(p));
		
		//�̸� ��Ʈ�� �����
		stList.stream()
			  .map(t -> t.getName())
			  .forEach(p->System.out.println(p));
		
		//�÷� ��Ʈ�� �����
		stList.stream()
		      .mapToDouble(t -> t.getSight())
		      .forEach(p->System.out.println(p));
			
	}

}

class Student {
	
	private String name;
	private int score;
	private String phonNo;
	private double sight;
	
	public double getSight() {
		return sight;
	}

	public void setSight(double sight) {
		this.sight = sight;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public Student(String name, int score, String phonNo , double sight) {
		this.name = name;
		this.score = score;
		this.phonNo = phonNo;
		this.sight = sight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPhonNo() {
		return phonNo;
	}

	public void setPhonNo(String phonNo) {
		this.phonNo = phonNo;
	} 
	
	
	
}
