package javaBasic7.ch12.sec04;

import java.util.StringTokenizer;

//p.523
public class StringTokenizerEx {

	public static void main(String[] args) {
		String data1 = "ȫ�浿&�̼�ȫ,�ڿ���"; //<�̷� ���ڰ� �ִ�.
		//���ȭ�� ��½� ȫ�浿 �̼�ȫ �ڿ����� ��µǰ��϶�.
		//���1)StringŬ������ �ִ� split()�Լ��� ¥����.
		//���2)StringTokenizerŬ���� ����Ѵ�.
		
		//���1)
		String[] arr = data1.split("&|,");
		for(int i = 0; i<arr.length; i++) { //������ ���̸� ����ض� . 
			System.out.println(arr[i]);
		}
		//����for�� ������ ����Ѵ�.
		for(String i : arr) {
			System.out.println(i);
		}
		
		//���2)
		String data2 = "ȫ�浿/�̼�ȫ/�ڿ���/�̼���/�ּ���";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		String data3 = "���-��-��-�ٳ���-����";
		StringTokenizer st1 = new StringTokenizer(data3,"-");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		String data4 = "�ڹ�*+���̽�*+����Ŭ*+�ټ��÷ξ�";
		StringTokenizer st2 = new StringTokenizer(data4, "*+");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
	}

}
