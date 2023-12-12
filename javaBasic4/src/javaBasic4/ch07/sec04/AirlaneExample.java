package javaBasic4.ch07.sec04;
//부모클래스
public class AirlaneExample {

	public static void main(String[] args) {
		
	SupersonAirlane sa = new SupersonAirlane();
	sa.takeOff();
	sa.fly();
	sa.flyMode = SupersonAirlane.SUPERSONIC;
	sa.fly();
	sa.flyMode = SupersonAirlane.NORMAL;
	sa.fly();
	sa.flyMode = SupersonAirlane.ROUND;
	sa.fly();
	sa.flyMode = SupersonAirlane.SLOW;
	sa.land();
	
	
	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
