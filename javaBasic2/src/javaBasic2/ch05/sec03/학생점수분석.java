package javaBasic2.ch05.sec03;

import java.util.Scanner;

public class �л������м� {
	//p198.9������
	public static void main(String[] args) {
	//Ű���� �л� �� �Է�, �л��� ���� �Է� �޴´�.
	Scanner sc	= new Scanner(System.in); 
	
	
	int menu = 1; 			//���ú���
	int studentCount = 0; 	//�л���
	int[] score = null; 	//�迭����
	int max = 0;			//�ְ�����
	int sum = 0; 			//�հ�����
	double avg = 0.0; 		//�������
	
	
	while(menu !=5) {	//menu �� 5�� �ƴϸ� �����ּ���
		System.out.println("--------------------------------------------------");
		System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4.�м� | 5.���� ");
		System.out.println("--------------------------------------------------");
		System.out.print("����>");
		menu = sc.nextInt();
		switch(menu) {
		case 1: System.out.println("�л���>");
				studentCount = sc.nextInt();
				score = new int[studentCount];
				break;		
		case 2: for(int i=0; i<score.length; i++) {
				System.out.println("score["+ i +"]>");
				score[i] = sc.nextInt();
		}
				break;
		case 3:	for(int i=0; i < score.length; i++) {
				System.out.println("score[" + i + "]:"+ score[i]);
		}
				break;
		case 4: //�ְ�����, ��ձ��ϱ� 
				for(int i=0; i<score.length; i++) {
					sum = sum + score[i];
				if(max < score[i])  				//ó���ҹ����� �ϳ��ۿ������� {}��������
					max = score[i];
				}
				avg = sum / (double) score.length;
				
				System.out.println("�ְ�����"+max);
				System.out.println("�����"+avg);
			
		case 5:	System.out.println("���α׷� ����");
		default:System.out.println("���ü��� 1~5�߿� �Է��� �ּ���.");
		}
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
