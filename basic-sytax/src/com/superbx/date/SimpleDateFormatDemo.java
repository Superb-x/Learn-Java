package com.superbx.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		// �Զ������ڵ�ģʽ
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		//��ʽ��
		String time = sdf.format(new Date());
		System.out.println(time);
		
		//����
		Date d = sdf.parse(time);
		
		System.out.println(d);
	}
}
