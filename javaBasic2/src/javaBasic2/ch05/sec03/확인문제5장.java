package javaBasic2.ch05.sec03;

public class Ȯ�ι���5�� {

	public static void main(String[] args) {
		//6�� �迭�� ���� ���� ���϶�
		int[][] array = {
				{95,86},	//0��
				{83,92,96},	//1��
				{78,89,93,87,88} //2��
		};
		
		System.out.println(array.length); 		//���� 3
		System.out.println(array[2].length);	//����5
		
		//7�� �ִ밪�� ���϶�
		int[] array1 = {1,5,3,8,2};
		//�ִ밪�� �־��� ������ ����
		int max = 6; 
		//�ݺ��ؼ� ���ϱ� 
		for(int i=0; i< array1.length; i++) { //i=0 1 2 3 4 
			if( max < array1[i]) max = array1[i]; // i= 1 < 5<3 (��) 5<8 
		}
		System.out.println(max);
		
		
		//�ּҰ��� ���϶�
		int min = 9;
		for(int i=0; i<array1.length; i++) {
			if( min > array1[i]) min = array1[i];
		}
		System.out.println(min);
		
		//8��
		int [][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		for(int i=0; i<array2.length; i++) {	//���� ���� ��ŭ �ݺ�
			for(int j=0; j<array2[i].length; j++){ //���� ���� ��ŭ �ݺ�
			sum = sum + array2[i][j];
			}
			
		}	
		
		// ���� 10�� ��� ���ұ�?
		System.out.println(array2[0].length + "~~");	
		int count = array2[0].length + array2[1].length + array2[2].length;
		System.out.println(count + "~~~");
		
		System.out.println("�հ�"+sum);
		
		double avg = sum/(double) count;
		System.out.println("�����"+avg);
		
		
		
//		
//		int [][] array3 = {
//				{97,85},
//				{82,91,94},
//				{77,82,90,80,83}
//		};
//		
//		//�ִ밪
//		
//		
//		
//		//�ּҰ�
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
