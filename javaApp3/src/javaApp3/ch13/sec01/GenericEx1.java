package javaApp3.ch13.sec01;

public class GenericEx1 {

	
	//���ѵ� Ÿ�� �Ķ���͸� ���� ���׸� �޼ҵ�
		public static <T extends Number>boolean compara(T t1, T t2){
		//T�� ������ ���
		System.out.println("compara(" + t1.getClass().getSimpleName()+" ," + t2.getClass().getSimpleName()+")");
		//Number�� �޼ҵ� ���
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		//���׸� �޼ҵ� ȣ��
		boolean result1 = compara(10,20); 
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compara(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
			
		boolean result3 = compara(4.5f, 5.5f); //float�� 4.5f
		System.out.println(result3);
		System.out.println();
		
		boolean result4 = compara(100L, 890L); //long�� ������ 8����Ʈ
		System.out.println(result4);
		System.out.println();
		
//		boolean result5 = compara("a", "b");	  //�������� number ��ü�� �ڽ��� �ƴ϶� �ȵ�
//		System.out.println(result5);
//		System.out.println();
	}
	
}
