package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//ListƯ¡ ������ �ִ�. �ߺ����� �ִ�.
		int[] iarr = {1,2};
		for (int i : iarr) {
			System.out.println(i);
		}
		
		for (int i = 0; i < iarr.length; i++) {
			int j = iarr[i];
			
		}
		// 3, 4�߰��ϰ� �ʹ�.
		// {1,2,3,4}
		
		//List�� ����Ŭ������ ArraysList�� �̿�

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		// <E> ���׸��̶���Ѵ� : �ڷ��� ���� �̸� �����ϴ°�
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size()); //.size�� : arrList�ȿ� ��� ��Ұ� �ִ����� ������ִ� �Լ�.
		//3,4�߰��ϱ�
		arrList.add(3);
		arrList.add(4);
		//0�� �ε����� -7�� �ֱ�
		arrList.add(0, -7);
		//��ü�� ����ϰ� �ʹ�. �ݺ����� ����Ұ�
		for(int i = 0 ; i< arrList.size(); i++) { // i = 0 1 2 3 4
			System.out.println(arrList.get(i));	 // .get�� �ε�����ȣ�� �ִ� ��Ҹ� ������ִ� �Լ�.
		}
		
		//���ڿ��� ArrayList �ֱ�
		ArrayList<String> sArr= new ArrayList<String>();
		//��� �� �� �ٳ��� �Է�(����)�ϱ�
		sArr.add("���");
		sArr.add("��");
		sArr.add("��");
		sArr.add("�ٳ���");
		
		//�ְ� �ٳ��� ���̿� ���ξ��� �ֱ�
		sArr.add(3,"���ξ���");
		//����� �� ���̿� �޷� �ֱ�
		sArr.add(1, "�޷�");
		
		//���� õ�������� �����ϱ�
		//��Ʈ .set()
		sArr.set(3, "õ����");
		
		//�ٳ����� �����ϱ�
		//��Ʈ .remove
		sArr.remove(5);
		//���ξ����� �����ϱ�
		sArr.remove("���ξ���");
		
		//��ü ����ϱ�
		for(int i = 0; i< sArr.size(); i++) {
			System.out.println(sArr.get(i) + " ");
		}
		
		
		//���ξ����� �ֽ��ϱ�? contains()
		//��� �����ϴ�
		System.out.println("���Կ� ���ξ����� �ֽ��ϱ�?");
		if(sArr.contains("���ξ���")) { //���࿡ sArr�迭�ȿ� �ֽ��ϱ�?
			System.out.println("�ֽ��ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
		
		//����� �谡 �ֽ��ϱ�?
		System.out.println("���Կ� ����� �谡 �ֽ��ϱ�?");
		if(sArr.contains("���")&& sArr.contains("��")) {
			System.out.println("�ֽ��ϴ�");
		}else {
			System.out.println("�����ϴ�");
		}
		
		//���Կ� ������ ��� ������?
		//�迭����Ʈ�� ����ֳ���? isEmpty()
		//���Կ� ������ ������ ��� ġ���ּ���
		if(!sArr.isEmpty()) {
			sArr.clear(); 		//��Ҹ� ��� �� �����
			System.out.println("���� ������ ��� ġ�����ϴ�.");
		}
		//��ü ����ϱ�
		for(int i = 0; i < sArr.size(); i++) {
			System.out.println(sArr.get(i)+" ");
		}
	}

}
