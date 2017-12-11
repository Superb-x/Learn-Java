package com.superbx.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * ���ڸ�ʽ���ࣺ������Ǹ������࣬�޷�����ʵ��
 * ���ڸ�ʽ��������
 * 		
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		//��ʽ������
		DateFormat df = DateFormat.getInstance(); // ���Ǹ������࣬�޷�ʵ����
		String time = df.format(d);
		System.out.println(time);
		
		df = DateFormat.getDateInstance(DateFormat.SHORT); // ��̬��Ա���̷��ֻ��ʾ������
		System.out.println(df.format(d));
		
		//������������һ��String���͵�ʱ�� ---> Date����
		df = DateFormat.getInstance();
		time = df.format(d);
		Date d2 = df.parse(time);
		System.out.println(d2);
		
	}
}
