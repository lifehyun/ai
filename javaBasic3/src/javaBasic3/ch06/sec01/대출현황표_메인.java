package javaBasic3.ch06.sec01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ������Ȳǥ_���� {
	
	public static void main(String[] args) {
		
		Date now = new Date(); //��¥�� �����ִ� ��ü�� ����Ѵ�.
		String nowTime = now.toString();
		System.out.println(nowTime);
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");	//��¥��� ���¸� ������ش�.
		System.out.println(sdf.format(now));//���� ��¥�� ������ش�. "2023-12-08"
		
	int[] iArr = {1,2,3}; //iArr�� ������ 123�̶�¹迭�� ������ ���ٴ� ��
	
	// ������ ��ü�� �����ϰ� ���븸 �ٸ��� �迭�� ����Ѵ�. 	
	// ����  : ���� > [�迭] > ������ > = {�߰�ȣ new ��üȭ}; (�迭ī��Ʈ�Ҷ���0,1,2,3)
	������Ȳǥ d1 = new ������Ȳǥ("J02-38","�̹���",new Date(),"�����ڱݴ���",27000000,48);
	������Ȳǥ d2 = new ������Ȳǥ("Y04-15","������",new Date(),"�������ݴ㺸����",3000000,36);
	������Ȳǥ d3 = new ������Ȳǥ("M02-06","��ö��",new Date(),"�������ſ����",22000000,36);
	������Ȳǥ d4 = new ������Ȳǥ("K03-05","�ν·�",new Date(),"�������ñ�ݴ���",15000000,60);
	
	
	������Ȳǥ[] dArr = {new ������Ȳǥ("J02-38","�̹���",new Date(),"�����ڱݴ���",27000000,48),
			          new ������Ȳǥ("Y04-15","������",new Date(),"�������ݴ㺸����",3000000,36),
			          new ������Ȳǥ("M02-06","��ö��",new Date(),"�������ſ����",22000000,36),
			          new ������Ȳǥ("K03-05","�ν·�",new Date(),"�������ñ�ݴ���",15000000,60)
					 }; //�̹���,������,��ö��,�ν·��̶�� ��ü�� dArr�� �Ѳ����� �� ���ִ�.
	
	//����ϱ�
	
	for(int i=0; i<dArr.length; i++) {
		System.out.println(dArr[i].get�����ȣ()+"  "+ dArr[i].get����()+"  "+ dArr[i].get������()+"  "+dArr[i].get��������()+""
				+ "  "+dArr[i].get����ݾ�());
	}
	
	//����ݾ��� ���� ���ϱ� 
	int ���������=0;
	int �Ⱓ����=0;
	
	for(int i=0; i<dArr.length; i++) {
		��������� = ���������+dArr[i].get����ݾ�();
		�Ⱓ���� = �Ⱓ����+dArr[i].get�Ⱓ();
	}
	double �Ⱓ��� = �Ⱓ����/ (double) dArr.length;
	
	
	
	System.out.println("����ݾ��� ����"+ ���������);
	System.out.println("�Ⱓ�� ���"+�Ⱓ���);
	
		
		
	}
}
