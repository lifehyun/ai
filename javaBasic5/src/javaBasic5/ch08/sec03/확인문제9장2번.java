package javaBasic5.ch08.sec03;

public class Ȯ�ι���9��2�� {

	public static void main(String[] args) {
		// 4-��� �� �� �� ���� ���� ��ü�ϱ�,   
        
        Driver1  d1 = new Driver1();
        d1.method(new C1());
	}

}





class Driver1{
	
	void method( A1 a) {
		
	}

}

interface A1{
	
}
class B1 implements A1{
	
}
class C1 implements A1{
	
}
class D1 extends C1 {
	
}
class E1 extends C1 {
	
}