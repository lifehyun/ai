package javaBasic2.ch05.sec03;

public class �������迭 {
	//p.176
	public static void main(String[] args) {
		// ���ȣ�� �ΰ��ϴ°� �������迭
		int[][] intArr1 = { {1,2} , {2,3} , {3,4}}; //0�� 1�� 2�� | 0�� 1��
		String[][] strBrr1 = { {"a","b","c"},{"d","e","f"}};
		boolean[][] intCrr1 = {{false,true},{false,true},{true,false},{true,true}};
		
		// 2���� �迭�� ���� ����ϱ�
		System.out.println(intArr1[2][1]);
		// " e "�� ����ϱ�
		System.out.println(strBrr1[1][1]);
		// " ������ true"�� ����ϱ�
		System.out.println(intCrr1[3][0]);
		
		//�迭�ȿ� ��� �� ����ϱ� 0�� 0�� 0�� 1��  1�� 0�� 1�� 1�� 2�� 0�� 2�� 1��
		for(int i=0; i< intArr1.length ; i++) { 			//i=0,1,2
			for(int j=0; j< intArr1[i].length ; j++) { 		//j=0,1
				System.out.print(intArr1[i][j]+"  ");		//������ ����ϱ�
			}
		}
		System.out.println();		//�ٹٲٱ�
		
		
		
		
		
		
		
	}

}
