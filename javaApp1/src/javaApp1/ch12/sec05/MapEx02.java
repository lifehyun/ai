package javaApp1.ch12.sec05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapEx02 {

   public static void main(String[] args) {
      Member m1 = new Member("a100", 123);
      Member m2 = new Member("a200", 234);
      Member m3 = new Member("a300", 345);
      
      HashMap<Integer, Member> a = new HashMap<Integer, Member>();
      a.put(1,m1);
      a.put(2,m2);
      a.put(3,m3);
     
      // "a300",345출력하기 힌트 : 키는 3이다
      System.out.println(a.get(3));
      
      // 키들만 출력하기 1 2 3 
      Set<Integer> keys = a.keySet();
      Iterator<Integer> it = keys.iterator();
      while(it.hasNext()) {
    	 Integer itKey = it.next();
    	 System.out.println(itKey + " " + a.get(itKey));
      }
      
      // map예제 키 - id 값 pwd
      HashMap<Member, Integer> a2 = new HashMap<Member, Integer>();
      a2.put(m1, m1.pwd);
      a2.put(m2, m2.pwd);
      a2.put(m3, m3.pwd);
      
      // a100일때 pwd는?
      System.out.println(a2.get(m1));
      
      Member m4 = new Member("a300",345);
      a2.put(m1, m1.pwd);
      
      Member m5 = new Member("a300",348);
      a2.put(m5, m5.pwd);
      
      System.out.println(a2.size());
      //동등객체를 id와 pwd가 같으면 동일한것으로 코딩하려면.
      Set<Member> keys1 = a2.keySet();
      Iterator<Member> k1 = keys1.iterator();
      while(k1.hasNext()) {
    	  System.out.println(k1.next());
      }
      
      
      
   }

}

class Member{
   String id;
   Integer pwd;
   
   public Member(String id, Integer pwd) {
      this.id = id;
      this.pwd = pwd;
   }
   
   @Override
   public String toString() {
      return id + " " + pwd;
   }
   
   @Override
	public int hashCode() {
	   //동등객체 판단은 hashCode()가 같고 equals()가 같으면 동등객체이다.
		return id.hashCode() + pwd.hashCode(); 
	}
   
   
   @Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			if(id.equals(m.id) && pwd==m.pwd ) return true;
		}
		return false;
	}
   
}