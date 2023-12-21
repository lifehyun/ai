package javaApp2;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
	LinkedList<Board> boardList = new LinkedList<Board>();
	
	Board b1 = new Board(1, "����1", "����1", "ȫ�浿", LocalDateTime.now() );
	Board b2 = new Board(2, "����2", "����2", "�̼���", LocalDateTime.now() );
	Board b3 = new Board(3, "����3", "����3", "�ְ��", LocalDateTime.now() );
	//ȣ���϶�� ����Ѱ�.
	//boardList�ȿ��� �ּҰ� �ִ�.
	boardList.add(b1);	
	boardList.add(b2);
	boardList.add(b3);
	//����϶�� get���� ����Ѱ�.
	System.out.println(boardList.get(0));			//b1�� ������������ ���´�.
	System.out.println(boardList.get(0).writer);	//b1�� �����������ȿ� writer�� ����϶�
	System.out.println(boardList.get(1).title);
	System.out.println(boardList.get(2).writer);
	//�ְ���� �ۼ����ڸ� ����϶�� ���
	System.out.println(boardList.get(2).writeDate);
	
	Board b0 = new Board(0, "����0", "����0", "������", LocalDateTime.now() );
	boardList.add(0,b0);
	//�ְ�̰� �ֽ��ϱ�?
	//1�ܰ� �ְ�̰� �ִ� Ŭ���� �ּҸ� ã�ƾߵ�
	//2�ܰ� Ŭ���� �ּҰ� ��ũ�帮��Ʈ�� �ִ��� ã�ƾ� ��
	
	//1�ܰ�
	Board fdAd = null; 	//ã�� ����� �ּҸ� ���� ����
	
	for(int i=0; i <boardList.size(); i++) {
		System.out.println(boardList.get(i).writer);
		if(boardList.get(i).writer.equals("�ְ��")) {
			System.out.println("�ֽ��ϴ�");
			//�ּҸ� ������ ��´�
			fdAd = boardList.get(i);
		}
	}
	//�ְ�̾��� �Խñ� ������ ã��
	System.out.println("ã�»�� �ְ�̾��� �ۼ��� �Խñ� ������ ? "+ fdAd.content);
	
	//�Խñ� ��ȣ 2���� �Խñ� �ۼ��ڴ� �����ΰ���? ����" �̼���"
	for(int i=0; i<boardList.size(); i++) {
		System.out.println(boardList.get(i).no); //��ü �Խñ۹�ȣ
		if(boardList.get(i).no == 2) {
			fdAd = boardList.get(i);
		}
	}
	System.out.println(fdAd.writer);
	
	//�̼����� �����ϱ� 
	//1�ܰ� �̼����� �ִ� �ּҸ� ã�Ƽ� �ּҸ� �����
	for(int i=0; i<boardList.size(); i++) {
		
		if(boardList.get(i).writer.equals("�̼���")) {
			fdAd = boardList.get(i);
			System.out.println(fdAd + "^^");
		}
	}
	//2�ܰ� �ּҸ� �����ϱ�.remove
	boardList.remove(fdAd);
	
	//��� �Խ��� ���� ����ϱ�
	for(int i = 0 ;  i<boardList.size(); i++) {
		System.out.println(boardList.get(i).toString());
		//�ּҸ� ����ϸ� �ڵ����� ".toString()"�� �ڵ����� �ٴ´�.
		//toString�� Object�� �޼ҵ��Դϴ�.
	}
	
	
	
	}	
}




//�Խ��� Ŭ����
class Board{
	int no;						//�Խ��ǹ�ȣ
	String title;				//����
	String content;				//����
	String writer;				//�ۼ���
	LocalDateTime writeDate;	//�ۼ���
	
	
	public Board(int no, String title, String content, String writer, LocalDateTime writeDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
	}
	
	//��� Ŭ������ �θ�� Object�̰� �ڽ�Ŭ������ Board���� �����Ѱ��̴�.
	//���� ��µ� ������ : object�ּ� javaApp2.Board@4ca8195f 
	//�ּ� ��� ���� �ְ���� ������ @Override�ؼ� �������ذ�.
	@Override
	public String toString() {
		return "��ȣ" + no + "����" + title + "����" + content + "�ۼ���" + writer + "�ۼ���" + writeDate; 
	}
}