package javaBasic2.ch05.sec02;

public class ����Ÿ��2 {

	public static void main(String[] args) {
		
	//AŬ������ ���޸𸮿� �ø��� �������� aAddres
	A aAddr = new A();		//���� ��� 5������� �ϸ�
	
	//ȫ�浿 �Է� 
	aAddr.name = "ȫ�浿";
	aAddr.kor = 100;
	aAddr.avg = 3.5;
	
	//���� 147��
	
	A aAddr2 = new A();		//���� ��� 10������� �ϸ�
	
	System.out.println(aAddr == aAddr2); // 5���� , 10������ �ٸ��� ��µȴ�.
	
	A aAddr3 = aAddr2;		//10������ aAddr3�̶�� ������ �־��
	System.out.println(aAddr3 == aAddr2); //true
	System.out.println(aAddr3 == aAddr2);//false.
	
	
	
	}

}
