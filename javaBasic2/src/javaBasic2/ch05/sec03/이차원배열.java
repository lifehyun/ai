package javaBasic2.ch05.sec03;

public class 이차원배열 {
	//p.176
	public static void main(String[] args) {
		// 대괄호를 두개하는개 이차원배열
		int[][] intArr1 = { {1,2} , {2,3} , {3,4}}; //0행 1행 2행 | 0열 1열
		String[][] strBrr1 = { {"a","b","c"},{"d","e","f"}};
		boolean[][] intCrr1 = {{false,true},{false,true},{true,false},{true,true}};
		
		// 2차원 배열의 값을 출력하기
		System.out.println(intArr1[2][1]);
		// " e "를 출력하기
		System.out.println(strBrr1[1][1]);
		// " 마지막 true"를 출력하기
		System.out.println(intCrr1[3][0]);
		
		//배열안에 모든 값 출력하기 0행 0열 0행 1열  1행 0열 1행 1열 2행 0열 2행 1열
		for(int i=0; i< intArr1.length ; i++) { 			//i=0,1,2
			for(int j=0; j< intArr1[i].length ; j++) { 		//j=0,1
				System.out.print(intArr1[i][j]+"  ");		//옆으로 출력하기
			}
		}
		System.out.println();		//줄바꾸기
		
		
		
		
		
		
		
	}

}
