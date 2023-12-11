package javaBasic3.ch06.sec11;

public class Computer {
	
	int plus(int ... values) {
		
		int PlusA = 0;
		for (int i=0; i<values.length; i++) {
			PlusA += values[i];
		}
		return PlusA;
	}
	
	double Æò±Õ°ª(int a , int b) {
		double Æò±Õ°ª = (double)(a+b) / 2;
		return Æò±Õ°ª;

	}
	
	double Æò±Õ°ª(double ... values) {
		double Æò±Õ°ª=0;
		for(int i=0; i<values.length; i++) {
			Æò±Õ°ª += values[i];
		}

	return Æò±Õ°ª / values.length;
}
	
	
	
	
}
