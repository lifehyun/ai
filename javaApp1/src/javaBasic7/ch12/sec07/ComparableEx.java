package javaBasic7.ch12.sec07;

import java.util.TreeSet;

//p673
public class ComparableEx {

	public static void main(String[] args) {
	TreeSet<Person> t1 = new TreeSet<Person>();
	
	 Person p1 = new Person("ȫ�浿",15);
	 Person p2 = new Person("���ڹ�",55);
	 Person p3 = new Person("������",31);
	 
	 t1.add(p1);
	 t1.add(p2);
	 t1.add(p3);
	 
	 for (Person p : t1) {
		System.out.println(p);
	}

	}
}

class Person implements Comparable<Person>{
	
	String name;
	Integer age;
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}

	//�̸� ������� Ʈ���� �޾��ֱ�.
//	@Override
//	public int compareTo(Person o) {
//		int result = name.compareTo(o.name);	 //String Ŭ�������� �˾Ƽ� �񱳸� ���ش�.
//		System.out.println(result + "@@@@");	
//		return result;	
//	}
	
	//���� ������� Ʈ���� �޾��ֱ�
	@Override
	public int compareTo(Person o) {
		//�� �˰����� ������ 0, ������ -�� ���� , ũ�� +�� ����� �����Ѵ�.
		if(age == o.age) return 0;
		else if(age < o.age)return -1;
		else return 1;
	}
}