package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class 참조타입 {

	public static void main(String[] args) {
		
		int n = 10; // 스택공간
		
	Scanner sc = new Scanner(System.in); // new 힙메모리에 Scanner라는 클래스를 올려주세요. > Scanner눌러서 import하기.
		
		//힙메모리에 주소를 스택공간의 변수에 저장해야한다.
		//자바에서는 힙영역을 못들어간다. 
		
		
		System.out.println( n );
		
	//변수형식은 자료형  변수명;	
	Student st = new Student(); //student 클래스에 주소가 있다 "참조변수st다" 
	/*  코드 작성 - 설계도 
	--> 사용하려면 메모리에 올려놓고(new) 자료 사용하기
		시멘트 철근
	힙메모리에 올라감
	--->힙메모리에 올라가면 주소가 생긴다.
	---> 스택공간에다 참조변수(주소가 들어있는 변수)를 선언하고 넣어 주어야 한다. */
	
	//Teacher 클래스를 사용하려면 힙메모리에 올려 주어야 한다.
	
	Teacher teacher = new Teacher();
	
	//Person 클래스를 만들고 힙메모리에 올려 주세요.
	
	Person person = new Person();
	
	//Guide 클래스를 만들고 힙메모리 올려주세요.
	
	Guide guide = new Guide();
	
	
		

	}

}
