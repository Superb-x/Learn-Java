package com.superbx.generic;

public class PointDemo {
	//ʹ��String������
	Point<String> p1 = new Point<String>();
	
	//���һ��ʹ��String����
	String x1 = p1.getX();
	
	//�������ʹ��int����
	Point<Integer> p2 = new Point<Integer>();
	Integer x2 = p2.getX();
}
