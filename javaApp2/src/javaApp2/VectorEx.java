package javaApp2;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//스레드 여러개의 cpu를 사용하면서 멀티프로그래밍을 하는것
		//이용할수있는 분야: 스레드로 멀티프로그래밍을 할떄 순서가 있고 중복저장을 할수 있는 자료구조이다.
		//Vexctor라는 컬렉션은 스레드의 자료를 담기위한 구조
		//ex)window는 여러개의 작업을 하고있는것 : 메모장,인터넷,게임 등등
		
		//실수를 담는 변수
		Vector<Double> dArr = new Vector<Double>();
		//10.4 , 8.8, 9.4, 3.7
		dArr.add(10.4);
		dArr.add(8.8);
		dArr.add(9.4);
		dArr.add(3.7);
		
		//8.8뒤에 7.9를 넣기
		dArr.add(2, 7.9);
		//3.7이 있습니까? .contains
		if(dArr.contains(3.7)) {
			System.out.println("있습니까?");
		}else {
			System.out.println("없습니다!");
		}
		
		//10.4를 삭제하기 .remove
		dArr.remove(0);
		//전체출력하기
		for(int i=0; i<dArr.size(); i++) {
			System.out.println(dArr);
		}
		
	
	
	
	
	
	}

}
