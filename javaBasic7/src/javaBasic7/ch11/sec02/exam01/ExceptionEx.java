package javaBasic7.ch11.sec02.exam01;

public class ExceptionEx {

	public static void printlength( String data) {
		int result = data.length();//���ڿ��� ���� ���ϱ�
		System.out.println("���ڼ��� "+ result);
	}
	
	public static void main(String[] args) {

//	//����	
//		try {
//		// ���� �߻��� �� ���� �ڵ峻�� ���Ѵ�.
//		} catch(���ܸ� ����) {
//		// ���� ���ܰ� �߻������� ó���ϴ� �ڵ� �ۼ�
//		}
		
	try {
		int a = 10;
		a = a/2;
		System.out.println(a);
		int[] iArr = {10,20,30}; //3ĭ¥�� �ڵ� iArr 0��1��2���� ����
		System.out.println(iArr[2]); // 
		
		printlength("this is java");
		printlength("ab");//null�̶� ���� ���� �ڷᰡ ���ٴ� �� 

		Class.forName("java.lang.ABC");
		
		} catch(ArithmeticException e  ) {
			System.out.println("�и� 0�̸� �ȵȴ�.");
		} catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("�迭�� �ε��� ������ ������ϴ�.");
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("null�� �����ؼ� ������ �����ϴ�.");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Ŭ�������� Ʋ�Ƚ��ϴ�");
		} catch (Exception e) {
			System.out.println("��� ������ �θ� Ŭ����");
				
		} finally {
			// ���ܻ������ ������(�� , �ʼ���) ó���ؾߵ�
			System.out.println("DB�ݱ�");
			System.out.println("�α׿����ϱ�");
		}
	
	}

}
