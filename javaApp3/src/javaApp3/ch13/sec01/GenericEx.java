package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
	//제네릭이란? 나중에 형을 정하는것	
	//해당하는 박스에 원하지 않는 자료 들어가는것을 방지
	Box<Integer> intBox = new Box<Integer>();
	intBox.content = 100;
	
	Box<String> strBox = new Box<String>();
	strBox.content = "홍길동";
//	strBox.content = 12.5; string 박스여서 못들어감.
	
	
	BoxChild<Integer,String> bc = new BoxChild<Integer,String>();
	bc.content = 10;
	bc.kind = "aaa";
	
	InterImpl<Double> itl = new InterImpl<Double>();
	InterImpl<Boolean> it2 = new InterImpl<Boolean>();
	
	}

}

class Box<T>{
	
	T content; //내용을 담을 (변수,정수,문자열,객체 ... 아직정해지지않음)
}

class BoxChild<T,K> extends Box<T>{
	K kind;
}

interface Inter<A>{
	A method1();
}

class InterImpl<A> implements Inter<A>{

	@Override
	public A method1() {
		return null;
	}
	
}



