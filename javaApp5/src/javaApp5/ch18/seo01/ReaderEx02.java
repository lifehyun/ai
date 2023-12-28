package javaApp5.ch18.seo01;

import java.io.*; //*은 모든것


//문자스트림 읽어오기
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
		w.write("abcdef"); 	//String형으로 사용
		//w.write(cArr);		//char형으로 사용
		w.write(65);		//int형으로 사용 65 : 유니코드로 "A"를 뜻함.
		
		w.flush();
		w.close();
		
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
		
		
	}

}
