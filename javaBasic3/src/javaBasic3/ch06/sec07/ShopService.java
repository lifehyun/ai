package javaBasic3.ch06.sec07;

public class ShopService {
	
	
	// 힌트 싱글톤 패턴으로 ShopService 클래스를 만들어 주시면 됩니다.
	// 1. 생성자 privata입니다. 2.필드는 객체화해서 생성자의 주소를 저장하고 private합니다.
	// 3. 메소드인 getInstance()에서 리턴값을 생성자의 주소입니다. 접급제한자는 public입니다.
		

	private static ShopService shopService = new ShopService();
	
	//생성자 = 클래스명과 동일하다
	public ShopService() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShopService getInstance() {
		return shopService;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
