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
		System.out.println(now.get(Calendar.MONTH)+ "��" + now.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(now.get(Calendar.HOUR)+ "��" + now.get(Calendar.MINUTE)+"��");
		//Ÿ���� �˻� "java timezone ids list"
		//��ũ >  https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/ 
		
		//������ Ÿ���� ���̵� ���
		String[] av = TimeZone.getAvailableIDs();
		for(String a : av) {
			System.out.println(a);
		}
		
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("����ð�:"+ now1.format(dtf));
		//1����
		LocalDateTime aft1year = now1.plusYears(1);
		System.out.println("�������κ��� 1����: "+aft1year.format(dtf));
		//3����
		LocalDateTime bf3year = now1.minusYears(3);
		System.out.println("�������κ��� 3����: "+bf3year.format(dtf));
		//2����
		LocalDateTime aft2week = now1.plusWeeks(2);
		// ��½� ������ : ���ݳ�¥ . �ݳ��� 2���� ��¥ 
		System.out.println("������ :"+now1.format(dtf));
		System.out.println("�ݳ��� :"+aft2week.format(dtf));
		
		
	}

}
