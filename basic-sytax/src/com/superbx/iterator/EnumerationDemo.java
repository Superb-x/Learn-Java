package com.superbx.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		
		Enumeration e = v.elements(); //这是很古老的一个迭代器
		while(e.hasMoreElements()) {
			Object ele = e.nextElement();
			System.out.println(ele);
		}
	}
}
