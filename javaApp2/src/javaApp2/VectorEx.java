package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//������ �������� cpu�� ����ϸ鼭 ��Ƽ���α׷����� �ϴ°�
		//�̿��Ҽ��ִ� �о�: ������� ��Ƽ���α׷����� �ҋ� ������ �ְ� �ߺ������� �Ҽ� �ִ� �ڷᱸ���̴�.
		//Vexctor��� �÷����� �������� �ڷḦ ������� ����
		//ex)window�� �������� �۾��� �ϰ��ִ°� : �޸���,���ͳ�,���� ���
		
		//�Ǽ��� ��� ����
		Vector<Double> dArr = new Vector<Double>();
		//10.4 , 8.8, 9.4, 3.7
		dArr.add(10.4);
		dArr.add(8.8);
		dArr.add(9.4);
		dArr.add(3.7);
		
		//8.8�ڿ� 7.9�� �ֱ�
		dArr.add(2, 7.9);
		//3.7�� �ֽ��ϱ�? .contains
		if(dArr.contains(3.7)) {
			System.out.println("�ֽ��ϱ�?");
		}else {
			System.out.println("�����ϴ�!");
		}
		
		//10.4�� �����ϱ� .remove
		dArr.remove(0);
		//��ü����ϱ�
		for(int i=0; i<dArr.size(); i++) {
			System.out.println(dArr);
		}
		
	
	
	
	
	
	}

}
