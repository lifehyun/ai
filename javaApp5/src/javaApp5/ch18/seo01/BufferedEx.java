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
	// 입출력의 성능을 높여주고 싶은경우 Buffered~ 보조 스트림 클래스를 사용한다.
		//바이트기반 , 문자기반 두가지로 나누어져 있다.
		//바이트기반 : file input Stream ,output Stream 
		//문자기반: ~ read 
		
		//buffer안낀 [ip] 186700 
		//buffer낀 	[bis] 53100 nano second
		
		
		try {
			//주스트림
			InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\test3.txt");
			//보조스트림 : 주스트림의 성능을 높일때.
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
			
		
			System.out.println("파일 읽고 쓰는데 걸린 시간은? (나노초) "+ (stopTime - startTime));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
