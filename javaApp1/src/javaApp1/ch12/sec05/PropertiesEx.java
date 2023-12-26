package javaApp1.ch12.sec05;

import java.io.IOException;
import java.util.Properties;

//p663
public class PropertiesEx {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		
		properties.load(PropertiesEx.class.getResourceAsStream("database.properties")); //입력출력이 에러가 날수있어라는 오류가 남:main메소드로 오류를 던짐.
		
		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		
	}

}
