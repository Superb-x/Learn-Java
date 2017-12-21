package com.superbx.collection_frame;

import java.util.Vector;

//演示Vector类中的方法

@SuppressWarnings("all") //抑制编译器中所有的警告提示
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("A");                 
		v.addElement(new java.util.Date());
		v.addElement(123); //注意这里是不能存储基础类型数据的,这是Java高版本自动装箱了，这只是编译器的语法塘
		v.addElement(Integer.valueOf(123)); //底层是这样实现的
		System.out.println(v);
	}
}
