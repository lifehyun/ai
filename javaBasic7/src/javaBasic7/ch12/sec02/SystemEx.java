package javaBasic7.ch12.sec02;

import java.io.IOException;

public class SystemEx {

	public static void main(String[] args)  {
		try {
		System.err.println("���� �κ� ��� ����������");
		System.out.println(System.getProperty("os.name") ); 	//�ü�� �̸�?
		System.out.println(System.getProperty("user.name") );	//���� �̸�?
		System.out.println(System.getProperty("user.home") );	//���� ��?
		System.out.println(System.getProperty("user.dir") );	//������ �����Ѱ�
		System.out.println(System.getProperty("java.home") );	//�ڹ� ��?
		System.out.println(System.nanoTime() );					//������ 1/10~9��
		System.out.println(System.currentTimeMillis() );		//�и��� 1/1000�� ����
		
			int aa = System.in.read();
			System.out.println(aa);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.exit(0); // ���μ��� ����
	}

}
