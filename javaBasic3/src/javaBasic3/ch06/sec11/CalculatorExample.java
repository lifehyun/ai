package javaBasic3.ch06.sec11;

public class CalculatorExample {

	public static void main(String[] args) {
		
	Calculator ������ = new Calculator();
		
	������.powerOn();
	������.powerOff();		
	int �������ϱ�;
	
	������.plus(6, 8);
	System.out.println(������.plus(6, 8));
		
	//���� -50 , -100 ���ϱ��ض�	
	int ����� = ������.plus(-50, -100);
	System.out.println(�����);
	
	//���� 100,200,300���ϱ�
	�������ϱ� = ������.plus(100, 200);
	�������ϱ� = ������.plus(�������ϱ�, 300);
	System.out.println(�������ϱ�);
	
	
	// B��� ���� �޼ҵ��� �Ű������� 3���� ����� �ΰ�
	�������ϱ� = ������.plus(100, 200 ,300);
	System.out.println(�������ϱ�);
		
	/// 234 int sum(int ...values)	�������� ������ �־���Ҷ� ����Ѵ�
	
	}

}
