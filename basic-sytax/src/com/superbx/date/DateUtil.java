package com.superbx.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.superbx.core.lib.StringExDemo;

// 日期的工具类
public class DateUtil {
	
	private DateUtil(){}
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss E";
	public static void main(String[] args) {
		
		
		
		
	}
	
	//格式化操作，把Date类型转换成String类型
	public static String date2string(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (pattern == null || "".equals(pattern)) { // 如果传入的正则为空的话
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	//格式化操作
	public static String date2string(Date date) {
		return date2string(date, null);
	}
	
	//解析操作
	public static Date string2date(String date, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (pattern == null || "".equals(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(date);
	}
	//解析操作
	public static Date string2date(String date) throws ParseException {
		return string2date(date, null);
	}
}
