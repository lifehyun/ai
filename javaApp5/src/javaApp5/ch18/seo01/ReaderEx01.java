package javaApp5.ch18.seo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//�Է½�Ʈ��
public class ReaderEx01 {

	public static void main(String[] args) {
		try {
			
			InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\d.jpg");
			OutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\d_copy.jpg");
			
			byte[] bArr = new byte[100]; 	//100����Ʈ�� �迭�� �������
			byte[] wArr = new byte[100];
			while (true) {
				int data = ip.read(); 		//�ѹ��� ������ö� �迭��ŭ�����´�.
				if(data == -1) break;		//���࿡ �������� ���� ���귯���ٰ� -1�̸� �����ض�. , -1�� �������� ���̶�� �ǹ�
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
