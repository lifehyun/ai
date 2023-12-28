package javaApp4.ch16.sec03;
//p706
public class Lamda04 {

	public static void main(String[] args) {
		Person ps = new Person();
		Calcuable calcuable = new Calcuable() { 
		
		//방법1:interface를 자동으로 프로그래밍을 한다.
		@Override
		public double calc(double x, double y) {
			Computer.staticMethod(x, y);
			return 0;
		}
	};
		//방법2:람다식으로 변경
		//Calcuable calcuable = (double x , double y) -> { Computer.staticMethod(x, y); return 0;}; 
	
		//방법3:{} , return 0; 값도 생략가능
		//Calcuable calcuable = ( x, y)-> Computer.staticMethod(x, y); 
		
		//방법4:매개변수 메소드 참조 
		Calcuable calcuable1 = Computer::staticMethod;
		//인터페이스   변 수    =  클래스명 :: 클래스안에 있는 메소드명
		//인터페이스의 추상메소드로 입력하여 클래스안에 있는 메소드를 수행(결과) 출력하라
	
		//person클래스에 action매소드를 호출하려면 Calcuable 매개변수의 값을 가져와야하고 그값은 인터페이스에 calc이고, Computer의 값이다
		ps.action(calcuable1);
		
		Computer cp= new Computer();
		//방법2-1 익명 구현 객체 - 내용 Computer.instanceMethod()를 호출하라.
		Calcuable calcuable11 = new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return cp.instanceMethod(x,y); //내용 Computer.instanceMethod()호출하라.
			}
		};
		
		//방법2-2 람다식
		//Calcuable calcuable1 = (double x , double y)-> {return cp.instanceMethod(x,y);};/		
		//Calcuable calcuable1 = ( x ,  y)-> cp.instanceMethod(x,y);
		//x,y 값이 들어가면 화살표 뒤에 문장이 실행된다.
		//방법2-3 더 간단하게 수식
		Calcuable calcuable111 = cp::instanceMethod;
		
		ps.action(calcuable111);
		
		
	
	 
	 
		
	}

}
//@어노테이션 바로 아래에 있는 객체의 속성을 제한한것.
@FunctionalInterface
interface Calcuable { 
	double calc(double x , double y );	//추상메소드 1개
}

class Person{
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10,4);
		System.out.println("결과: " + result);
	}
}

class Computer{
	public static double staticMethod(double x , double y) {
		return x + y;
	}
	
	public double instanceMethod(double x , double y) {
		return x * y;
	}
}




