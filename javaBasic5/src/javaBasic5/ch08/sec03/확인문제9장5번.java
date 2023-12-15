package javaBasic5.ch08.sec03;

public class 확인문제9장5번 {
	
	public static void printSound(Soundable soundable){
		System.out.println(soundable.sound() );
	}

	
	public static void main(String[] args) {
		Remocon r = new TV(); //구현시킨 TV클래스를 Remocon이라는 인터페이스가 받는다
		r.powerOn();
	
		printSound(new Cat()); 
		printSound(new Dog());
		
		
	}
	
}

interface Soundable{ //interface라는 클래스는 역할하는 클래스다
	public String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		return "야옹";
	} //에러나는이유는 추상메소드를 받아서. >add @override해주면된다.
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}
	
}


interface Remocon{
	public void powerOn(); //추상메소드
}
class TV implements Remocon { // TV라는 클래스는 Remocon클래스를 구현하라

	@Override // 추상메소드
	public void powerOn() {
		System.out.println("TV를 켭니다");
	}
	
}