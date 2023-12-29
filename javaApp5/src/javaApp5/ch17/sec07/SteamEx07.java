package javaApp5.ch17.sec07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SteamEx07 {

	public static void main(String[] args) {
		
		
		List<Student> tL = new ArrayList<Student>();
		
		tL.add(new Student("ȫ�浿", "��", 92));
		tL.add(new Student("�����", "��", 87));
		tL.add(new Student("���ڹ�", "��", 92));
		tL.add(new Student("������", "��", 93));
		
		//�䱸����:���л��� List�� ������ּ���
		List<Student> mL =
							tL.stream()
							  .filter(t -> t.getSex().equals("��"))
							  .collect( Collectors.toList());
		for (Student s : mL) {
			System.out.println(s.getName() + " " + s.getSex());
		}
		
	}

}
class Student {
	
	private String name;
	private String sex;
	private Integer score;
	
	public Student(String name, String sex, Integer score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Integer getScore() {
		return score;
	}


	public void setScore(Integer score) {
		this.score = score;
	}

	
}
