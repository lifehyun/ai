package javaBasic7.ch12.sec01;

public class Ex {

	public static void main(String[] args) {
		 
	Exnew ex1 = new Exnew("������","01012345789");
	Exnew ex2 = new Exnew("������","0101234579");
	Exnew ex3 = new Exnew("�賲��","01012345789");
	Exnew ex4 = new Exnew("�賲��","01012345678");
	
	if(ex1.equals(ex2)) {
		System.out.println("������ü�Դϴ�");
	}else {
		System.out.println("�ٸ���ü�Դϴ�");
	}
		
	if(ex3.equals(ex4)) {
		System.out.println("������ü�Դϴ�");
	}else {
		System.out.println("�ٸ���ü�Դϴ�");
	}
	
	
	
	}

}

class Exnew {
	
	String name;
	String number;
	
	public Exnew(String name, String number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public int hashCode() { // name�� ������ ������ü
		return name.hashCode(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Exnew) {
			Exnew ep = (Exnew) obj; {
				if(this.name.equals(ep.name)) {
					return true;
				}
			}
		} return false;
	}
}
