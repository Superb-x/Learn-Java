package com.superbx.date;

import java.util.Date;

/*
 * ��ʾjava.util.date��
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date(System.currentTimeMillis()); // ������
		System.out.println(d2);
		System.out.println(new Date().getTime());
	}
}
