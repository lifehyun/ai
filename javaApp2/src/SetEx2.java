
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		//String 객체 set넣기
		//과일 가게 : 사과 배  귤 바나나 사과 배 우리가 팔고 있는 과일 종류가 뭐야?
		//Set에 요소를 넣기 
		//Set의 구현클래스는 (.HashSet && .TreeSet이 있다.)
		//Ctrl + shift + o 누르면 import가 자동으로 된다
		Set<String> set = new HashSet<String>();
		
		set.add("사과");
		set.add("배");
		set.add("귤");
		set.add("배"); 		// 나중에 들어온 배는 중복됨으로 안넣어준다.
		set.add("바나나");
		set.add("사과");
		
		//set안에 요소 갯수 구하기 . 우리가 팔고 있는 과일 종류의 갯수는?
		System.out.println(set.size());
		
		//"메론" 팔아요? .contains로 물어보는것.
		System.out.println(set.contains("메론"));
		
		
		//set안에 있는 모두 출력하기
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//set안에 있는 모두를 제거하기
		set.clear();
		System.out.println(set.size());
	}

}
