package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
	//1.Board Ŭ������ ��üȭ�� �ض�.
	Board b1 = new Board("ȫ�浿", "�ڹ�", "��ƴ�");
	Board b2 = new Board("�̼���", "���̽�", "����");
	Board b3 = new Board("ȫ�浿", "������", "���� �� �����");
	Board b4 = new Board("ȫ�浿", "������", "���� �� �����");
	Board b5 = new Board("�̼���", "�Ǵٽ�", "���� �� �����");
	
	//2.set�ȿ� �ּҸ� �־��.
	Set<Board> sb = new HashSet<Board>();
	
	sb.add(b1);
	sb.add(b2);
	sb.add(b3);
	sb.add(b4);
	sb.add(b5);
	
	//3.����� ������?
	System.out.println(sb.size());
	
	//4.��ü����ϱ�
	//�ۼ��ڿ� ������ ������ ������� hashCode()�� ������ ��������� Ȯ���� ����. / equals()���� ������ ���ü�̴�.
	//��� ����ϱ� �ּҷ�
	Iterator<Board> it = sb.iterator();
	while(it.hasNext()) {//it�ӿ� �����͸� ������ �ֽ��ϱ�?
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
	public int hashCode() { //���ä
		return title.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) { // ���ϴ°� 
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