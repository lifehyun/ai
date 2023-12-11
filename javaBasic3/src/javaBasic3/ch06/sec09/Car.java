package javaBasic3.ch06.sec09;

public class Car {
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "블랙";
	int maxSpeed  = 350;
	int speed;
	
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	// 자동으로 생성자 만들어서 넣기
	public Car(String string, String string2, String string3, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	
	
	public Car(String company, String model, String color, int maxSpeed, int speed, String company1, String model1,
			String color1, int maxSpeed1, int speed1) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	





	


	
	
	
	
	
	
	
	
	
	
	
}
