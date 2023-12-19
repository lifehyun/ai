package javaBasic7.ch12.sec03;

import java.util.Arrays;

// P520
public class StringEx {

	public static void main(String[] args) {

		String data = "�ڹ�"; 
		byte[] arr1 = data.getBytes();
		System.out.println(arr1[1] ); // �����ڵ�� ��µ� ��
		System.out.println(arr1.length); 
		//�迭�� ���̴�? ����°���
		//�ѱ��� �ѱ��ڴ� 2byte�� �����ϰ� �־ 4byte���� ����.
		
		//���迭�� ���Ѱ� ����°��� Arrays.��
		//���⼭ to�� ~~�� ��� ����. to.String:[]��ȣ���� string���� �ٲ��
		String str1 = Arrays.toString(arr1);
		System.out.println(str1); // �����ڵ�� ��µ� �� [,,,,4���� ������]
		
		//StringBuilder Ŭ����
		data = data + "java";
		System.out.println(data);
		
		StringBuilder sb = new StringBuilder();
		sb.append("�ڹ�");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		//0�� �ε����� "a"�� �����ϱ�
		sb.insert(0,"a");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		
		
		
		
		
	}

}
