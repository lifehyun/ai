package javaBasic4.ch07.sec04;

public class SupersonAirlane extends Airplane {

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public static final int ROUND = 3;
	public static final int SLOW = 4;
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�");
		}
		if(flyMode == ROUND) {
			System.out.println("ȸ�� �����մϴ�");
		}
		if(flyMode == SLOW) {
			System.out.println("õõ�� �����մϴ�");
		}else 	
			super.fly();	//super �θ�Ŭ����
		
	}
	
	
	
	
}
