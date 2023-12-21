package javaApp2;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		//List특징 순서가 있다. 중복저장 있다.
		int[] iarr = {1,2};
		for (int i : iarr) {
			System.out.println(i);
		}
		
		for (int i = 0; i < iarr.length; i++) {
			int j = iarr[i];
			
		}
		// 3, 4추가하고 싶다.
		// {1,2,3,4}
		
		//List의 구현클래스인 ArraysList를 이용

		ArrayList<Integer> arrList = new ArrayList<Integer>();
		// <E> 제네릭이라고한다 : 자료의 형을 미리 지정하는것
		arrList.add(1);
		arrList.add(2);
		System.out.println(arrList.size()); //.size란 : arrList안에 몇개의 요소가 있는지를 출력해주는 함수.
		//3,4추가하기
		arrList.add(3);
		arrList.add(4);
		//0번 인덱스에 -7을 넣기
		arrList.add(0, -7);
		//전체를 출력하고 싶다. 반복문을 사용할것
		for(int i = 0 ; i< arrList.size(); i++) { // i = 0 1 2 3 4
			System.out.println(arrList.get(i));	 // .get은 인덱스번호에 있는 요소를 출력해주는 함수.
		}
		
		//문자열에 ArrayList 넣기
		ArrayList<String> sArr= new ArrayList<String>();
		//사과 배 귤 바나나 입력(삽입)하기
		sArr.add("사과");
		sArr.add("배");
		sArr.add("귤");
		sArr.add("바나나");
		
		//귤과 바나나 사이에 파인애플 넣기
		sArr.add(3,"파인애플");
		//사과와 배 사이에 메론 넣기
		sArr.add(1, "메론");
		
		//귤을 천혜향으로 수정하기
		//힌트 .set()
		sArr.set(3, "천혜향");
		
		//바나나를 삭제하기
		//힌트 .remove
		sArr.remove(5);
		//파인애플을 삭제하기
		sArr.remove("파인애플");
		
		//전체 출력하기
		for(int i = 0; i< sArr.size(); i++) {
			System.out.println(sArr.get(i) + " ");
		}
		
		
		//파인애플이 있습니까? contains()
		//결과 없습니다
		System.out.println("가게에 파인애플이 있습니까?");
		if(sArr.contains("파인애플")) { //만약에 sArr배열안에 있습니까?
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
		
		//사과와 배가 있습니까?
		System.out.println("가게에 사과와 배가 있습니까?");
		if(sArr.contains("사과")&& sArr.contains("배")) {
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
		
		//가게에 물건이 모두 없나요?
		//배열리스트가 비어있나요? isEmpty()
		//가게에 물건이 있으면 모두 치워주세요
		if(!sArr.isEmpty()) {
			sArr.clear(); 		//요소를 모두 다 지우기
			System.out.println("가게 물건을 모두 치웠습니다.");
		}
		//전체 출력하기
		for(int i = 0; i < sArr.size(); i++) {
			System.out.println(sArr.get(i)+" ");
		}
	}

}
