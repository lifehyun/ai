package javaBasic2.ch05.sec03;

import java.util.Calendar;

public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null;	//�����̶�� ������ ��Ű��� ���ſ� ���� �����̴�.
		
		Calendar cal = Calendar.getInstance();	//��¥�� �̿��� �� �ִ�.
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);		//5�� ���������� : �Ͽ�ȭ������� 1234567 �ؼ� ���� ��¥�� ������̶�
		
		System.out.println(Week.THURSDAY);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		
		System.out.println(today);
		
		int[]array; 
		//array= {1,2,3};
		array = new int[3];
		array[0] = 1;
		array[0] = 2;
		array[0] = 3;
		
		
		int[]array1 ={1,2,3};
		int[]array2 = new int[3];
		int[][]array3 = new int[3][2];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
