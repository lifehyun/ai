package javaApp5.ch18.seo01;

import java.io.*; //*�� ����


//���ڽ�Ʈ�� �о����
public class ReaderEx02 {

	public static void main(String[] args) {
		
		try {
		
		char[] cArr = new char[100];
		Reader r = new FileReader("D:\\AI\\study\\java_study\\data\\test3.txt"); 
		while(true) {
		int data = r.read(cArr);
		if (data == -1 )break;
		for (int i = 0; i < data; i++) {
			System.out.print((char)cArr[i]);
			}
		}
		r.close();
		
		Writer w = new FileWriter("D:\\AI\\study\\java_study\\data\\test4.txt");
		w.write("abcdef"); 	//String������ ���
		//w.write(cArr);		//char������ ���
		w.write(65);		//int������ ��� 65 : �����ڵ�� "A"�� ����.
		
		w.flush();
		w.close();
		
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
		
		
	}

}
