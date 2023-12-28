package javaApp5.ch18.seo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedEx {

	public static void main(String[] args) {
	// ������� ������ �����ְ� ������� Buffered~ ���� ��Ʈ�� Ŭ������ ����Ѵ�.
		//����Ʈ��� , ���ڱ�� �ΰ����� �������� �ִ�.
		//����Ʈ��� : file input Stream ,output Stream 
		//���ڱ��: ~ read 
		
		//buffer�ȳ� [ip] 186700 
		//buffer�� 	[bis] 53100 nano second
		
		
		try {
			//�ֽ�Ʈ��
			InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\test3.txt");
			//������Ʈ�� : �ֽ�Ʈ���� ������ ���϶�.
			BufferedInputStream bis = new BufferedInputStream(ip);
			
			OutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\copy_test3.txt");
			BufferedOutputStream bos = new BufferedOutputStream(op);
			
			long startTime = System.nanoTime();
			
			while(true) {
				int data = bis.read();
				if(data == -1) break;
				bos.write(data);
			}
			long stopTime = System.nanoTime();
			
			bos.flush();
			bos.close();
			bis.close();
			op.close();
			ip.close();
			
		
			System.out.println("���� �а� ���µ� �ɸ� �ð���? (������) "+ (stopTime - startTime));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
