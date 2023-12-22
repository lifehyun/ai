package javaApp2.ch15.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//p656
public class MapEx1 {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();	
		//앞에있는 123 &&"a""b"가 key이다
		
		//삽입,넣기
		map1.put(1, "이순신");
		map1.put(2, "박수연");
		map1.put(3, "홍길동");
		map1.put(3, "홍길동1");
		map1.put(3, "홍길동2");	
		
		
		//출력하기,홍길동을 꺼내어 보기 get()
		System.out.println(map1.get(3));
		
		//삭제하기
		map1.remove(3);
		
		//전체출력하기
		//1단계 키들을 모은다 KeySet()
		//2단계 키 1개씩 출력한다
		Set<Integer> mapk1 = map1.keySet();
		
		Iterator<Integer> it1 = mapk1.iterator();
		while(it1.hasNext()) {
//			System.out.println(it1.next()+ "-_<");
			System.out.println(map1.get(it1.next())+"-_-"); //Values 값 인쇄
		}

		Map<String, Double> map2 = new HashMap<String, Double>(); 
		//map2에 값을 넣기
		map2.put("a", 2.5);
		map2.put("b", 3.5);
		map2.put("b", 3.5);
		map2.put("b", 3.5);
		map2.put("b", 13.5);
	
		//출력하기,3.5을 꺼내어 보기 get()
		System.out.println(map2.get("b"));
		
		//크기 구하기
		System.out.println(map1.size()); //key가 동일하면 동등객체로 판단하고 / 마지막 값이 출력된다 
		
		
		Map<String, String> map3 = new HashMap<String, String>();
		map3.put("홍길동","과장");
		map3.put("이순신","부장");
		map3.put("최경미","사원");
		map3.put("홍길동","사장");
		
		//크기는 ? 회사인원수
		System.out.println(map3.size());
		
		//이순신의 직책은?
		System.out.println(map3.get("이순신"));
		
		//최경미의 직책은?
		System.out.println(map3.get("최경미"));
		
		//홍길동의 직책은?
		System.out.println(map3.get("홍길동"));
		
		//최경미가 퇴사했다 삭제하기
		map3.remove("최경미");
		
		//전체출력하기
		System.out.println(map3.get("홍길동"));
		System.out.println(map3.get("이순신"));
		
		
		//전체출력하려면 key를 반복해서 넣어주면 된다
		//keySet() 모든 키를 Set에 담는다
		Set<String> map3k = map3.keySet();
		
		Iterator<String> it3 = map3k.iterator();
		while(it3.hasNext()) {
//			System.out.println(it.next());			//key의 값이 반복되어 출력된다.
			System.out.println(map3.get(it3.next())+ ">_ㅇ" );
		}
	}

}
