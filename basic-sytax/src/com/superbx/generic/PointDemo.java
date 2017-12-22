package com.superbx.generic;

public class PointDemo {
	//使用String的类型
	Point<String> p1 = new Point<String>();
	
	//情况一：使用String类型
	String x1 = p1.getX();
	
	//情况二：使用int类型
	Point<Integer> p2 = new Point<Integer>();
	Integer x2 = p2.getX();
}
