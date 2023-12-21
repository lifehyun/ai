package javaBasic7.ch12.sec04;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeZoneCompareEx {

	public static void main(String[] args) {

		//현재날짜
		//특정날짜
		LocalDateTime stD1 = LocalDateTime.of(2021, 1, 1, 0, 0);
		LocalDateTime stD2 = LocalDateTime.of(2021, 12, 31, 23, 59);
		LocalDateTime stD3 = LocalDateTime.of(2022, 12, 31, 23, 59);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("시작일 "+ stD1.format(dtf));
		System.out.println("종료일 "+ stD2.format(dtf));
		
	
		if(stD1.isBefore(stD2)) {
			System.out.println("이벤트 진행중입니다");
			}else if(stD1.isEqual(stD2)) {
				System.out.println("이벤트 오늘 마감합니다");
			}else {
				System.out.println("이벤트 마감했습니다. 다음기회에");
			}
			
		
		//2023-12-20 12:00 ~ 12-25 11:59 
		// 이벤트 기간 세일 70% 이벤트 마감일 세일 85% 이벤트 종료
		LocalDateTime evS1 = LocalDateTime.of(2023, 12, 20, 12, 0);
		LocalDateTime evP1 = LocalDateTime.of(2023, 12, 25, 11, 59);
		LocalDateTime currentDate = LocalDateTime.now();
		if(currentDate.isBefore(evP1) && currentDate.isAfter(evS1)){
			System.out.println("이벤트 중입니다 세일 70%");
		}else if(currentDate.isEqual(evP1)) {
			System.out.println("이벤트 마감일 세일 85%");
		}else {
			System.out.println("이벤트 종료");
		}
		
		
		
		
		
		
		
		}
		
		
	}


