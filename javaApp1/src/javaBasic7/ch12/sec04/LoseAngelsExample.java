package javaBasic7.ch12.sec04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class LoseAngelsExample {

	public static void main(String[] args) {
		
		TimeZone timezone = TimeZone.getTimeZone("American,Los_Angeles");
		TimeZone timezone1 = TimeZone.getTimeZone("JST"); 
		TimeZone timeZone2 = TimeZone.getTimeZone("Asia/Seoul");
		
		Calendar now = Calendar.getInstance(timezone1);
		System.out.println(now.get(Calendar.MONTH)+ "월" + now.get(Calendar.DAY_OF_MONTH)+"일");
		System.out.println(now.get(Calendar.HOUR)+ "시" + now.get(Calendar.MINUTE)+"분");
		//타임존 검색 "java timezone ids list"
		//링크 >  https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/ 
		
		//전세계 타임존 아이디값 얻기
		String[] av = TimeZone.getAvailableIDs();
		for(String a : av) {
			System.out.println(a);
		}
		
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재시간:"+ now1.format(dtf));
		//1년후
		LocalDateTime aft1year = now1.plusYears(1);
		System.out.println("지금으로부터 1년후: "+aft1year.format(dtf));
		//3년전
		LocalDateTime bf3year = now1.minusYears(3);
		System.out.println("지금으로부터 3년전: "+bf3year.format(dtf));
		//2주후
		LocalDateTime aft2week = now1.plusWeeks(2);
		// 출력시 대출일 : 지금날짜 . 반납일 2주후 날짜 
		System.out.println("대출일 :"+now1.format(dtf));
		System.out.println("반납일 :"+aft2week.format(dtf));
		
		
	}

}
