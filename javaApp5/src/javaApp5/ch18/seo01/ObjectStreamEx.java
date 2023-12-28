package javaApp5.ch18.seo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//�� ��ü ��Ʈ�� ��
public class ObjectStreamEx {

	public static void main(String[] args) {
		//MemberŬ������ ���¸� ��Ʈ������ ���� �ܺη� ������.
		try {
			FileOutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(op);
			ObjectOutputStream oos = new ObjectOutputStream(bos); //��ü�� ��Ʈ������ �����
			
			Member mb1 = new Member("fall", "��ǳ��", 10); //�Ϲ��Լ��� ���� : java.io.NotSerializableException
			
			oos.writeObject(mb1);
			oos.flush();
			oos.close();
			
			//�ܺ������� �о
			InputStream is = new FileInputStream("D:\\AI\\study\\java_study\\data\\member.dat");
			//���ɼӵ��� �����Ѽ� 
			BufferedInputStream bis = new BufferedInputStream(is);
			//��Ʈ���� ��ü�� ����
			ObjectInputStream ois = new ObjectInputStream(bis);
			//�о�ͼ�
			Member iM = (Member) ois.readObject();
	 		System.out.println(iM);
			
	 		
			is.close();
			bis.close();
			ois.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

class Member implements Serializable { //�Ϲݰ�ü�� object��üȭ�� �Ϸ��� :Member class�� ����,����ȭ�� ���־���Ѵ�.
	
	//����� �ʵ�
	String id;
	String name;
	int age ;
	
	//������ ����
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id + " " + name + " " + age; 
	}
}