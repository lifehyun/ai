package javaBasic7.ch12.sec02;

import java.io.IOException;

public class SystemEx {

	public static void main(String[] args)  {
		try {
		System.err.println("에러 부분 출력 빨간색으로");
		System.out.println(System.getProperty("os.name") ); 	//운영체제 이름?
		System.out.println(System.getProperty("user.name") );	//유저 이름?
		System.out.println(System.getProperty("user.home") );	//유저 집?
		System.out.println(System.getProperty("user.dir") );	//유저가 시작한곳
		System.out.println(System.getProperty("java.home") );	//자바 집?
		System.out.println(System.nanoTime() );					//나노초 1/10~9초
		System.out.println(System.currentTimeMillis() );		//밀리초 1/1000초 단위
		
			int aa = System.in.read();
			System.out.println(aa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.exit(0); // 프로세스 종료
	}

}
