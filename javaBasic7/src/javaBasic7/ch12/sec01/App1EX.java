package javaBasic7.ch12.sec01;

import java.lang.module.ModuleDescriptor;
import java.text.DateFormat;
import java.util.Date; // leng���ִ� ��Ű���� �ƴϱ⶧���� import�� �ؾ��Ѵ�.
import java.util.Scanner;
import java.util.StringTokenizer;

public class App1EX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "abcde";
		int aHashCode = a.hashCode();
		System.out.println(aHashCode);
		double pi = Math.PI;
		System.out.println(pi);
		double e = Math.E;
		System.out.println(e);
		double COS = Math.cos(45.0);
		System.out.println(COS);
		
		
		
		// static�� ���°��
		Date date = new Date();	
		int date1 = date.getDate(); // �� - ���ִ� ������ Deprecated. �ʹ� �����Ǿ �׷��� ������� ���ƶ��� �����س���
		System.out.println(date1); //��°� 19 : ���ó�¥
		// getTime����ض�
		long time1 = date.getTime();
		System.out.println(time1);
		long date2 = Date.parse("2023/12/19");
		System.out.println(date2);
		//DateFormat.parse("2023/12/19");
		String text = "ab/cd/ef";
		StringTokenizer st = new StringTokenizer("ab/cd/ef/","/");
		int count = st.countTokens();
		System.out.println(count); //��°�:3���̷��� ab/cd/ef��� �������
		String token1= st.nextToken();
		System.out.println(token1);
		token1= st.nextToken();
		System.out.println(token1);
		token1= st.nextToken();
		System.out.println(token1);
//		token1= st.nextToken();
//		System.out.println(token1); 
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


