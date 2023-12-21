package javaBasic7.ch12.sec04;

import java.util.StringTokenizer;

//p.523
public class StringTokenizerEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수"; //<이런 문자가 있다.
		//결과화면 출력시 홍길동 이수홍 박연수로 출력되게하라.
		//방법1)String클래스에 있는 split()함수로 짜른다.
		//방법2)StringTokenizer클래스 사용한다.
		
		//방법1)
		String[] arr = data1.split("&|,");
		for(int i = 0; i<arr.length; i++) { //조건이 참이면 출력해라 . 
			System.out.println(arr[i]);
		}
		//향상된for문 변수를 사용한다.
		for(String i : arr) {
			System.out.println(i);
		}
		
		//방법2)
		String data2 = "홍길동/이수홍/박연수/이순신/최수진";
		StringTokenizer st = new StringTokenizer(data2,"/");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		String data3 = "사과-배-귤-바나나-포도";
		StringTokenizer st1 = new StringTokenizer(data3,"-");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		String data4 = "자바*+파이썬*+오라클*+텐서플로어";
		StringTokenizer st2 = new StringTokenizer(data4, "*+");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
	}

}
