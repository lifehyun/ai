package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class ���ڿ����� {

	public static void main(String[] args) {
		
		String title="�ڹ������α׷���";	//���ڿ���ü
		String title2= new String("�ڹ����α׷���");
		//���� String title1,2 ����� �ٸ����� ǥ�õǴ°� �����ϴ�.
		
		
		System.out.println(title2.length());
		System.out.println(title2.charAt(1));
		//"��"�� ����ϱ�
		System.out.println(title2.charAt(6));
		title2 =title2.replace("�ڹ�","java");
		System.out.println(title2);
		
		System.out.println(title2.substring(4,8) );
		
		//"�ڹ�"�� ����ϱ�
		System.out.println(title.substring(0, 2));
		//"��" �ε�����ȣ �˱�
		System.out.println(title.indexOf("��")); //6��°
		//"��" �ε�����ȣ �˱�
		System.out.println(title.indexOf("��")); //3��°
		
		System.out.println(title.indexOf("��",0)); //-1�̶�� ���� **
		
		
		String names = "ȫ�浿,�̼���,�ֹο�";
		String [] nameArr = names.split(",");
		
		for(int i=0; i<nameArr.length ; i++) {
			System.out.println(nameArr[i]);
		}
		
		String fruits = "���-��-��-�ٳ���" ;
		String [] fruit = fruits.split("-");
		
		//���� for��
		//���� for( Ÿ�� ���� : ����) {�ݺ��� ����}	
		for( String f  : fruit ) {
			System.out.println(f);
		}
		
		// �����߿��� ������ �ֳ���? �����
		// ����ֳ���?��
		
		//Ű���� �Է��ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� ��Ƿ���?");
		String order =sc.nextLine();
		boolean flag = false; 				//������ �ִ��� ������ üũ�ϴ� ����
		for(String f: fruit ) {
		if(order.equals(f)) {
			System.out.println("�ֽ��ϴ�.");
			flag = true;
			break;
		}
		}
		if(!flag)System.out.println("�����ϴ�"); 		//���Ͻ� true 
	}

}
