package com.superbx.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// 自定义日期的模式
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		//格式化
		String time = sdf.format(new Date());
		System.out.println(time);
		
		//解析
		Date d = sdf.parse(time);
		
		System.out.println(d);
	}
}
