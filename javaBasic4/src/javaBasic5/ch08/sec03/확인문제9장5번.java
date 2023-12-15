package javaBasic5.ch08.sec03;

public class Ȯ�ι���9��5�� {
	
	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound() );
	}

	
	public static void main(String[] args) {
		Remocon r = new TV(); //������Ų TVŬ������ Remocon�̶�� �������̽��� �޴´�
		r.powerOn();
	
		printSound(new Cat()); 
		printSound(new Dog());
		
		
	}
	
}

interface Soundable{ //interface��� Ŭ������ �����ϴ� Ŭ������
	public String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "�߿�";
	} //�������������� �߻�޼ҵ带 �޾Ƽ�. >add @override���ָ�ȴ�.
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "�۸�";
	}
	
}


interface Remocon{
	public void powerOn(); //�߻�޼ҵ�
}
class TV implements Remocon { // TV��� Ŭ������ RemoconŬ������ �����϶�

	@Override // �߻�޼ҵ�
	public void powerOn() {
		System.out.println("TV�� �մϴ�");
	}
	
}