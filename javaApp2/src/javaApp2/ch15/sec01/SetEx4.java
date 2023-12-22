package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
	//1.Board 클래스를 객체화를 해라.
	Board b1 = new Board("홍길동", "자바", "어렵다");
	Board b2 = new Board("이순신", "파이썬", "쉽다");
	Board b3 = new Board("홍길동", "넌파이", "아직 안 배웠다");
	Board b4 = new Board("홍길동", "넌파이", "아직 안 배웠다");
	Board b5 = new Board("이순신", "판다스", "아직 안 배웠다");
	
	//2.set안에 주소를 넣어라.
	Set<Board> sb = new HashSet<Board>();
	
	sb.add(b1);
	sb.add(b2);
	sb.add(b3);
	sb.add(b4);
	sb.add(b5);
	
	//3.요소의 갯수는?
	System.out.println(sb.size());
	
	//4.전체출력하기
	//작성자와 제목이 같으면 같은사람 hashCode()가 같으면 같은사람일 확률이 높다. / equals()까지 같으면 동등객체이다.
	//모두 출력하기 주소로
	Iterator<Board> it = sb.iterator();
	while(it.hasNext()) {//it속에 데이터를 가지고 있습니까?
		System.out.println(it.next().toString());
	}
	
	
	
	}

}

class Board{
	String writer;
	String title;
	String data;
	
	
	public Board(String writer, String title, String data) {
		super();
		this.writer = writer;
		this.title = title;
		this.data = data;
	}
	
	
	@Override
	public int hashCode() { //동등객채
		return title.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) { // 비교하는거 
		if(obj instanceof Board) {
			Board B = (Board) obj;
			if(title.equals(B.title) && (writer.equals(B.writer))) {
				return true;
			}
		} return false;
	}
	
	@Override
	public String toString() {
		return writer + " " + title + " " + data;
	}
}