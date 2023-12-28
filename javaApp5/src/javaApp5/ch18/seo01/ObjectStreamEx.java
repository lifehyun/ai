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

//★ 객체 스트림 ★
public class ObjectStreamEx {

	public static void main(String[] args) {
		//Member클래스의 형태를 스트림으로 만들어서 외부로 보내기.
		try {
			FileOutputStream op = new FileOutputStream("D:\\AI\\study\\java_study\\data\\member.dat");
			BufferedOutputStream bos = new BufferedOutputStream(op);
			ObjectOutputStream oos = new ObjectOutputStream(bos); //객체를 스트림으로 만들기
			
			Member mb1 = new Member("fall", "단풍이", 10); //일반함수라서 오류 : java.io.NotSerializableException
			
			oos.writeObject(mb1);
			oos.flush();
			oos.close();
			
			//외부파일을 읽어서
			InputStream is = new FileInputStream("D:\\AI\\study\\java_study\\data\\member.dat");
			//성능속도를 향상시켜서 
			BufferedInputStream bis = new BufferedInputStream(is);
			//스트림을 객체로 만들어서
			ObjectInputStream ois = new ObjectInputStream(bis);
			//읽어와서
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

class Member implements Serializable { //일반객체를 object객체화를 하려면 :Member class에 구현,직렬화를 해주어야한다.
	
	//멤버의 필드
	String id;
	String name;
	int age ;
	
	//생성자 생성
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