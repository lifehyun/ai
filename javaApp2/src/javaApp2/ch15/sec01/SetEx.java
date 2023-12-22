package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//p649
public class SetEx {

	public static void main(String[] args) {
	//Set Ư¡: �ߺ��� ��Ҹ� �����Ѵ�.�ߺ�������� �ʴ´�.
	Set<Integer> set = new HashSet<Integer>();  //�������� �ְ� �������� Integer
	
	set.add(10);
	set.add(50);
	set.add(80);
	set.add(10);
	
	
	//set�� ����ִ� ��ҵ��� �����ش�
	System.out.println(set.size()); 
	
	//��½� �ݺ��ڸ� ��� .iterator();
	Iterator<Integer> it = set.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());		//��°��� �������� �ƹ��ų� ����ϴ°��̴�.
	}
	
	
	//set�ȿ� 40�� �ֳ���? �ƴϿ�?
	System.out.println(set.contains(40));
	
	//set�ȿ� ��Ұ� ����ֳ���? �ƴϿ�
	System.out.println(set.isEmpty());
	
	//set�ȿ� 50�� ���켼��.
	set.remove(50);
	
	
	
	//���
	it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	//set�ȿ� ��� 100�� �߰��ϱ�
	set.add(100);
	
	//set�ȿ� ��� 80�� �����ϱ�
	set.remove(80);
	
	//����ϱ� ��½� iterator(); �ݺ��ڸ� ���
	it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
