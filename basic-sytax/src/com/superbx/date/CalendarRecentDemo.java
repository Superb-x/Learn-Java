package com.superbx.date;

import java.util.Calendar;
import java.util.Date;

/*
 * ���󣺲�ѯ���һ�ܵ�ʱ��
 */
public class CalendarRecentDemo {
	public static void main(String[] args) {
		Date current = new Date();
		Date endTime = null;//2017-12-13 00:00:00
		
		//�ѵ�ǰϵͳʱ����Ϊ������ʱ��
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//��������һ�죬�ٰ�ʱ��������Ϊ0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		endTime = c.getTime();
		
		c.add(Calendar.DAY_OF_MONTH, -7); //����֮ǰ
		Date beginTime = c.getTime();
		System.out.println("��ʼʱ�䣺 " + beginTime.toLocaleString());
		System.out.println("����ʱ�䣺 " + endTime.toLocaleString());
	}
}
