package javaApp4;

public class LamdaEx {

	public static void main(String[] args) {
		//���1
		Inter01Impl i01 = new Inter01Impl(); 	//new ��üȭ����
		i01.a();								//ȣ��
		
		//���2 : �͸� ���� Ŭ����
		Inter01 i001 = new Inter01() { //Int + Ctrl + space + �������̽���� ����� Override 

							@Override
							public void a() {
								System.out.println("�͸� ���� Ŭ����");
							}
						};	
		i001.a(); 
		
		Inter02 i002  = new Inter02() {
			
							@Override
							public void b() {
								System.out.println("�͸� ���� Ŭ���� 2");
							}
						};
		i002.b();				
		
		//���3 : ���ٽ� �������̽��ȿ� �߻�޼ҵ� 1�� �ۿ� ���°��
		Inter01 lamda001 = () -> System.out.println("���ٽ����� ���� Ŭ����"); 
		lamda001.a();
		
		Inter02 lamda002 = () -> System.out.println("���ٽ����� ���� Ŭ����2");
		lamda002.b();
		
	}
}

interface Inter01{
	void a();
}

interface Inter02{
	void b();
}


class Inter01Impl implements Inter01{

	@Override
	public void a() {
		System.out.println("�������̽��� ������ Ŭ����");
	}
	
}