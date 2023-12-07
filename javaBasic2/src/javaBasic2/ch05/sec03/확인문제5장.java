package javaBasic2.ch05.sec03;

public class 확인문제5장 {

	public static void main(String[] args) {
		//6번 배열의 길이 값을 구하라
		int[][] array = {
				{95,86},	//0행
				{83,92,96},	//1행
				{78,89,93,87,88} //2행
		};
		
		System.out.println(array.length); 		//정답 3
		System.out.println(array[2].length);	//정답5
		
		//7번 최대값을 구하라
		int[] array1 = {1,5,3,8,2};
		//최대값을 넣어줄 변수를 선언
		int max = 6; 
		//반복해서 비교하기 
		for(int i=0; i< array1.length; i++) { //i=0 1 2 3 4 
			if( max < array1[i]) max = array1[i]; // i= 1 < 5<3 (참) 5<8 
		}
		System.out.println(max);
		
		
		//최소값을 구하라
		int min = 9;
		for(int i=0; i<array1.length; i++) {
			if( min > array1[i]) min = array1[i];
		}
		System.out.println(min);
		
		//8번
		int [][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		for(int i=0; i<array2.length; i++) {	//행의 길이 만큼 반복
			for(int j=0; j<array2[i].length; j++){ //열의 길이 만큼 반복
			sum = sum + array2[i][j];
			}
			
		}	
		
		// 갯수 10은 어떻게 구할까?
		System.out.println(array2[0].length + "~~");	
		int count = array2[0].length + array2[1].length + array2[2].length;
		System.out.println(count + "~~~");
		
		System.out.println("합계"+sum);
		
		double avg = sum/(double) count;
		System.out.println("평균은"+avg);
		
		
		
//		
//		int [][] array3 = {
//				{97,85},
//				{82,91,94},
//				{77,82,90,80,83}
//		};
//		
//		//최대값
//		
//		
//		
//		//최소값
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
