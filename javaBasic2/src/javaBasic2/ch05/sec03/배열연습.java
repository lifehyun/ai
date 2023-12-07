package javaBasic2.ch05.sec03;

public class 배열연습 {
	
	public static void main (String[] args) {
		// 배열 : 동일한 자료들의 집합, 연속해서 저장되어 있다.
		// 배열 쓰는 이유? 정수 100개를 기억해야 한다면 변수 100개 만들어야 함 배열로 선언한다.
		// 배열 만드는 방법? 1차원 2차원 3차원 // 배열명,변수명,배열값:(0.1.2.3.4순서이다)
			int[] arr = new int[] {1,2,3,4,5};
			String [] sArr= new String[] {"a","b"};
			double[] dArr = new double[] {1.1 , 2.2 , 3.3 };
			boolean[]cArr =new boolean[] {true,false};
			
			byte[] byteR  = new byte[] {1,2,3,};
			short[]shortR = new short[] {6,7};
			float[] floatR = new float[] {1.1f,2.2f};
		
		// arr배열의 [0]의 값 1을 출력하려면
		System.out.println(arr[0]);
		// "b"를 출력하기
		System.out.println(sArr[1]);
		// 3.3을 출력하기
		System.out.println(dArr[2]);
		
		//arr배열의 [0]의값 1을 10으로 변경
		arr[0] = 10;
		System.out.println(arr[0]);
		
		//방법2) 빈 배열을 만들고 나중에 값을 넣기
		int[] intArr = new int[3];
		double[] doubleArr = new double[5];
		
		intArr[0] = 3;
		intArr[1] = 5;
		intArr[2] = 7;
		
		// 문자열 4개를 넣는 빈 배열 만들기
		// 내용은 "a","b","c","d"로 넣어주기
		String[] striN = new String[4];
		striN[0] = "a";
		striN[1] = "b";
		striN[2] = "c";
		striN[3] = "d";
		System.out.println(striN[1]);
	
		// 배열을 100개를 만든다 . 반복문을 사용
		int[] intAr = new int[100];
		for( int i=0; i<100; i++) { //i=0 1 2 3 4 .. 99
			intAr[i] = i+1;
		}
		for(int i=0; i<100; i++) {
			System.out.println(intAr[i]);
		}
		
		
		 int[] intArr100 = null; // null문자는 주소가 미확정 그래서 스태 
		
		//166
		
		int[] score = new int[] {100,90,87,90,100};
		int sum=0;
		for(int i=0; i<30 ; i++) {
			sum += score[i];
		};
		int avg = sum/30;
		System.out.println("합계는"+sum);
		System.out.println("평균은"+"  "+avg);
		
		//배열의 길이
		System.out.println(score.length);
		
//		score[5]=60;
//		score[6]=90; // 배열의 크기 처음에 만들었던크기는 늘리거나 추가 할수 없다. 
		
		
		
		
		
		
	}
}
