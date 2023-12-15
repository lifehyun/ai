package javaBasic6.ch09.sec02;

public class SAExample {

	public static void main(String[] args) {
	AA a1 = new AA();
	System.out.println(a1.aa);
	
	System.out.println(AA.sa);
	System.out.println(AA.BB.bb); //밖에있는 AA클라스 다음 BB안에있는 bb를 찍어라
	//BB라는 클래스를 new해라
	AA.BB aabb = new AA.BB(); //AA클래스에 속해있는 BB를 올려라
	System.out.println(aabb.ibb);
	//외부클래스:AA클래스 내부클래스BB클래스  
	aabb.bbM();
	aabb.ibbM();
	}

}

class AA{ //외부 클래스 1번째 static
	int aa = 20; 	//new 인스턴스를 사용할수 있는 메소드
	void aaM() {
		
	}
	
	static int sa = 10;
	static void saM() {
		
	}
	
	static class BB{ // AA안에 있는 BB 클래스 2번째 static
		// AA라는 클래스 안에 있는 BB클래스를 사용하고 싶으면 클래스명앞에 static을 붙여서 힙메모리에 올려줘야한다.
		// 밖에있는 AA 클래스에 static이 있는 메모리만 쓸수 있다.
		static int bb = 20;
		static void sbbM() {
		
		}
		
		int ibb =  30;
		void ibbM() {
			ibb = ibb + 40;
			bbM();
		}
		
		
		void bbM() { 
			// aa = aa+ 20;
			// aaM(); 호출해봐라. 
			AA.sa = 100;
			AA.saM();
			
		}
	}
}
