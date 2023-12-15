package javaBasic6.ch09.sec03;

public class LocalExample {

	public static void main(String[] args) {
		
		LocalExample le = new LocalExample(); //메인메소드에서 객체화생성
		le.localM();						  //localM을 호출하라.
		
		
	}

	public void localM() {
		int a = 10;
		
		class AAA{
			int sa = 100;
			void m() {
				System.out.println("localM 메소드안에 있는 클래스의 메소드");
			}
		}// end AAA
		
		// AAA 메소드안에 객체를 생성
		AAA aaa = new AAA(); //객체생성
		aaa.m();			 //사용하기
		
		
		
		
	}//end loclaM

}//end LoclaExample
