package javaBasic6.ch09.sec02;

public class SAExample {

	public static void main(String[] args) {
	AA a1 = new AA();
	System.out.println(a1.aa);
	
	System.out.println(AA.sa);
	System.out.println(AA.BB.bb); //�ۿ��ִ� AAŬ�� ���� BB�ȿ��ִ� bb�� ����
	//BB��� Ŭ������ new�ض�
	AA.BB aabb = new AA.BB(); //AAŬ������ �����ִ� BB�� �÷���
	System.out.println(aabb.ibb);
	//�ܺ�Ŭ����:AAŬ���� ����Ŭ����BBŬ����  
	aabb.bbM();
	aabb.ibbM();
	}

}

class AA{ //�ܺ� Ŭ���� 1��° static
	int aa = 20; 	//new �ν��Ͻ��� ����Ҽ� �ִ� �޼ҵ�
	void aaM() {
		
	}
	
	static int sa = 10;
	static void saM() {
		
	}
	
	static class BB{ // AA�ȿ� �ִ� BB Ŭ���� 2��° static
		// AA��� Ŭ���� �ȿ� �ִ� BBŬ������ ����ϰ� ������ Ŭ������տ� static�� �ٿ��� ���޸𸮿� �÷�����Ѵ�.
		// �ۿ��ִ� AA Ŭ������ static�� �ִ� �޸𸮸� ���� �ִ�.
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
			// aaM(); ȣ���غ���. 
			AA.sa = 100;
			AA.saM();
			
		}
	}
}
