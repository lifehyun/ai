package javaApp5.ch18.seo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//입력스트림
public class ReaderEx01 {

	public static void main(String[] args) {
		try {
			
			InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\d.jpg");
			OutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\d_copy.jpg");
			
			byte[] bArr = new byte[100]; 	//100바이트의 배열이 만들어짐
			byte[] wArr = new byte[100];
			while (true) {
				int data = ip.read(); 		//한번에 가지고올때 배열만큼가져온다.
				if(data == -1) break;		//만약에 데이터의 값이 쭉흘러가다가 -1이면 리턴해라. , -1은 데이터의 끝이라는 의미
				op.write(data);
			}
			op.flush();
			op.close();
			ip.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
