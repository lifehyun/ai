package javaApp3.ch13.sec01;

public class GenericEx1 {

	
	//제한된 타임 파라미터를 갖는 제네릭 메소드
		public static <T extends Number>boolean compara(T t1, T t2){
		//T의 차입을 출력
		System.out.println("compara(" + t1.getClass().getSimpleName()+" ," + t2.getClass().getSimpleName()+")");
		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return (v1 == v2);
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1 = compara(10,20); 
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compara(4.5, 4.5);
		System.out.println(result2);
		System.out.println();
			
		boolean result3 = compara(4.5f, 5.5f); //float형 4.5f
		System.out.println(result3);
		System.out.println();
		
		boolean result4 = compara(100L, 890L); //long형 정수형 8바이트
		System.out.println(result4);
		System.out.println();
		
//		boolean result5 = compara("a", "b");	  //문자형은 number 객체의 자식이 아니라서 안됨
//		System.out.println(result5);
//		System.out.println();
	}
	
}
