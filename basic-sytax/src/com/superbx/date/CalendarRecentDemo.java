package com.superbx.date;

import java.util.Calendar;
import java.util.Date;

/*
 * 需求：查询最近一周的时间
 */
public class CalendarRecentDemo {
	public static void main(String[] args) {
		Date current = new Date();
		Date endTime = null;//2017-12-13 00:00:00
		
		//把当前系统时间作为日历的时间
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		//把日增加一天，再把时分秒设置为0
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		endTime = c.getTime();
		
		c.add(Calendar.DAY_OF_MONTH, -7); //七天之前
		Date beginTime = c.getTime();
		System.out.println("开始时间： " + beginTime.toLocaleString());
		System.out.println("结束时间： " + endTime.toLocaleString());
	}
}
