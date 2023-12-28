package javaApp5.ch18.seo01;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
	//기본타입으로 입출력하는걸 도와주는 보조 스트림
		
	try {
		OutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\p.db");
		DataOutputStream dos = new DataOutputStream(op);
		
		//주스트림에는 UTF가 없어서 보조 스트림으로 출력받는다.
		//한글을 저장하는용도
		dos.writeUTF("홍길동");  
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");  
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();
		
		
		InputStream ip = new FileInputStream("D:\\AI\\study\\java_study\\data\\p.db");
		//보조스트림
		BufferedInputStream bis = new BufferedInputStream(ip);
		DataInputStream dis = new DataInputStream(bis);
		
		//홍길동 출력하기.
		String name = dis.readUTF();
		double score = dis.readDouble();
		int no = dis.readInt();
		System.out.println(name + " " + score + " " + no );
		
		//김자바 출력하기.
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
