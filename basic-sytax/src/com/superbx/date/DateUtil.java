package com.superbx.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.superbx.core.lib.StringExDemo;

// ���ڵĹ�����
public class DateUtil {
	
	private DateUtil(){}
	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss E";
	public static void main(String[] args) {
		
		
		
		
	}
	
	//��ʽ����������Date����ת����String����
	public static String date2string(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (pattern == null || "".equals(pattern)) { // ������������Ϊ�յĻ�
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	//��ʽ������
	public static String date2string(Date date) {
		return date2string(date, null);
	}
	
	//��������
	public static Date string2date(String date, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (pattern == null || "".equals(pattern)) {
			pattern = DEFAULT_DATE_PATTERN;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(date);
	}
	//��������
	public static Date string2date(String date) throws ParseException {
		return string2date(date, null);
	}
}
