package javaBasic3.ch06.sec07;

public class Ȯ�ι���6��18�� {

	public static void main(String[] args) {
	ShopService obj1 = ShopService.getInstance();
	ShopService obj2 = ShopService.getInstance();
	
	if(obj1 == obj2) {
		System.out.println("���� ShopService ��ü�Դϴ�");
	}else {
		System.out.println("�ٸ� ShopService ��ü�Դϴ�");
	}
	
	System.out.println(obj1);
	System.out.println(obj2);
	


	
	}

}
