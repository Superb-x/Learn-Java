package com.superbx.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * 日期格式化类：这个类是个抽象类，无法创建实例
 * 日期格式化操作：
 * 		
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//格式化操作
		DateFormat df = DateFormat.getInstance(); // 这是个抽象类，无法实例化
		String time = df.format(d);
		System.out.println(time);
		
		df = DateFormat.getDateInstance(DateFormat.SHORT); // 静态成员，短风格，只显示年月日
		System.out.println(df.format(d));
		
		//解析操作，将一个String类型的时间 ---> Date类型
		df = DateFormat.getInstance();
		time = df.format(d);
		Date d2 = df.parse(time);
		System.out.println(d2);
		
	}
}
