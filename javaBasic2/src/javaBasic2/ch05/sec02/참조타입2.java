package javaBasic2.ch05.sec02;

public class 참조타입2 {

	public static void main(String[] args) {
		
	//A클래스를 힙메모리에 올리기 참조변수 aAddres
	A aAddr = new A();
	
	//홍길동 입력 
	aAddr.name = "홍길동";
	aAddr.kor = 100;
	aAddr.avg = 3.5;
	
	//교제 147쪽
	
	A aAddr2 = new A();		//예를 들어 10번지라고 하면
	
	System.out.println(aAddr == aAddr2);
	
	A aAddr3 = aAddr2;		//10번지를 aAddr3이라는 변수에 넣어라
	System.out.println(aAddr3 == aAddr2); 
	System.out.println(aAddr3 == aAddr2);
	
	
	
	}

}
