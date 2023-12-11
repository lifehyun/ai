package javaBasic3.ch06.sec09;

public class CarExample {

	public static void main(String[] args) {
	// Car 클래스 객체화
	Car myCar = new Car();

	
	
	
	System.out.println("모델몰:"+myCar.model); 
	System.out.println("회사명:"+myCar.company);
	System.out.println("색깔:"+myCar.color);
	System.out.println("최고속도:"+myCar.maxSpeed);
	System.out.println("현재속도:"+myCar.speed);
	System.out.println("-----------------------");
	
	// 필드값 변경
	myCar.speed = 60;
	System.out.println("수정된 속도:"+myCar.speed);
	
	//생성자로 필드에 값을 넣기
	Car sCar = new Car("삼성자동차", "SM3","흰색", 370,0);
	
	
	System.out.println("모델몰:"+sCar.model); 
	System.out.println("회사명:"+sCar.company);
	System.out.println("색깔:"+sCar.color);
	System.out.println("최고속도:"+sCar.maxSpeed);
	System.out.println("현재속도:"+sCar.speed);
	
	
	//필드 변경
	sCar.speed = 100;
	System.out.println("삼성 자동차 수정된 속도"+sCar.speed);
	
	
	//getter setter로 출력하기
	Car car3 = new Car();
	car3.setColor("노란");
	System.out.println(car3.getColor());
	car3.setCompany("독일자동차");
	System.out.println(car3.getCompany());
	
	
	
	
	}

}
