package javaBasic3.ch06.sec07;

public class ShopService {
	
	
	// ��Ʈ �̱��� �������� ShopService Ŭ������ ����� �ֽø� �˴ϴ�.
	// 1. ������ privata�Դϴ�. 2.�ʵ�� ��üȭ�ؼ� �������� �ּҸ� �����ϰ� private�մϴ�.
	// 3. �޼ҵ��� getInstance()���� ���ϰ��� �������� �ּ��Դϴ�. ���������ڴ� public�Դϴ�.
		

	private static ShopService shopService = new ShopService();
	
	//������ = Ŭ������� �����ϴ�
	public ShopService() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShopService getInstance() {
		return shopService;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
