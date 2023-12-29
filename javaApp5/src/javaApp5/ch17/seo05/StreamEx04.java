package javaApp5.ch17.seo05;

import java.util.ArrayList;
import java.util.Comparator;
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
			 .sorted(new StudentCom())
			 .forEach(p ->System.out.println(p.getName() + "  " +p.getScore())); //p에는 slist의 주소가 있다.
		
		
		
			}
	
}

class StudentCom implements Comparator<Student>{ //구현만하고 연결을 안해줘서 오류 

	@Override //비교하는 클래스
	public int compare(Student o1, Student o2) { //o1을 그냥 호출할수없어서 Integer를 사용해야한다.
		Integer o1is = Integer.valueOf(o1.getScore()); 	//홍길동의 30점
		Integer o2is = Integer.valueOf(o2.getScore());	//신용권의 10점
		
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