package javaBasic7.ch12.sec04;
//P524
public class WrapperEx {

	public static void main(String[] args) {
	// �ڷ��� �⺻�� byte char int long boolean, float double ������ String Ŭ������ ����
	// �⺻���� Ŭ������ �ƴϹǷ� �̸� ������� �޼ҵ尡 ����. �׷��� �⺻�� �ڷ����� Ŭ������ ����� �а� �ִ�.
	// �ڽ� �⺻�� : ��ü, ��ڽ� ��ü :�⺻��
	Integer a = 10 ;
	Integer a1 = new Integer(10);
	String as = a.toString(); // toString�̶� �Լ��� �ٲ��ش� int�� 10�� String"10"���� ����
	
	double da = a.doubleValue(); //.doubleValue�� �Ǽ��� �ٲ��
	System.out.println(da);
	System.out.println(a.MAX_VALUE); //IntegerŬ������ ����ū���� ����� ���϶�.
	System.out.println(a.MIN_VALUE); //IntegerŬ������ ������������ ����� ���϶�.
	System.out.println(a.SIZE);
	
	//3.14 �� �������� "3.14"�� �ٲ��
	Double b = 3.14; 
	//double���� �ִ밪��?
	System.out.println(b.MAX_VALUE);
	//double���� �������?
	System.out.println(b.SIZE);
	//10.1 , 5.4 �ִ밪����ϱ�
	System.out.println(b.max(10.1,5.4));
	
	}

}
