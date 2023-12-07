package javaBasic2.ch05.sec03;

import java.util.Calendar;

public class 열거형예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null;	//투데이라는 변수는 위키라는 열거에 대한 변수이다.
		
		Calendar cal = Calendar.getInstance();	//날짜를 이용할 수 있다.
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);		//5가 나온이유는 : 일월화수목금토 1234567 해서 오늘 날짜인 목요일이라서
		
		System.out.println(Week.THURSDAY);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		
		System.out.println(today);
		
		int[]array; 
		//array= {1,2,3};
		array = new int[3];
		array[0] = 1;
		array[0] = 2;
		array[0] = 3;
		
		
		int[]array1 ={1,2,3};
		int[]array2 = new int[3];
		int[][]array3 = new int[3][2];
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
