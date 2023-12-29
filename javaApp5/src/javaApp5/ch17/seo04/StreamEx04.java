package javaApp5.ch17.seo04;

import java.util.ArrayList;
import java.util.List;


//P744
public class StreamEx04 {

	public static void main(String[] args) {

		List<Student> slist = new ArrayList<Student>();
		slist.add(new Student ("홍길동",30));
		slist.add(new Student ("신용권",10));
		slist.add(new Student ("유미선",20));
		
		//요구사항:점수를 기준으로 오름차순으로 정렬한 스트림얻기
		//스트림호출
		slist.stream()
			 .sorted()
			 .forEach(p ->System.out.println(p.getName() + "  " +p.getScore())); //p에는 slist의 주소가 있다.
		
		
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
		Integer it1 = Integer.valueOf(score);			//기본형 int를 Integer 객체로 변경함
		Integer it2 = Integer.valueOf(o.getScore());	
		return it1.compareTo(it2);
	} 
	
	
	
	
}