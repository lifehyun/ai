package javaApp3.ch13.sec01;

public class GenericEx {

	public static void main(String[] args) {
	//���׸��̶�? ���߿� ���� ���ϴ°�	
	//�ش��ϴ� �ڽ��� ������ �ʴ� �ڷ� ���°��� ����
	Box<Integer> intBox = new Box<Integer>();
	intBox.content = 100;
	
	Box<String> strBox = new Box<String>();
	strBox.content = "ȫ�浿";
//	strBox.content = 12.5; string �ڽ����� ����.
	
	
	BoxChild<Integer,String> bc = new BoxChild<Integer,String>();
	bc.content = 10;
	bc.kind = "aaa";
	
	InterImpl<Double> itl = new InterImpl<Double>();
	InterImpl<Boolean> it2 = new InterImpl<Boolean>();
	
	}

}

class Box<T>{
	
	T content; //������ ���� (����,����,���ڿ�,��ü ... ����������������)
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



