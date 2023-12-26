package javaApp1.ch12.sec05;

import java.io.IOException;
import java.util.Properties;

//p663
public class PropertiesEx {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		
		properties.load(PropertiesEx.class.getResourceAsStream("database.properties")); //�Է������ ������ �����־��� ������ ��:main�޼ҵ�� ������ ����.
		
		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		
	}

}
