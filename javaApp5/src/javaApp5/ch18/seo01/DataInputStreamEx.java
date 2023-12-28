package javaApp5.ch18.seo01;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
	//�⺻Ÿ������ ������ϴ°� �����ִ� ���� ��Ʈ��
		
	try {
		OutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\p.db");
		DataOutputStream dos = new DataOutputStream(op);
		
		//�ֽ�Ʈ������ UTF�� ��� ���� ��Ʈ������ ��¹޴´�.
		//�ѱ��� �����ϴ¿뵵
		dos.writeUTF("ȫ�浿");  
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("���ڹ�");  
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		
		InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\p.db");
		//������Ʈ��
		BufferedInputStream bis = new BufferedInputStream(ip);
		DataInputStream dis = new DataInputStream(bis);
		
		//ȫ�浿 ����ϱ�.
		String name = dis.readUTF();
		double score = dis.readDouble();
		int no = dis.readInt();
		System.out.println(name + " " + score + " " + no );
		
		//���ڹ� ����ϱ�.
		name = dis.readUTF();
		score = dis.readDouble();
		no = dis.readInt();
		System.out.println(name + " " + score + " " + no );
		
		dis.close();
		bis.close();
		ip.close();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
