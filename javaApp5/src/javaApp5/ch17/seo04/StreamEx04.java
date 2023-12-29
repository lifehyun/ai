package javaApp5.ch17.seo04;

import java.util.ArrayList;
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
			 .sorted()
			 .forEach(p ->System.out.println(p.getName() + "  " +p.getScore())); //p���� slist�� �ּҰ� �ִ�.
		
		
	}

}

class Student implements Comparable<Student> {
	
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

	@Override
	public int compareTo(Student o) {
		Integer it1 = Integer.valueOf(score);			//�⺻�� int�� Integer ��ü�� ������
		Integer it2 = Integer.valueOf(o.getScore());	
		return it1.compareTo(it2);
	} 
	
	
	
	
}