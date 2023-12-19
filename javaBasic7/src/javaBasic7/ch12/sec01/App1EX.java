package javaBasic7.ch12.sec01;

import java.lang.module.ModuleDescriptor;
import java.text.DateFormat;
import java.util.Date; // leng에있는 패키지가 아니기때문에 import를 해야한다.
import java.util.Scanner;
import java.util.StringTokenizer;

public class App1EX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = "abcde";
		int aHashCode = a.hashCode();
		System.out.println(aHashCode);
		double pi = Math.PI;
		System.out.println(pi);
		double e = Math.E;
		System.out.println(e);
		double COS = Math.cos(45.0);
		System.out.println(COS);
		
		
		
		// static이 없는경우
		Date date = new Date();	
		int date1 = date.getDate(); // 줄 - 되있는 이유는 Deprecated. 너무 오래되어서 그렇다 사용하지 말아라라고 정의해놔서
		System.out.println(date1); //출력갑 19 : 오늘날짜
		// getTime출력해라
		long time1 = date.getTime();
		System.out.println(time1);
		long date2 = Date.parse("2023/12/19");
		System.out.println(date2);
		//DateFormat.parse("2023/12/19");
		String text = "ab/cd/ef";
		StringTokenizer st = new StringTokenizer("ab/cd/ef/","/");
		int count = st.countTokens();
		System.out.println(count); //출력값:3인이류는 ab/cd/ef라는 세덩어리라서
		String token1= st.nextToken();
		System.out.println(token1);
		token1= st.nextToken();
		System.out.println(token1);
		token1= st.nextToken();
		System.out.println(token1);
//		token1= st.nextToken();
//		System.out.println(token1); 
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


