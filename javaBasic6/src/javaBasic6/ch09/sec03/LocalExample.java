package javaBasic6.ch09.sec03;

public class LocalExample {

	public static void main(String[] args) {
		
		LocalExample le = new LocalExample(); //���θ޼ҵ忡�� ��üȭ����
		le.localM();						  //localM�� ȣ���϶�.
		
		
	}

	public void localM() {
		int a = 10;
		
		class AAA{
			int sa = 100;
			void m() {
				System.out.println("localM �޼ҵ�ȿ� �ִ� Ŭ������ �޼ҵ�");
			}
		}// end AAA
		
		// AAA �޼ҵ�ȿ� ��ü�� ����
		AAA aaa = new AAA(); //��ü����
		aaa.m();			 //����ϱ�
		
		
		
		
	}//end loclaM

}//end LoclaExample
