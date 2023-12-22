package javaApp2.ch15.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//p649
public class SetEx {

	public static void main(String[] args) {
	//Set 특징: 중복된 요소를 제거한다.중복저장되지 않는다.
	Set<Integer> set = new HashSet<Integer>();  //정수값을 넣고 싶을때는 Integer
	
	set.add(10);
	set.add(50);
	set.add(80);
	set.add(10);
	
	
	//set에 들어있는 요소들을 세어준다
	System.out.println(set.size()); 
	
	//출력시 반복자를 사용 .iterator();
	Iterator<Integer> it = set.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());		//출력값은 순서없이 아무거나 출력하는것이다.
	}
	
	
	//set안에 40이 있나요? 아니요?
	System.out.println(set.contains(40));
	
	//set안에 요소가 비어있나요? 아니요
	System.out.println(set.isEmpty());
	
	//set안에 50을 지우세요.
	set.remove(50);
	
	
	
	//출력
	it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	
	//set안에 요소 100을 추가하기
	set.add(100);
	
	//set안에 요소 80을 삭제하기
	set.remove(80);
	
	//출력하기 출력시 iterator(); 반복자를 사용
	it = set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
