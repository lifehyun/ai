package javaApp2.ch15.sec02;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
	//1.new ��ü ����
	Fruit f1 = new Fruit("����", 3000);
	Fruit f2 = new Fruit("����", 10000);
	Fruit f3 = new Fruit("����", 6000);
	//2.TreeSet�� �ּһ����Ѵ�.

	TreeSet<Fruit> ts= new TreeSet<Fruit>(new FruitCom());
	//3.ȣ���ϱ�
	ts.add(f1);
	ts.add(f2);
	ts.add(f3);
	
	//��ü����ϱ�
	for (Fruit t : ts) {
		System.out.println(t.name + " " + t.price);
	}
	
	
	}
}

//���� ��ü
class Fruit {
	String name;	//���ϸ�
	Integer price;	//���ϰ���
	
	public Fruit(String name, Integer price) {
		super(); //5.�θ�Ŭ���� ȣ��
		this.name = name;
		this.price = price;
	}
}


//Ŭ������ ���� : TreeSet�� ��ü�� �����ؾ��Ѵ�. 
//���� ���(�ڵ�)�� ���� 
class FruitCom implements Comparator<Fruit>{

	@Override //���ݼ����� Ʈ���� �޾���.
	public int compare(Fruit o1, Fruit o2) {
		return o1.price.compareTo(o2.price);
	}

}

//	@Override //���ϸ������ Ʈ���� �޾���.
//	// o1:Ʈ���� �޷��ִ��ڷ� (����) , o2:Ʈ���� �޾��� �ڷ� (����)
//	public int compare(Fruit o1, Fruit o2) {
//		return o1.name.compareTo(o2.name);
//	}
//	

//TreeSet<Fruit> ts = new TreeSet<Fruit>(); ������ ���� ���.
//���� ���� ���.
//Fruit class implements Comparable<Fruit>
//@Override
//public int compareTo(Fruit o) {
//return name.compareTo(o.name);
//}