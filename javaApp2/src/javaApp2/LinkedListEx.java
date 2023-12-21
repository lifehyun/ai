package javaApp2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
	LinkedList<Board> boardList = new LinkedList<Board>();
	
	Board b1 = new Board(1, "제목1", "내용1", "홍길동", LocalDateTime.now() );
	Board b2 = new Board(2, "제목2", "내용2", "이순신", LocalDateTime.now() );
	Board b3 = new Board(3, "제목3", "내용3", "최경미", LocalDateTime.now() );
	//호출하라고 명령한것.
	//boardList안에는 주소가 있다.
	boardList.add(b1);	
	boardList.add(b2);
	boardList.add(b3);
	//출력하라고 get으로 명령한것.
	System.out.println(boardList.get(0));			//b1의 참조변수값이 나온다.
	System.out.println(boardList.get(0).writer);	//b1의 참조변수값안에 writer을 출력하라
	System.out.println(boardList.get(1).title);
	System.out.println(boardList.get(2).writer);
	//최경미의 작성일자를 출력하라고 명령
	System.out.println(boardList.get(2).writeDate);
	
	Board b0 = new Board(0, "제목0", "내용0", "관리자", LocalDateTime.now() );
	boardList.add(0,b0);
	//최경미가 있습니까?
	//1단계 최경미가 있는 클래스 주소를 찾아야됨
	//2단계 클래스 주소가 링크드리스트에 있는지 찾아야 됨
	
	//1단계
	Board fdAd = null; 	//찾는 사람의 주소를 담을 변수
	
	for(int i=0; i <boardList.size(); i++) {
		System.out.println(boardList.get(i).writer);
		if(boardList.get(i).writer.equals("최경미")) {
			System.out.println("있습니다");
			//주소를 변수에 담는다
			fdAd = boardList.get(i);
		}
	}
	//최경미씨의 게시글 내용을 찾기
	System.out.println("찾는사람 최경미씨가 작성한 게시글 내용은 ? "+ fdAd.content);
	
	//게시글 번호 2번의 게시글 작성자는 누구인가요? 답은" 이순신"
	for(int i=0; i<boardList.size(); i++) {
		System.out.println(boardList.get(i).no); //전체 게시글번호
		if(boardList.get(i).no == 2) {
			fdAd = boardList.get(i);
		}
	}
	System.out.println(fdAd.writer);
	
	//이순신을 삭제하기 
	//1단계 이순신이 있는 주소를 찾아서 주소를 지우기
	for(int i=0; i<boardList.size(); i++) {
		
		if(boardList.get(i).writer.equals("이순신")) {
			fdAd = boardList.get(i);
			System.out.println(fdAd + "^^");
		}
	}
	//2단계 주소를 삭제하기.remove
	boardList.remove(fdAd);
	
	//모든 게시판 내용 출력하기
	for(int i = 0 ;  i<boardList.size(); i++) {
		System.out.println(boardList.get(i).toString());
		//주소를 출력하면 자동으로 ".toString()"이 자동으로 붙는다.
		//toString은 Object의 메소드입니다.
	}
	
	
	
	}	
}




//게시판 클래스
class Board{
	int no;						//게시판번호
	String title;				//제목
	String content;				//내용
	String writer;				//작성자
	LocalDateTime writeDate;	//작성일
	
	
	public Board(int no, String title, String content, String writer, LocalDateTime writeDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
	//모든 클래스의 부모는 Object이고 자식클래스인 Board에서 수정한것이다.
	//원래 출력될 문구는 : object주소 javaApp2.Board@4ca8195f 
	//주소 대신 내가 넣고싶은 내용을 @Override해서 수정해준것.
	@Override
	public String toString() {
		return "번호" + no + "제목" + title + "내용" + content + "작성자" + writer + "작성일" + writeDate; 
	}
}