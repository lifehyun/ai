package javaBasic3.ch06.sec11;

public class Computer {
	
	int plus(int ... values) {
		
		int PlusA = 0;
		for (int i=0; i<values.length; i++) {
			PlusA += values[i];
		}
		return PlusA;
	}
	
	double ��հ�(int a , int b) {
		double ��հ� = (double)(a+b) / 2;
		return ��հ�;

	}
	
	double ��հ�(double ... values) {
		double ��հ�=0;
		for(int i=0; i<values.length; i++) {
			��հ� += values[i];
		}

	return ��հ� / values.length;
}
	
	
	
	
}
