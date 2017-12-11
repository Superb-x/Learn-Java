package com.superbx.date;

import java.util.Date;

/*
 * ÑİÊ¾java.util.dateÀà
 */
public class DateDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		Date d2 = new Date(System.currentTimeMillis()); // ºÁÃëÊı
		System.out.println(d2);
		System.out.println(new Date().getTime());
	}
}
