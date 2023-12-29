package javaApp5.ch17.seo02;

import java.util.ArrayList;
import java.util.List;

//p726
public class StringEx02 {

	public static void main(String[] args) {   
		
		//중간스트림 처리하는방법 익히기
		//스트림처리 순서 : 컬렉션 또는 배열 --> 오리지널 스트림 	
		List<String> list = new ArrayList<String>();
	    list.add("사과");
	    list.add("배");
	    list.add("바나나");
	    list.add("사과");
	    list.add("사과");
	    
	    list.stream()
	    	.filter(t-> t.equals("사과"))
	    	.forEach(p-> System.out.println(p));
	    	
	    //중복제거하기
	    list.stream().filter(t -> !t.equals("사과"))
	    			.forEach(p -> System.out.println(p));
	    		
	    
	    //매핑 : 다른것으로 바꾸어주기
		List<Student> stList = new ArrayList<Student>();
		stList.add(new Student("홍길동1", 85, "010-123-1234", 0.5));
		stList.add(new Student("홍길동2", 92, "010-123-1235", 1.2));
		stList.add(new Student("홍길동3", 87, "010-123-1236", -1.2));
		stList.add(new Student("홍길동4", 95, "010-123-1237", -2.0));
		
		//"번호" 스트림 만들기
		stList.stream()
			  .mapToInt(s-> s.getScore())
			  .forEach( p->System.out.println(p));
		
		//전화번호 스트림 만들기
		stList.stream()
			  .map(t -> t.getPhonNo())
			  .forEach(p -> System.out.println(p));
		
		//이름 스트림 만들기
		stList.stream()
			  .map(t -> t.getName())
			  .forEach(p->System.out.println(p));
		
		//시력 스트림 만들기
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
