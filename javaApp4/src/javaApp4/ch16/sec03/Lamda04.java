package javaApp4.ch16.sec03;
//p706
public class Lamda04 {

	public static void main(String[] args) {
		Person ps = new Person();
		Calcuable calcuable = new Calcuable() { 
		
		//���1:interface�� �ڵ����� ���α׷����� �Ѵ�.
		@Override
		public double calc(double x, double y) {
			Computer.staticMethod(x, y);
			return 0;
		}
	};
		//���2:���ٽ����� ����
		//Calcuable calcuable = (double x , double y) -> { Computer.staticMethod(x, y); return 0;}; 
	
		//���3:{} , return 0; ���� ��������
		//Calcuable calcuable = ( x, y)-> Computer.staticMethod(x, y); 
		
		//���4:�Ű����� �޼ҵ� ���� 
		Calcuable calcuable1 = Computer::staticMethod;
		//�������̽�   �� ��    =  Ŭ������ :: Ŭ�����ȿ� �ִ� �޼ҵ��
		//�������̽��� �߻�޼ҵ�� �Է��Ͽ� Ŭ�����ȿ� �ִ� �޼ҵ带 ����(���) ����϶�
	
		//personŬ������ action�żҵ带 ȣ���Ϸ��� Calcuable �Ű������� ���� �����;��ϰ� �װ��� �������̽��� calc�̰�, Computer�� ���̴�
		ps.action(calcuable1);
		
		Computer cp= new Computer();
		//���2-1 �͸� ���� ��ü - ���� Computer.instanceMethod()�� ȣ���϶�.
		Calcuable calcuable11 = new Calcuable() {
			
			@Override
			public double calc(double x, double y) {
				return cp.instanceMethod(x,y); //���� Computer.instanceMethod()ȣ���϶�.
			}
		};
		
		//���2-2 ���ٽ�
		//Calcuable calcuable1 = (double x , double y)-> {return cp.instanceMethod(x,y);};/		
		//Calcuable calcuable1 = ( x ,  y)-> cp.instanceMethod(x,y);
		//x,y ���� ���� ȭ��ǥ �ڿ� ������ ����ȴ�.
		//���2-3 �� �����ϰ� ����
		Calcuable calcuable111 = cp::instanceMethod;
		
		ps.action(calcuable111);
		
		
	
	 
	 
		
	}

}
//@������̼� �ٷ� �Ʒ��� �ִ� ��ü�� �Ӽ��� �����Ѱ�.
@FunctionalInterface
interface Calcuable { 
	double calc(double x , double y );	//�߻�޼ҵ� 1��
}

class Person{
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10,4);
		System.out.println("���: " + result);
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




