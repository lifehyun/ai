package javaApp5.ch17.seo05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//P744
public class StreamEx04 {

	public static void main(String[] args) {

		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student ("ȫ�浿",30));
		slist.add(new Student ("�ſ��",10));
		slist.add(new Student ("���̼�",20));
		
		//�䱸����:������ �������� ������������ ������ ��Ʈ�����
		//��Ʈ��ȣ��
		slist.stream()
			 .sorted(new StudentCom())
			 .forEach(p ->System.out.println(p.getName() + "  " +p.getScore())); //p���� slist�� �ּҰ� �ִ�.
		
		
		
			}
	
}

class StudentCom implements Comparator<Student>{ //�������ϰ� ������ �����༭ ���� 

	@Override //���ϴ� Ŭ����
	public int compare(Student o1, Student o2) { //o1�� �׳� ȣ���Ҽ���� Integer�� ����ؾ��Ѵ�.
		Integer o1is = Integer.valueOf(o1.getScore()); 	//ȫ�浿�� 30��
		Integer o2is = Integer.valueOf(o2.getScore());	//�ſ���� 10��
		
		return o1is.compareTo(o2is);
	}
	
}


class Student {
	
	private String name ;
	private int score;
	
	 
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
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
	
}