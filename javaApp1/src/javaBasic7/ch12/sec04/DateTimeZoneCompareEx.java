package javaBasic7.ch12.sec04;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeZoneCompareEx {

	public static void main(String[] args) {

		//���糯¥
		//Ư����¥
		LocalDateTime stD1 = LocalDateTime.of(2021, 1, 1, 0, 0);
		LocalDateTime stD2 = LocalDateTime.of(2021, 12, 31, 23, 59);
		LocalDateTime stD3 = LocalDateTime.of(2022, 12, 31, 23, 59);
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("������ "+ stD1.format(dtf));
		System.out.println("������ "+ stD2.format(dtf));
		
	
		if(stD1.isBefore(stD2)) {
			System.out.println("�̺�Ʈ �������Դϴ�");
			}else if(stD1.isEqual(stD2)) {
				System.out.println("�̺�Ʈ ���� �����մϴ�");
			}else {
				System.out.println("�̺�Ʈ �����߽��ϴ�. ������ȸ��");
			}
			
		
		//2023-12-20 12:00 ~ 12-25 11:59 
		// �̺�Ʈ �Ⱓ ���� 70% �̺�Ʈ ������ ���� 85% �̺�Ʈ ����
		LocalDateTime evS1 = LocalDateTime.of(2023, 12, 20, 12, 0);
		LocalDateTime evP1 = LocalDateTime.of(2023, 12, 25, 11, 59);
		LocalDateTime currentDate = LocalDateTime.now();
		if(currentDate.isBefore(evP1) && currentDate.isAfter(evS1)){
			System.out.println("�̺�Ʈ ���Դϴ� ���� 70%");
		}else if(currentDate.isEqual(evP1)) {
			System.out.println("�̺�Ʈ ������ ���� 85%");
		}else {
			System.out.println("�̺�Ʈ ����");
		}
		
		
		
		
		
		
		
		}
		
		
	}


