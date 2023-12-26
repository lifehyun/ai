package javaBasic7.ch12.sec07;

import java.util.TreeSet;

public class ComparableEx2 {

	public static void main(String[] args) {
		//Board 객체화하기
		Board b1 = new Board(1, "제목1", "작성자1");
		Board b2 = new Board(4, "제목8", "작성자9");
		Board b3 = new Board(3, "제목0", "작성자10");
		Board b4 = new Board(0, "제목2", "작성자8");
		
		//TreeSet을 객체화해서 Board달아주기
		TreeSet<Board> ts = new TreeSet<Board>();
		
		//Tress을 호출하라.
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
	
		for (Board b : ts) {
			System.out.println(b);
		}
		
		//번호 순서대로 출력되게 하라.
		//작성자 역순대로 
//		 cv1ts.descendingSet()
		
	}

}

//게시판 객체
class Board implements Comparable<Board>{
	
	Integer no;			//게시판번호
	String title;		//게시판제목
	String Writer;		//게시판작성자
	
	public Board(Integer no, String title, String writer) { //생성자 생성.
		super();
		this.no = no;
		this.title = title;
		this.Writer = writer;
	}
	
	//주소를 찍으면 나오는 참조변수
	@Override 
	public String toString() {
		return no + " " + title + " " + Writer; 
	}

	@Override
	public int compareTo(Board o) {
//		if(no == o.no) return 0;
//		else if(no < o.no)return -1;
//		else return 0;
		return Writer.compareTo(o.Writer);
	}
	
}	
	
	
