package javaBasic.ch03.sec02;

public class Ȯ�ι���3�� {
 // ���� 107��
	public static void main(String[] args) {	
	//1�� 
	int x = 10;
	int y = 20;
	int z = (++x) +(y--);
	System.out.println(z);
	
	//2��
	int score = 85;
	String result = (! (score>90) )? "��":"��";
	System.out.println(result);
	
	//3��
	
	int pencils = 534;
	int students = 30;
	
	//�л� �Ѹ��� ������ ���ʼ�
	int pencilsperStudent =(pencils / students);
	System.out.println(pencilsperStudent);
	
	//���� ���ʼ�
	int pencilsLeft = (pencils % students);
	System.out.println(pencilsLeft);
	
	//4��
	
	int value = 356;
	//3.56
	double r1 = value / 100.0;
//	System.out.println(r1); // 300
//	
//	int r2 = (int)r1; // 3
//	System.out.println(r2);
//	
//	int r3 = (int)r1; * 100;
//	System.out.println(r3); */

	System.out.println(    (int)(value/100.3)*100        );
	
	//5�� 
	int lengthTop = 5;
	int lengthBottom = 10;
	int height = 7;
	double area =(double)((lengthTop+lengthBottom)*height /2);
	System.out.println(area);
	
	//6��
	int x1 = 10;
	int y1 = 5;
	
	System.out.println(( x1 > 7 && y1 <= 5) ); // �� �׸��� ��
	System.out.println((x1 % 3 == 2)||(y1 %2 != 1) ); // ���� �Ǵ� ����
	
	//���� �����Ҷ� ù���ڴ� ������ �ҹ���,
	//������ �����Ҷ��� �ǹ��ִ� ���ڷ� �ܾ��
	
	//7��
	// NaN NOT a Number ���ڰ� �ƴϴ� ���� �� ���̴� 
	//nan �̸� �� nan �ƴϸ� ����
	
	
	double x2 = 5.0;
	double y2 = 0.0;
	double z2 = 5 % y2 ;
	System.out.println(z2);
	if ( Double.isNaN(z2) ) {
		System.out.println("0.0���� ���� �� �����ϴ�");
	} else {
	 double result2 = z +10;
	 System.out.println("���: "+ result);
	};

	
	}
	
	}
	
