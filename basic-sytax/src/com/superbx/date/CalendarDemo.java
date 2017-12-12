package com.superbx.date;

import java.util.Calendar;
import java.util.Date;

// 日历类的demo
public class CalendarDemo {
	public static void main(String[] args) {
		//创建日历对象
		Calendar c = Calendar.getInstance();
		System.out.println("年 = " + c.get(Calendar.YEAR));
		System.out.println("月 = " + c.get(Calendar.MONTH));
		System.out.println("日 = " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("时 = " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("分 = " + c.get(Calendar.MINUTE));
		System.out.println("秒 = " + c.get(Calendar.SECOND));
		System.out.println("周 = " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("星期天 = " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		c.add(Calendar.YEAR, -1000); // 算时间偏移的时候要用
		Date d = c.getTime();
		System.out.println(d);
	}
}
