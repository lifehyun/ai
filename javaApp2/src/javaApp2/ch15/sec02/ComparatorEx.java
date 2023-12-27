package javaApp2.ch15.sec02;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
	//1.new 객체 생성
	Fruit f1 = new Fruit("포도", 3000);
	Fruit f2 = new Fruit("수박", 10000);
	Fruit f3 = new Fruit("딸기", 6000);
	//2.TreeSet에 주소생성한다.

	TreeSet<Fruit> ts= new TreeSet<Fruit>(new FruitCom());
	//3.호출하기
	ts.add(f1);
	ts.add(f2);
	ts.add(f3);
	
	//전체출력하기
	for (Fruit t : ts) {
		System.out.println(t.name + " " + t.price);
	}
	
	
	}
}

//과일 객체
class Fruit {
	String name;	//과일명
	Integer price;	//과일가격
	
	public Fruit(String name, Integer price) {
		super(); //5.부모클래스 호출
		this.name = name;
		this.price = price;
	}
}


//클래스만 설계 : TreeSet에 객체를 연결해야한다. 
//비교할 대상(코드)만 구현 
class FruitCom implements Comparator<Fruit>{

	@Override //가격순으로 트리에 달아줌.
	public int compare(Fruit o1, Fruit o2) {
		return o1.price.compareTo(o2.price);
	}

}

//	@Override //과일명순으로 트리에 달아줌.
//	// o1:트리에 달려있는자료 (포도) , o2:트리에 달아줄 자료 (수박)
//	public int compare(Fruit o1, Fruit o2) {
//		return o1.name.compareTo(o2.name);
//	}
//	

//TreeSet<Fruit> ts = new TreeSet<Fruit>(); 그전에 쓰던 방법.
//원래 썻던 방법.
//Fruit class implements Comparable<Fruit>
//@Override
//public int compareTo(Fruit o) {
//return name.compareTo(o.name);
//}