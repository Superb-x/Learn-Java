package com.superbx.date;

import java.util.Calendar;
import java.util.Date;

// �������demo
public class CalendarDemo {
	public static void main(String[] args) {
		//������������
		Calendar c = Calendar.getInstance();
		System.out.println("�� = " + c.get(Calendar.YEAR));
		System.out.println("�� = " + c.get(Calendar.MONTH));
		System.out.println("�� = " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("ʱ = " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� = " + c.get(Calendar.MINUTE));
		System.out.println("�� = " + c.get(Calendar.SECOND));
		System.out.println("�� = " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("������ = " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		c.add(Calendar.YEAR, -1000); // ��ʱ��ƫ�Ƶ�ʱ��Ҫ��
		Date d = c.getTime();
		System.out.println(d);
	}
}