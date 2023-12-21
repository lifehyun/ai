package javaBasic3.ch06.sec05;

public class singletonExample {

	public static void main(String[] args) {
		
		
	singleton o1 = singleton.getInstance();
	singleton o2 = singleton.getInstance();
	
	
	System.out.println(o1);
	System.out.println(o2);

	}

}
